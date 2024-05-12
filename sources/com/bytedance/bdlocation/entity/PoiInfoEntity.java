package com.bytedance.bdlocation.entity;

/* loaded from: classes9.dex */
public class PoiInfoEntity implements Comparable<PoiInfoEntity> {
    public String AmapID;
    public String AwemeID;
    public float Confidence;
    public float Distance;
    public String LocationID;
    public String Name;
    public String Source;
    public String Typecode;

    @Override // java.lang.Comparable
    public int compareTo(PoiInfoEntity poiInfoEntity) {
        return Float.compare(poiInfoEntity.Confidence, this.Confidence);
    }
}
