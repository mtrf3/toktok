package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveWidgetSlardarThresholdSetting;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class YA1 extends C78605Ut7 implements RecyclableWidgetEventListener {
    public final java.util.Map<Widget, YA3> LJLJJI = new HashMap();
    public final C1UB LJLJJL = new C1UB(10);
    public final java.util.Map<String, YA2> LJLJJLL = new HashMap();
    public final C1UB LJLJL = new C1UB(10);
    public final Random LJLJLJ = new Random();
    public final JSONObject LJLJLLL = new JSONObject();
    public final int LJLL = LiveWidgetSlardarThresholdSetting.INSTANCE.getValue();

    public static void LJJ(YA3 ya3, YA2 ya2) {
        if (ya3.LIZJ != 0) {
            ya2.LJIILIIL = Math.max(0L, SystemClock.uptimeMillis() - ya3.LIZJ) + ya2.LJIILIIL;
            ya3.LIZJ = 0L;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final void onHide(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
        YA3 ya3 = (YA3) ((HashMap) this.LJLJJI).get(widget);
        if (ya3 != null) {
            YA2 ya2 = (YA2) ((HashMap) this.LJLJJLL).get(ya3.LIZ);
            if (ya2 != null) {
                LJJ(ya3, ya2);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final void onPostCreate(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
        YA3 ya3 = (YA3) ((HashMap) this.LJLJJI).get(widget);
        if (ya3 != null) {
            ya3.LJIIL = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final void onPostCreateView(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
        YA3 ya3 = (YA3) ((HashMap) this.LJLJJI).get(widget);
        if (ya3 != null) {
            ya3.LJ = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final void onPostDestroy(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
        YA3 ya3 = (YA3) ((HashMap) this.LJLJJI).get(widget);
        if (ya3 != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ya3.LJIILJJIL = uptimeMillis;
            if (ya3.LJ - ya3.LIZLLL >= 0 && ya3.LJIIL - ya3.LJIIJJI >= 0 && uptimeMillis - ya3.LJIILIIL >= 0) {
                YA2 ya2 = (YA2) ((HashMap) this.LJLJJLL).get(ya3.LIZ);
                if (ya2 != null) {
                    LJJ(ya3, ya2);
                    long j = ya2.LJIIIIZZ;
                    long j2 = ya3.LJ;
                    ya2.LJIIIIZZ = (j2 - ya3.LIZLLL) + j;
                    ya2.LJIILLIIL = (ya3.LJIIL - ya3.LJIIJJI) + ya2.LJIILLIIL;
                    ya2.LJIIZILJ = (ya3.LJIILJJIL - ya3.LJIILIIL) + ya2.LJIIZILJ;
                    if (j2 > 0) {
                        ya2.LJFF++;
                        View view = widget.getView();
                        if (view != null && (view.getTag(R.id.g0a) instanceof Long)) {
                            ya2.LJIILJJIL = ((Long) view.getTag(R.id.g0a)).longValue() + ya2.LJIILJJIL;
                        }
                    }
                    if (ya3.LIZLLL > 0 && ya3.LJIIJJI > 0 && ya3.LJIILIIL > 0) {
                        ya2.LJIILL++;
                    }
                    ya2.LJIIL = (ya3.LJIILJJIL - ya3.LIZIZ) + ya2.LJIIL;
                    if (ya2.LJIILL == ya2.LIZ) {
                        LJJI(C30317Bv7.LJ(interfaceC30319Bv9), ya3.LIZ, ya2);
                        ((HashMap) this.LJLJJLL).remove(ya3.LIZ);
                        this.LJLJL.LIZ(ya2);
                    }
                }
                ((HashMap) this.LJLJJI).remove(widget);
                this.LJLJJL.LIZ(ya3);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final void onPostInit(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget) {
        YA3 ya3 = (YA3) ((HashMap) this.LJLJJI).get(liveRecyclableWidget);
        if (ya3 != null) {
            ya3.LJI = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final void onPostLoad(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget) {
        YA3 ya3 = (YA3) ((HashMap) this.LJLJJI).get(liveRecyclableWidget);
        if (ya3 != null) {
            ya3.LJIIIIZZ = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final void onPostUnload(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget) {
        YA3 ya3 = (YA3) ((HashMap) this.LJLJJI).get(liveRecyclableWidget);
        if (ya3 != null) {
            ya3.LJIIJ = SystemClock.uptimeMillis();
            YA2 ya2 = (YA2) ((HashMap) this.LJLJJLL).get(ya3.LIZ);
            if (ya2 != null) {
                LJJ(ya3, ya2);
                long j = ya2.LJIIIIZZ;
                long j2 = ya3.LJ;
                ya2.LJIIIIZZ = (j2 - ya3.LIZLLL) + j;
                if (j2 > 0) {
                    ya2.LJFF++;
                    View view = liveRecyclableWidget.getView();
                    if (view != null && (view.getTag(R.id.g0a) instanceof Long)) {
                        ya2.LJIILJJIL = ((Long) view.getTag(R.id.g0a)).longValue() + ya2.LJIILJJIL;
                    }
                }
                long j3 = ya2.LJIIIZ;
                long j4 = ya3.LJI;
                long j5 = ya3.LJFF;
                ya2.LJIIIZ = (j4 - j5) + j3;
                if (j5 > 0) {
                    ya2.LJI++;
                }
                long j6 = ya2.LJIIJ;
                long j7 = ya3.LJIIIIZZ;
                long j8 = ya3.LJII;
                ya2.LJIIJ = (j7 - j8) + j6;
                long j9 = ya2.LJIIJJI;
                long j10 = ya3.LJIIJ;
                long j11 = ya3.LJIIIZ;
                ya2.LJIIJJI = (j10 - j11) + j9;
                if (j8 > 0 && j11 > 0) {
                    ya2.LJII++;
                }
                ya2.LJIIL = (j10 - ya3.LIZIZ) + ya2.LJIIL;
                if (ya2.LJII == ya2.LIZ) {
                    LJJI(C30317Bv7.LJ(interfaceC30319Bv9), ya3.LIZ, ya2);
                    ((HashMap) this.LJLJJLL).remove(ya3.LIZ);
                    this.LJLJL.LIZ(ya2);
                }
            }
            ((HashMap) this.LJLJJI).remove(liveRecyclableWidget);
            this.LJLJJL.LIZ(ya3);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final void onPreCreate(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
        YA3 ya3 = (YA3) ((HashMap) this.LJLJJI).get(widget);
        if (ya3 != null) {
            ya3.LJIIJJI = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final void onPreCreateView(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
        YA3 ya3 = (YA3) ((HashMap) this.LJLJJI).get(widget);
        if (ya3 != null) {
            ya3.LIZLLL = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final void onPreDestroy(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
        YA3 ya3 = (YA3) ((HashMap) this.LJLJJI).get(widget);
        if (ya3 != null) {
            ya3.LJIILIIL = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final void onPreInit(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget) {
        YA3 ya3 = (YA3) ((HashMap) this.LJLJJI).get(liveRecyclableWidget);
        if (ya3 != null) {
            ya3.LJFF = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final void onPreLoad(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget) {
        YA3 ya3 = (YA3) ((HashMap) this.LJLJJI).get(liveRecyclableWidget);
        if (ya3 != null) {
            ya3.LJII = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final void onPreUnload(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget) {
        YA3 ya3 = (YA3) ((HashMap) this.LJLJJI).get(liveRecyclableWidget);
        if (ya3 != null) {
            ya3.LJIIIZ = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final void onShow(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget) {
        YA3 ya3 = (YA3) ((HashMap) this.LJLJJI).get(widget);
        if (ya3 != null && ya3.LIZJ == 0) {
            ya3.LIZJ = SystemClock.uptimeMillis();
        }
    }

    public final void LJJI(int i, String str, YA2 ya2) {
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_widget_metrics") && ya2 != null) {
            try {
                this.LJLJLLL.put("widgetName", str);
                this.LJLJLLL.put("widgetSceneType", i);
                this.LJLJLLL.put("loadCount", ya2.LIZIZ);
                this.LJLJLLL.put("asyncLoadCount", ya2.LIZJ);
                this.LJLJLLL.put("loadTotalDelay", ya2.LIZLLL);
                this.LJLJLLL.put("interactionTotalDelay", ya2.LJ);
                this.LJLJLLL.put("createViewCount", ya2.LJFF);
                this.LJLJLLL.put("createViewTotalDuration", ya2.LJIIIIZZ);
                this.LJLJLLL.put("loadedTotalDuration", ya2.LJIIL);
                this.LJLJLLL.put("showTotalDuration", ya2.LJIILIIL);
                this.LJLJLLL.put("inflationTotalDuration", ya2.LJIILJJIL);
                int i2 = ya2.LJIILL;
                if (i2 > 0) {
                    this.LJLJLLL.put("widgetCount", i2);
                    this.LJLJLLL.put("createTotalDuration", ya2.LJIILLIIL);
                    this.LJLJLLL.put("destroyTotalDuration", ya2.LJIIZILJ);
                    this.LJLJLLL.remove("initCount");
                    this.LJLJLLL.remove("reuseCount");
                    this.LJLJLLL.remove("initTotalDuration");
                    this.LJLJLLL.remove("loadTotalDuration");
                    this.LJLJLLL.remove("unloadTotalDuration");
                } else {
                    this.LJLJLLL.put("initCount", ya2.LJI);
                    this.LJLJLLL.put("reuseCount", ya2.LJII);
                    this.LJLJLLL.put("initTotalDuration", ya2.LJIIIZ);
                    this.LJLJLLL.put("loadTotalDuration", ya2.LJIIJ);
                    this.LJLJLLL.put("unloadTotalDuration", ya2.LJIIJJI);
                    this.LJLJLLL.remove("widgetCount");
                    this.LJLJLLL.remove("createTotalDuration");
                    this.LJLJLLL.remove("destroyTotalDuration");
                }
            } catch (Exception unused) {
            }
            C0K2.LIZ.LJI("ttlive_widget_metrics", new JSONObject(), null, this.LJLJLLL);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
    public final void onWidgetRequestLoading(InterfaceC30319Bv9 interfaceC30319Bv9, Widget widget, boolean z) {
        long LIZJ;
        long uptimeMillis;
        long j;
        o.LJIIIZ(widget, "widget");
        String LJLLJ = C16880lQ.LJLLJ(widget.getClass());
        if (!TextUtils.isEmpty(LJLLJ)) {
            YA3 ya3 = (YA3) this.LJLJJL.LIZIZ();
            if (ya3 != null) {
                ya3.LIZ();
            } else {
                ya3 = new YA3();
            }
            ya3.LIZ = LJLLJ;
            ya3.LIZIZ = SystemClock.uptimeMillis();
            ((HashMap) this.LJLJJI).put(widget, ya3);
            YA2 ya2 = (YA2) ((HashMap) this.LJLJJLL).get(LJLLJ);
            if (ya2 == null) {
                ya2 = (YA2) this.LJLJL.LIZIZ();
                if (ya2 != null) {
                    ya2.LIZ = 0;
                    ya2.LIZIZ = 0;
                    ya2.LIZJ = 0;
                    ya2.LIZLLL = 0L;
                    ya2.LJ = 0L;
                    ya2.LJFF = 0;
                    ya2.LJI = 0;
                    ya2.LJII = 0;
                    ya2.LJIIIIZZ = 0L;
                    ya2.LJIIIZ = 0L;
                    ya2.LJIIJ = 0L;
                    ya2.LJIIJJI = 0L;
                    ya2.LJIIL = 0L;
                    ya2.LJIILIIL = 0L;
                    ya2.LJIILJJIL = 0L;
                    ya2.LJIILL = 0;
                    ya2.LJIILLIIL = 0L;
                    ya2.LJIIZILJ = 0L;
                } else {
                    ya2 = new YA2();
                }
                ya2.LIZ = this.LJLJLJ.nextInt(this.LJLL) + 1;
                ((HashMap) this.LJLJJLL).put(LJLLJ, ya2);
            }
            ya2.LIZIZ++;
            if (C30317Bv7.LJ(interfaceC30319Bv9) == 0) {
                LIZJ = C30317Bv7.LIZJ(interfaceC30319Bv9);
                if (LIZJ > 0) {
                    uptimeMillis = System.currentTimeMillis();
                    j = uptimeMillis - LIZJ;
                }
                j = 0;
            } else {
                LIZJ = C30317Bv7.LIZJ(interfaceC30319Bv9);
                if (LIZJ > 0) {
                    uptimeMillis = SystemClock.uptimeMillis();
                    j = uptimeMillis - LIZJ;
                }
                j = 0;
            }
            ya2.LIZLLL += j;
            Long l = (Long) ((LinkedHashMap) C30317Bv7.LIZJ).get(interfaceC30319Bv9);
            if (l != null) {
                long longValue = l.longValue();
                if (longValue > 0) {
                    ya2.LJ = (SystemClock.uptimeMillis() - longValue) + ya2.LJ;
                }
            }
            if (z) {
                ya2.LIZJ++;
            }
        }
    }
}
