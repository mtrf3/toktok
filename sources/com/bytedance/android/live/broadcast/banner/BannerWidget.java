package com.bytedance.android.live.broadcast.banner;

import X.BCX;
import X.C05300Is;
import X.C0NB;
import X.C25240yu;
import X.C25260yw;
import X.C30554Byw;
import X.C30922CBq;
import X.InterfaceC30442Bx8;
import X.X1D;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public abstract class BannerWidget extends PreviewWidget {
    public C25260yw LJLJI;
    public String LJLJJI = "null";
    public int LJLJJL = Integer.MAX_VALUE;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public LiveMode LJLJLJ;

    public abstract String LL();

    public void LLFF() {
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void onShow() {
        String str;
        if (this.LJLJL) {
            String str2 = this.LJLJJI;
            C25260yw c25260yw = this.LJLJI;
            if (c25260yw != null) {
                str = c25260yw.LJII;
            } else {
                str = null;
            }
            if (!o.LJ(str2, str) || o.LJ(this.LJLJJI, "null") || o.LJ(this.LJLJJI, "else")) {
                return;
            }
            if (C30922CBq.LIZIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("add banner ");
                LIZ.append(this.LJLJJI);
                LIZ.append(' ');
                LIZ.append(LL());
                C0NB.LIZ(X1D.LIZIZ(LIZ));
            }
            C25260yw c25260yw2 = this.LJLJI;
            if (c25260yw2 == null || !c25260yw2.LJI) {
                return;
            }
            Iterator<C25240yu> it = c25260yw2.LIZJ.iterator();
            while (it.hasNext()) {
                if (o.LJ(it.next().LIZIZ, this)) {
                    return;
                }
            }
            C25240yu LIZ2 = c25260yw2.LIZ(this);
            if (LIZ2 == null) {
                return;
            }
            c25260yw2.LIZJ.add(LIZ2);
            c25260yw2.LIZLLL(true);
            if (c25260yw2.LIZLLL.contains(LIZ2)) {
                return;
            }
            LIZ2.LIZIZ.LLF(false);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void show() {
        String str;
        if (this.LJLJL) {
            if (this.LJLJJL != Integer.MAX_VALUE) {
                C30554Byw<String> c30554Byw = InterfaceC30442Bx8.S0;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.LJLJJI);
                LIZ.append(LL());
                String LIZIZ = c30554Byw.LIZIZ(X1D.LIZIZ(LIZ));
                if (LIZIZ != null && this.LJLJJL <= CastIntegerProtector.parseInt(LIZIZ)) {
                    return;
                }
            }
            if (this.LJLJJLL) {
                C30554Byw<String> c30554Byw2 = InterfaceC30442Bx8.R0;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(this.LJLJJI);
                LIZ2.append(LL());
                String LIZIZ2 = c30554Byw2.LIZIZ(X1D.LIZIZ(LIZ2));
                if (LIZIZ2 != null) {
                    long j = 1000;
                    long currentTimeMillis = System.currentTimeMillis() / j;
                    long parseLong = CastLongProtector.parseLong(LIZIZ2) / j;
                    if (currentTimeMillis - ((TimeZone.getDefault().getRawOffset() + currentTimeMillis) % 86400) < (parseLong - ((TimeZone.getDefault().getRawOffset() + parseLong) % 86400)) + 86400) {
                        return;
                    }
                }
            }
            String str2 = this.LJLJJI;
            C25260yw c25260yw = this.LJLJI;
            if (c25260yw != null) {
                str = c25260yw.LJII;
            } else {
                str = null;
            }
            if (!o.LJ(str2, str) || o.LJ(this.LJLJJI, "null") || o.LJ(this.LJLJJI, "else")) {
                return;
            }
            if (C30922CBq.LIZIZ) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("try to add banner ");
                LIZ3.append(this.LJLJJI);
                LIZ3.append(' ');
                LIZ3.append(LL());
                C0NB.LIZ(X1D.LIZIZ(LIZ3));
            }
            C25260yw c25260yw2 = this.LJLJI;
            if (c25260yw2 == null || !c25260yw2.LJI) {
                return;
            }
            Iterator<C25240yu> it = c25260yw2.LIZJ.iterator();
            while (it.hasNext()) {
                if (o.LJ(it.next().LIZIZ, this)) {
                    return;
                }
            }
            C25240yu LIZ4 = c25260yw2.LIZ(this);
            if (LIZ4 == null) {
                return;
            }
            Object clone = c25260yw2.LIZJ.clone();
            o.LJIIIIZZ(clone, "wannaShowSet.clone()");
            Object clone2 = c25260yw2.LIZLLL.clone();
            o.LJIIIIZZ(clone2, "shownSet.clone()");
            c25260yw2.LIZJ.add(LIZ4);
            c25260yw2.LIZLLL(false);
            boolean contains = true ^ c25260yw2.LIZLLL.contains(LIZ4);
            c25260yw2.LIZJ = (LinkedHashSet) clone;
            c25260yw2.LIZLLL = (LinkedHashSet) clone2;
            if (contains) {
                return;
            }
        }
        super.show();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZ() {
        int i;
        super.LJZ();
        LiveMode liveMode = (LiveMode) this.dataChannel.kv0(BCX.class);
        this.LJLJLJ = liveMode;
        if (liveMode == null) {
            i = -1;
        } else {
            i = C05300Is.LIZ[liveMode.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        this.LJLJJI = "else";
                        this.LJLJL = false;
                        this.LJLJI = null;
                    } else {
                        String str = LiveMode.VIDEO.logStreamingType;
                        o.LJIIIIZZ(str, "VIDEO.logStreamingType");
                        this.LJLJJI = str;
                        this.LJLJL = false;
                        this.LJLJI = null;
                    }
                } else {
                    String str2 = LiveMode.LIVE_STUDIO.logStreamingType;
                    o.LJIIIIZZ(str2, "LIVE_STUDIO.logStreamingType");
                    this.LJLJJI = str2;
                    this.LJLJL = true;
                    this.LJLJI = (C25260yw) this.dataChannel.kv0(LiveStudioBannerWidgetManagerChannel.class);
                }
            } else {
                String str3 = LiveMode.THIRD_PARTY.logStreamingType;
                o.LJIIIIZZ(str3, "THIRD_PARTY.logStreamingType");
                this.LJLJJI = str3;
                this.LJLJL = true;
                this.LJLJI = (C25260yw) this.dataChannel.kv0(ObsBannerWidgetManagerChannel.class);
            }
        } else {
            String str4 = LiveMode.SCREEN_RECORD.logStreamingType;
            o.LJIIIIZZ(str4, "SCREEN_RECORD.logStreamingType");
            this.LJLJJI = str4;
            this.LJLJL = true;
            this.LJLJI = (C25260yw) this.dataChannel.kv0(GameBannerWidgetManagerChannel.class);
        }
        LLF(false);
        show();
    }

    public final void LLF(boolean z) {
        String str;
        super.hide();
        if (this.LJLJL) {
            String str2 = this.LJLJJI;
            C25260yw c25260yw = this.LJLJI;
            C25240yu c25240yu = null;
            if (c25260yw != null) {
                str = c25260yw.LJII;
            } else {
                str = null;
            }
            if (!o.LJ(str2, str) || o.LJ(this.LJLJJI, "null") || o.LJ(this.LJLJJI, "else")) {
                return;
            }
            if (C30922CBq.LIZIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("remove banner ");
                LIZ.append(this.LJLJJI);
                LIZ.append(' ');
                LIZ.append(LL());
                C0NB.LIZ(X1D.LIZIZ(LIZ));
            }
            C25260yw c25260yw2 = this.LJLJI;
            if (c25260yw2 == null) {
                return;
            }
            Iterator<C25240yu> it = c25260yw2.LIZJ.iterator();
            while (it.hasNext()) {
                C25240yu next = it.next();
                if (o.LJ(next.LIZIZ, this)) {
                    c25240yu = next;
                }
            }
            if (c25240yu == null) {
                return;
            }
            c25260yw2.LIZJ.remove(c25240yu);
            c25260yw2.LIZLLL.remove(c25240yu);
            if (!z) {
                c25260yw2.LIZLLL(true);
            } else {
                c25260yw2.LIZJ(this);
            }
        }
    }
}
