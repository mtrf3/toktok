package com.ss.android.vesdk.algorithm;

/* loaded from: classes17.dex */
public class SceneDetectInfo {
    public int choose;
    public SceneDetectItem[] mSceneDetectItems;

    public int getChoose() {
        return this.choose;
    }

    public SceneDetectItem[] getSceneDetectItems() {
        return this.mSceneDetectItems;
    }

    public void setChoose(int i) {
        this.choose = i;
    }

    public void setSceneDetectItems(SceneDetectItem[] sceneDetectItemArr) {
        this.mSceneDetectItems = sceneDetectItemArr;
    }
}
