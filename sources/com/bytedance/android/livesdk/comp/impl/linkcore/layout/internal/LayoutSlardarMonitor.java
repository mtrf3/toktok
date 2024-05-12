package com.bytedance.android.livesdk.comp.impl.linkcore.layout.internal;

import X.C0K2;
import X.C76699U8h;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.RunnableC76715U8x;
import X.U8Y;
import X.UPJ;
import X.WM7;
import X.X1D;
import Y.ARunnableS10S1300000_13;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicLayoutSlardarCombineSetting;
import defpackage.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class LayoutSlardarMonitor {
    public final U8Y LIZ;
    public long LIZIZ;
    public String LIZJ = "";
    public String LIZLLL = "";
    public long LJ = -1;
    public int LJFF;

    /* loaded from: classes12.dex */
    public static final class BizWindow {

        @InterfaceC65349Pkn("audio_mute")
        public final int audioStatus;

        @InterfaceC65349Pkn("h")
        public final int h;

        @InterfaceC65349Pkn("linkmic_id")
        public final String linkMicId;

        @InterfaceC65349Pkn("logic_pos")
        public final int logicPos;

        @InterfaceC65349Pkn("type")
        public final int type;

        @InterfaceC65349Pkn("ui_pos")
        public final int uiPos;

        @InterfaceC65349Pkn("uid")
        public final long uid;

        @InterfaceC65349Pkn("video_mute")
        public final int videoStatus;

        @InterfaceC65349Pkn("w")
        public final int w;

        @InterfaceC65349Pkn("x")
        public final int x;

        @InterfaceC65349Pkn("y")
        public final int y;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public BizWindow() {
            /*
                r15 = this;
                r1 = 0
                r2 = 0
                r4 = 0
                r13 = 2047(0x7ff, float:2.868E-42)
                r0 = r15
                r5 = r1
                r6 = r1
                r7 = r1
                r8 = r1
                r9 = r1
                r10 = r1
                r11 = r1
                r12 = r1
                r14 = r4
                r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.linkcore.layout.internal.LayoutSlardarMonitor.BizWindow.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BizWindow)) {
                return false;
            }
            BizWindow bizWindow = (BizWindow) obj;
            return this.type == bizWindow.type && this.uid == bizWindow.uid && o.LJ(this.linkMicId, bizWindow.linkMicId) && this.uiPos == bizWindow.uiPos && this.logicPos == bizWindow.logicPos && this.audioStatus == bizWindow.audioStatus && this.videoStatus == bizWindow.videoStatus && this.x == bizWindow.x && this.y == bizWindow.y && this.w == bizWindow.w && this.h == bizWindow.h;
        }

        public final int hashCode() {
            return ((((((((((((((C79062V1e.LJ(this.linkMicId, JBR.LIZJ(this.uid, this.type * 31, 31), 31) + this.uiPos) * 31) + this.logicPos) * 31) + this.audioStatus) * 31) + this.videoStatus) * 31) + this.x) * 31) + this.y) * 31) + this.w) * 31) + this.h;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BizWindow(type=");
            sb.append(this.type);
            sb.append(", uid=");
            sb.append(this.uid);
            sb.append(", linkMicId=");
            sb.append(this.linkMicId);
            sb.append(", uiPos=");
            sb.append(this.uiPos);
            sb.append(", logicPos=");
            sb.append(this.logicPos);
            sb.append(", audioStatus=");
            sb.append(this.audioStatus);
            sb.append(", videoStatus=");
            sb.append(this.videoStatus);
            sb.append(", x=");
            sb.append(this.x);
            sb.append(", y=");
            sb.append(this.y);
            sb.append(", w=");
            sb.append(this.w);
            sb.append(", h=");
            return UPJ.LIZLLL(sb, this.h, ')');
        }

        public BizWindow(int i, long j, String linkMicId, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            o.LJIIIZ(linkMicId, "linkMicId");
            this.type = i;
            this.uid = j;
            this.linkMicId = linkMicId;
            this.uiPos = i2;
            this.logicPos = i3;
            this.audioStatus = i4;
            this.videoStatus = i5;
            this.x = i6;
            this.y = i7;
            this.w = i8;
            this.h = i9;
        }

        public /* synthetic */ BizWindow(int i, long j, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? -1 : i, (i10 & 2) != 0 ? -1L : j, (i10 & 4) != 0 ? "" : str, (i10 & 8) != 0 ? -1 : i2, (i10 & 16) != 0 ? -1 : i3, (i10 & 32) != 0 ? -1 : i4, (i10 & 64) != 0 ? -1 : i5, (i10 & 128) != 0 ? -1 : i6, (i10 & 256) != 0 ? -1 : i7, (i10 & 512) != 0 ? -1 : i8, (i10 & 1024) == 0 ? i9 : -1);
        }
    }

    /* loaded from: classes12.dex */
    public static final class Container {

        @InterfaceC65349Pkn("h")
        public final int h;

        @InterfaceC65349Pkn("w")
        public final int w;

        @InterfaceC65349Pkn("x")
        public final int x;

        @InterfaceC65349Pkn("y")
        public final int y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Container() {
            /*
                r7 = this;
                r1 = 0
                r5 = 15
                r6 = 0
                r0 = r7
                r2 = r1
                r3 = r1
                r4 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.linkcore.layout.internal.LayoutSlardarMonitor.Container.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Container)) {
                return false;
            }
            Container container = (Container) obj;
            return this.x == container.x && this.y == container.y && this.w == container.w && this.h == container.h;
        }

        public final int hashCode() {
            return (((((this.x * 31) + this.y) * 31) + this.w) * 31) + this.h;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Container(x=");
            LIZ.append(this.x);
            LIZ.append(", y=");
            LIZ.append(this.y);
            LIZ.append(", w=");
            LIZ.append(this.w);
            LIZ.append(", h=");
            return b0.LIZJ(LIZ, this.h, ')', LIZ);
        }

        public Container(int i, int i2, int i3, int i4) {
            this.x = i;
            this.y = i2;
            this.w = i3;
            this.h = i4;
        }

        public /* synthetic */ Container(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? -1 : i, (i5 & 2) != 0 ? -1 : i2, (i5 & 4) != 0 ? -1 : i3, (i5 & 8) != 0 ? -1 : i4);
        }
    }

    /* loaded from: classes9.dex */
    public static final class Player {

        @InterfaceC65349Pkn("excepted_h")
        public final int exceptedH;

        @InterfaceC65349Pkn("excepted_w")
        public final int exceptedW;

        @InterfaceC65349Pkn("excepted_x")
        public final int exceptedX;

        @InterfaceC65349Pkn("excepted_y")
        public final int exceptedY;

        @InterfaceC65349Pkn("origin_h")
        public final int originH;

        @InterfaceC65349Pkn("origin_w")
        public final int originW;

        @InterfaceC65349Pkn("real_h")
        public final int realH;

        @InterfaceC65349Pkn("real_w")
        public final int realW;

        @InterfaceC65349Pkn("real_x")
        public final int realX;

        @InterfaceC65349Pkn("real_y")
        public final int realY;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Player() {
            /*
                r13 = this;
                r1 = 0
                r11 = 1023(0x3ff, float:1.434E-42)
                r12 = 0
                r0 = r13
                r2 = r1
                r3 = r1
                r4 = r1
                r5 = r1
                r6 = r1
                r7 = r1
                r8 = r1
                r9 = r1
                r10 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.linkcore.layout.internal.LayoutSlardarMonitor.Player.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Player)) {
                return false;
            }
            Player player = (Player) obj;
            return this.originW == player.originW && this.originH == player.originH && this.exceptedX == player.exceptedX && this.exceptedY == player.exceptedY && this.exceptedW == player.exceptedW && this.exceptedH == player.exceptedH && this.realX == player.realX && this.realY == player.realY && this.realW == player.realW && this.realH == player.realH;
        }

        public final int hashCode() {
            return (((((((((((((((((this.originW * 31) + this.originH) * 31) + this.exceptedX) * 31) + this.exceptedY) * 31) + this.exceptedW) * 31) + this.exceptedH) * 31) + this.realX) * 31) + this.realY) * 31) + this.realW) * 31) + this.realH;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Player(originW=");
            LIZ.append(this.originW);
            LIZ.append(", originH=");
            LIZ.append(this.originH);
            LIZ.append(", exceptedX=");
            LIZ.append(this.exceptedX);
            LIZ.append(", exceptedY=");
            LIZ.append(this.exceptedY);
            LIZ.append(", exceptedW=");
            LIZ.append(this.exceptedW);
            LIZ.append(", exceptedH=");
            LIZ.append(this.exceptedH);
            LIZ.append(", realX=");
            LIZ.append(this.realX);
            LIZ.append(", realY=");
            LIZ.append(this.realY);
            LIZ.append(", realW=");
            LIZ.append(this.realW);
            LIZ.append(", realH=");
            return b0.LIZJ(LIZ, this.realH, ')', LIZ);
        }

        public Player(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            this.originW = i;
            this.originH = i2;
            this.exceptedX = i3;
            this.exceptedY = i4;
            this.exceptedW = i5;
            this.exceptedH = i6;
            this.realX = i7;
            this.realY = i8;
            this.realW = i9;
            this.realH = i10;
        }

        public /* synthetic */ Player(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? -1 : i, (i11 & 2) != 0 ? -1 : i2, (i11 & 4) != 0 ? -1 : i3, (i11 & 8) != 0 ? -1 : i4, (i11 & 16) != 0 ? -1 : i5, (i11 & 32) != 0 ? -1 : i6, (i11 & 64) != 0 ? -1 : i7, (i11 & 128) != 0 ? -1 : i8, (i11 & 256) != 0 ? -1 : i9, (i11 & 512) == 0 ? i10 : -1);
        }
    }

    /* loaded from: classes12.dex */
    public static final class Window {

        @InterfaceC65349Pkn("h")
        public final int h;

        @InterfaceC65349Pkn("pos")
        public final int pos;

        @InterfaceC65349Pkn("w")
        public final int w;

        @InterfaceC65349Pkn("x")
        public final int x;

        @InterfaceC65349Pkn("y")
        public final int y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Window() {
            /*
                r8 = this;
                r1 = 0
                r6 = 31
                r7 = 0
                r0 = r8
                r2 = r1
                r3 = r1
                r4 = r1
                r5 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.linkcore.layout.internal.LayoutSlardarMonitor.Window.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Window)) {
                return false;
            }
            Window window = (Window) obj;
            return this.pos == window.pos && this.x == window.x && this.y == window.y && this.w == window.w && this.h == window.h;
        }

        public final int hashCode() {
            return (((((((this.pos * 31) + this.x) * 31) + this.y) * 31) + this.w) * 31) + this.h;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Window(pos=");
            LIZ.append(this.pos);
            LIZ.append(", x=");
            LIZ.append(this.x);
            LIZ.append(", y=");
            LIZ.append(this.y);
            LIZ.append(", w=");
            LIZ.append(this.w);
            LIZ.append(", h=");
            return b0.LIZJ(LIZ, this.h, ')', LIZ);
        }

        public Window(int i, int i2, int i3, int i4, int i5) {
            this.pos = i;
            this.x = i2;
            this.y = i3;
            this.w = i4;
            this.h = i5;
        }

        public /* synthetic */ Window(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this((i6 & 1) != 0 ? -1 : i, (i6 & 2) != 0 ? -1 : i2, (i6 & 4) != 0 ? -1 : i3, (i6 & 8) != 0 ? -1 : i4, (i6 & 16) != 0 ? -1 : i5);
        }
    }

    public LayoutSlardarMonitor(U8Y u8y) {
        this.LIZ = u8y;
    }

    public static void LIZLLL(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            C0K2.LIZ("LayoutSlardarMonitor Error", th);
        }
    }

    public final JSONObject LIZ(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        int i = this.LIZ.LJ;
        if (i == 4) {
            str2 = "multi-guest";
        } else if (i == 2) {
            str2 = "multi-host";
        } else {
            str2 = "";
        }
        jSONObject.put("event_id", str);
        jSONObject.put("uid", this.LIZ.LIZ);
        jSONObject.put("linkmic_id", this.LIZ.LIZIZ.invoke());
        jSONObject.put("room_id", this.LIZ.LIZLLL);
        jSONObject.put("live_type", this.LIZ.LJFF);
        jSONObject.put("channel_id", this.LJ);
        jSONObject.put("role", this.LIZ.LIZJ.invoke());
        jSONObject.put(WM7.SCENE_SERVICE, str2);
        jSONObject.put("source", this.LIZ.LJII);
        jSONObject.put("layout_change_times", this.LIZIZ);
        jSONObject.put("layout_version", this.LJFF);
        jSONObject.put("to_layout_id", this.LIZJ);
        jSONObject.put("layout_data", this.LIZLLL);
        return jSONObject;
    }

    public final void LIZJ(ViewGroup.LayoutParams layoutParams, List<C76699U8h> windowList, String hash) {
        Container container;
        o.LJIIIZ(windowList, "windowList");
        o.LJIIIZ(hash, "hash");
        if (!LivesdkLinkmicLayoutSlardarCombineSetting.INSTANCE.isLayoutMeasureReportEnable()) {
            return;
        }
        int i = 0;
        new Container(i, i, i, i, 15, null);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            container = new Container(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, layoutParams.width, layoutParams.height);
        } else {
            container = new Container(i, i, i, i, 15, null);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) windowList).iterator();
        while (it.hasNext()) {
            C76699U8h c76699U8h = (C76699U8h) it.next();
            int i2 = c76699U8h.LJLIL;
            Rect rect = c76699U8h.LJLJL;
            arrayList.add(new Window(i2, rect.left, rect.top, rect.width(), c76699U8h.LJLJL.height()));
        }
        LIZLLL(new ARunnableS10S1300000_13(this, container, arrayList, hash, 2));
    }

    public final void LIZIZ(boolean z, Long l, String guestLinkMicId, Integer num, Integer num2, boolean z2, String hash) {
        o.LJIIIZ(guestLinkMicId, "guestLinkMicId");
        o.LJIIIZ(hash, "hash");
        LIZLLL(new RunnableC76715U8x(this, z, l, guestLinkMicId, num, num2, hash, z2));
    }
}
