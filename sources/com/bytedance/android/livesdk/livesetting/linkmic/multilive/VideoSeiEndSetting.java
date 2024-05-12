package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C47261Igj;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class VideoSeiEndSetting {

    @InterfaceC65349Pkn("enable_no_parse_sei_end_layout")
    public int enableNoParseSeiEndLayout;

    @InterfaceC65349Pkn("end_layout_scene")
    public ArrayList<String> enableSceneList;

    @InterfaceC65349Pkn("enable_video_sei")
    public int enableVideoSei;

    @InterfaceC65349Pkn("enable_video_sei_end_layout")
    public int enableVideoSeiEndLayout;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoSeiEndSetting() {
        /*
            r7 = this;
            r1 = 0
            r4 = 0
            r5 = 15
            r0 = r7
            r2 = r1
            r3 = r1
            r6 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.multilive.VideoSeiEndSetting.<init>():void");
    }

    public VideoSeiEndSetting(int i, int i2, int i3, ArrayList<String> enableSceneList) {
        o.LJIIIZ(enableSceneList, "enableSceneList");
        this.enableVideoSei = i;
        this.enableVideoSeiEndLayout = i2;
        this.enableNoParseSeiEndLayout = i3;
        this.enableSceneList = enableSceneList;
    }

    public /* synthetic */ VideoSeiEndSetting(int i, int i2, int i3, ArrayList arrayList, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 1 : i, (i4 & 2) != 0 ? 1 : i2, (i4 & 4) != 0 ? 1 : i3, (i4 & 8) != 0 ? new ArrayList(C47261Igj.LJJIJIIJI("video", "live_studio")) : arrayList);
    }
}
