package com.ss.android.ugc.aweme.canvas;

import X.C163546bO;
import X.GX2;
import X.InterfaceC36436ERs;
import X.InterfaceC43620HAa;
import X.ORZ;
import X.X1D;
import defpackage.b0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class CanvasVideoData implements Serializable {
    public static final C163546bO Companion = new Object() { // from class: X.6bO
    };
    public List<CanvasFilterParam> _transformList;

    @GX2
    @InterfaceC43620HAa
    public final List<String> auditFrames;
    public final CanvasBackground background;
    public final int canvasType;
    public List<CanvasVideoData> externalTracks;
    public CanvasExtra extra;
    public int originVideoAIGCLabelType;

    @InterfaceC36436ERs
    @InterfaceC43620HAa(blockCreative = true)
    public List<String> sourceInfo;

    public CanvasVideoData() {
        this(null, null, null, null, 0, null, 0, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CanvasVideoData copy$default(CanvasVideoData canvasVideoData, List list, List list2, CanvasBackground canvasBackground, CanvasExtra canvasExtra, int i, List list3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = canvasVideoData.sourceInfo;
        }
        if ((i3 & 2) != 0) {
            list2 = canvasVideoData.auditFrames;
        }
        if ((i3 & 4) != 0) {
            canvasBackground = canvasVideoData.background;
        }
        if ((i3 & 8) != 0) {
            canvasExtra = canvasVideoData.extra;
        }
        if ((i3 & 16) != 0) {
            i = canvasVideoData.canvasType;
        }
        if ((i3 & 32) != 0) {
            list3 = canvasVideoData.externalTracks;
        }
        if ((i3 & 64) != 0) {
            i2 = canvasVideoData.originVideoAIGCLabelType;
        }
        return canvasVideoData.copy(list, list2, canvasBackground, canvasExtra, i, list3, i2);
    }

    public final CanvasVideoData copy(List<String> list, List<String> list2, CanvasBackground background, CanvasExtra canvasExtra, int i, List<CanvasVideoData> list3, int i2) {
        o.LJIIIZ(background, "background");
        return new CanvasVideoData(list, list2, background, canvasExtra, i, list3, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CanvasVideoData)) {
            return false;
        }
        CanvasVideoData canvasVideoData = (CanvasVideoData) obj;
        return o.LJ(this.sourceInfo, canvasVideoData.sourceInfo) && o.LJ(this.auditFrames, canvasVideoData.auditFrames) && o.LJ(this.background, canvasVideoData.background) && o.LJ(this.extra, canvasVideoData.extra) && this.canvasType == canvasVideoData.canvasType && o.LJ(this.externalTracks, canvasVideoData.externalTracks) && this.originVideoAIGCLabelType == canvasVideoData.originVideoAIGCLabelType;
    }

    public int hashCode() {
        List<String> list = this.sourceInfo;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.auditFrames;
        int hashCode2 = (this.background.hashCode() + ((hashCode + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
        CanvasExtra canvasExtra = this.extra;
        int hashCode3 = (((hashCode2 + (canvasExtra == null ? 0 : canvasExtra.hashCode())) * 31) + this.canvasType) * 31;
        List<CanvasVideoData> list3 = this.externalTracks;
        return ((hashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31) + this.originVideoAIGCLabelType;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CanvasVideoData(sourceInfo=");
        LIZ.append(this.sourceInfo);
        LIZ.append(", auditFrames=");
        LIZ.append(this.auditFrames);
        LIZ.append(", background=");
        LIZ.append(this.background);
        LIZ.append(", extra=");
        LIZ.append(this.extra);
        LIZ.append(", canvasType=");
        LIZ.append(this.canvasType);
        LIZ.append(", externalTracks=");
        LIZ.append(this.externalTracks);
        LIZ.append(", originVideoAIGCLabelType=");
        return b0.LIZJ(LIZ, this.originVideoAIGCLabelType, ')', LIZ);
    }

    public final List<String> getAuditFrames() {
        return this.auditFrames;
    }

    public final CanvasBackground getBackground() {
        return this.background;
    }

    public final int getCanvasType() {
        return this.canvasType;
    }

    public final List<CanvasVideoData> getExternalTracks() {
        return this.externalTracks;
    }

    public final CanvasExtra getExtra() {
        return this.extra;
    }

    public final int getOriginVideoAIGCLabelType() {
        return this.originVideoAIGCLabelType;
    }

    public final List<String> getSourceInfo() {
        return this.sourceInfo;
    }

    public final List<CanvasFilterParam> getTransformList() {
        return this._transformList;
    }

    public final CanvasFilterParam getClipTransform(int i) {
        List<CanvasFilterParam> transformList = getTransformList();
        CanvasFilterParam canvasFilterParam = null;
        if (transformList == null) {
            return null;
        }
        Iterator<CanvasFilterParam> it = transformList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            CanvasFilterParam next = it.next();
            if (next.getClipIndex() == i) {
                canvasFilterParam = next;
                break;
            }
        }
        return canvasFilterParam;
    }

    public final void putTransform(CanvasFilterParam canvasFilterParam) {
        if (canvasFilterParam == null) {
            return;
        }
        if (this._transformList == null) {
            this._transformList = new ArrayList();
        }
        List<CanvasFilterParam> list = this._transformList;
        if (list != null) {
            list.add(canvasFilterParam);
        }
    }

    public final void setExternalTracks(List<CanvasVideoData> list) {
        this.externalTracks = list;
    }

    public final void setExtra(CanvasExtra canvasExtra) {
        this.extra = canvasExtra;
    }

    public final void setOriginVideoAIGCLabelType(int i) {
        this.originVideoAIGCLabelType = i;
    }

    public final void setSourceInfo(List<String> list) {
        this.sourceInfo = list;
    }

    public final void updateTransform(int i, CanvasFilterParam param) {
        CanvasFilterParam canvasFilterParam;
        o.LJIIIZ(param, "param");
        if (this._transformList == null) {
            this._transformList = new ArrayList();
        }
        List<CanvasFilterParam> list = this._transformList;
        if (list == null || ORZ.LJLLLLLL(i, list) == null) {
            List<CanvasFilterParam> list2 = this._transformList;
            if (list2 != null) {
                list2.add(param);
                return;
            }
            return;
        }
        List<CanvasFilterParam> list3 = this._transformList;
        if (list3 == null || (canvasFilterParam = (CanvasFilterParam) ORZ.LJLLLLLL(i, list3)) == null) {
            return;
        }
        canvasFilterParam.setScaleFactor(param.getScaleFactor());
        canvasFilterParam.setDegree(param.getDegree());
        canvasFilterParam.setTransX(param.getTransX());
        canvasFilterParam.setTransY(param.getTransY());
    }

    public CanvasVideoData(List<String> list, List<String> list2, CanvasBackground background, CanvasExtra canvasExtra, int i, List<CanvasVideoData> list3, int i2) {
        o.LJIIIZ(background, "background");
        this.sourceInfo = list;
        this.auditFrames = list2;
        this.background = background;
        this.extra = canvasExtra;
        this.canvasType = i;
        this.externalTracks = list3;
        this.originVideoAIGCLabelType = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CanvasVideoData(java.util.List r9, java.util.List r10, com.ss.android.ugc.aweme.canvas.CanvasBackground r11, com.ss.android.ugc.aweme.canvas.CanvasExtra r12, int r13, java.util.List r14, int r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r2 = r10
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r15
            r0 = r16 & 1
            if (r0 == 0) goto Lf
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        Lf:
            r0 = r16 & 2
            r6 = 0
            if (r0 == 0) goto L15
            r2 = r6
        L15:
            r0 = r16 & 4
            if (r0 == 0) goto L20
            X.5ij r0 = com.ss.android.ugc.aweme.canvas.CanvasBackground.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.canvas.CanvasBackground r3 = com.ss.android.ugc.aweme.canvas.CanvasBackground.DEFAULT_BACKGROUND
        L20:
            r0 = r16 & 8
            if (r0 == 0) goto L25
            r4 = r6
        L25:
            r0 = r16 & 16
            if (r0 == 0) goto L2a
            r5 = 0
        L2a:
            r0 = r16 & 32
            if (r0 == 0) goto L38
        L2e:
            r0 = r16 & 64
            if (r0 == 0) goto L33
            r7 = 0
        L33:
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L38:
            r6 = r14
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.canvas.CanvasVideoData.<init>(java.util.List, java.util.List, com.ss.android.ugc.aweme.canvas.CanvasBackground, com.ss.android.ugc.aweme.canvas.CanvasExtra, int, java.util.List, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
