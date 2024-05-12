package com.bytedance.vcloud.networkpredictor;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class SpeedPredictorRecord {
    public String mFileId = "";
    public ArrayList<SpeedPredictorRecordItem> mSpeedRecordItems;

    public String getFileId() {
        return this.mFileId;
    }

    public ArrayList<SpeedPredictorRecordItem> getSpeedRecordItems() {
        return this.mSpeedRecordItems;
    }

    public void extractFields(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.mFileId = jSONObject.optString("stream_id");
        JSONArray optJSONArray = jSONObject.optJSONArray("downinfo");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            this.mSpeedRecordItems = new ArrayList<>();
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(optJSONArray, i);
                    SpeedPredictorRecordItem speedPredictorRecordItem = new SpeedPredictorRecordItem();
                    speedPredictorRecordItem.extractFields(jSONObject2);
                    this.mSpeedRecordItems.add(speedPredictorRecordItem);
                } catch (Exception e) {
                    throw e;
                }
            }
        }
    }

    public void setFileId(String str) {
        this.mFileId = str;
    }

    public void setSpeedRecordItems(ArrayList<SpeedPredictorRecordItem> arrayList) {
        this.mSpeedRecordItems = arrayList;
    }
}
