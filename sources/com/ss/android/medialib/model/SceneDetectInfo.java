package com.ss.android.medialib.model;

/* loaded from: classes16.dex */
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
