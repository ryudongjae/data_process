package com.ryudj.chartSys.metadata.ht;
/**
 실시간 집계 시스템은 판매량이 저장되는 데이터에서 일정 시간마다 가져가는 것이 좋다?
 제휴 업체를 정하고 가맹점 정보가 없다면 실시간에서는 어떤 방식으로 대응 할것인가
 가맹점 정보가 없다면 차트에 반영을 하지 않는게 맞는가
 바코드가 중복된다면 하나만 성립시키고 바코드는 무조건 유일한 값이어야한다.
 opVal(OperationValue)가 중복된다면 중복되는 데이터는 적용되지 않는다.
 필수값에 null이 있다면 예외를 던진다.
 만약 집계를 했는데 변동 사항이 없다면 그냥 배치를 끝내버려도 ㄱㅊ?
 굳이 불필요한 작업이 존재할 이유가 없다.
 만약 실시간 반영을 생각한다면 들어오는 즉시 검증을 하고 반영한다
 혹시나 많은 데이터가 한번에 들어온다면 쌓아서 bulkWrite 해주는 방법도 있음
 그냥 쿼리에서 거를수 있는건 다 걸러버리는게 좋을듯
 
 */
public class HtMeta {

    private int idx;
    private String name;
    private MetaRelation relation;

}
