package X;

import Y.IDRunnableS85S0100000;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.banner.EffectMemoryPositionOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStickerRecentTabSwitchSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0PS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0PS {
    public final C80664VlE LIZ;
    public final ViewPager LIZIZ;
    public final List<C32001Nk> LIZJ = new ArrayList();
    public int LIZLLL = -1;

    public static void LIZIZ(C76956UIe c76956UIe) {
        View findViewById;
        if (c76956UIe != null) {
            View view = c76956UIe.LJ;
            if (view != null) {
                View findViewById2 = view.findViewById(R.id.kyz);
                if (findViewById2 != null) {
                    findViewById2.setAlpha(0.9f);
                }
                if (c76956UIe == null) {
                    return;
                }
            }
            View view2 = c76956UIe.LJ;
            if (view2 != null) {
                View findViewById3 = view2.findViewById(R.id.kyk);
                if (findViewById3 != null) {
                    findViewById3.setSelected(true);
                }
                if (c76956UIe == null) {
                    return;
                }
            }
            View view3 = c76956UIe.LJ;
            if (view3 != null && (findViewById = view3.findViewById(R.id.kz4)) != null) {
                C29306Beo.LJI(findViewById);
            }
        }
    }

    public static void LIZJ(C76956UIe c76956UIe) {
        View findViewById;
        View findViewById2;
        View view = c76956UIe.LJ;
        if (view != null && (findViewById2 = view.findViewById(R.id.kyz)) != null) {
            findViewById2.setAlpha(0.5f);
        }
        View view2 = c76956UIe.LJ;
        if (view2 == null || (findViewById = view2.findViewById(R.id.kyk)) == null) {
            return;
        }
        findViewById.setSelected(false);
    }

    public final void LIZ(List<C32001Nk> dataList) {
        C76956UIe LJIIJ;
        boolean z;
        View findViewById;
        View findViewById2;
        TextView textView;
        View view;
        TextView textView2;
        LifecycleOwner lifecycleOwner;
        View view2;
        TextView textView3;
        o.LJIIIZ(dataList, "dataList");
        if (!o.LJ(this.LIZJ, dataList)) {
            ((ArrayList) this.LIZJ).clear();
            ((ArrayList) this.LIZJ).addAll(dataList);
            this.LIZ.LJIIL();
            Iterator it = ((ArrayList) this.LIZJ).iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    C32001Nk c32001Nk = (C32001Nk) next;
                    if (o.LJ(c32001Nk.LJLIL, "favorite")) {
                        LJIIJ = this.LIZ.LJIIJ();
                        LJIIJ.LJFF = false;
                        LJIIJ.LIZ(R.layout.d2h);
                        View view3 = LJIIJ.LJ;
                        if (view3 != null && (textView3 = (TextView) view3.findViewById(R.id.kyz)) != null) {
                            textView3.setText(c32001Nk.LJLIL);
                        }
                        LJIIJ.LIZ = c32001Nk;
                    } else if (o.LJ(c32001Nk.LJLILLLLZI, "Recents")) {
                        LJIIJ = this.LIZ.LJIIJ();
                        LJIIJ.LJFF = false;
                        LJIIJ.LIZ(R.layout.d2y);
                        if (LiveStickerRecentTabSwitchSetting.INSTANCE.showIcon()) {
                            View view4 = LJIIJ.LJ;
                            if (view4 != null) {
                                view2 = view4.findViewById(R.id.kyk);
                            } else {
                                view2 = null;
                            }
                            C29306Beo.LJJLJLI(view2);
                        } else {
                            View view5 = LJIIJ.LJ;
                            if (view5 != null) {
                                view = view5.findViewById(R.id.kyz);
                            } else {
                                view = null;
                            }
                            C29306Beo.LJJLJLI(view);
                            View view6 = LJIIJ.LJ;
                            if (view6 != null && (textView2 = (TextView) view6.findViewById(R.id.kyz)) != null) {
                                textView2.setText(c32001Nk.LJLIL);
                            }
                        }
                        LJIIJ.LIZ = c32001Nk;
                        DataChannel LIZJ = C30446BxC.LIZJ(C30446BxC.LIZ);
                        if (LIZJ != null && (lifecycleOwner = LIZJ.LJLJJI) != null) {
                            C30444BxA.LIZIZ(EnumC30410Bwc.LIVE_EFFECT_RECENT_TAB, lifecycleOwner, null, new IDqS416S0100000(LJIIJ, 135));
                        }
                    } else {
                        LJIIJ = this.LIZ.LJIIJ();
                        LJIIJ.LJFF = false;
                        LJIIJ.LIZ(R.layout.d32);
                        View view7 = LJIIJ.LJ;
                        if (view7 != null && (textView = (TextView) view7.findViewById(R.id.kyz)) != null) {
                            textView.setText(c32001Nk.LJLIL);
                        }
                        LJIIJ.LIZ = c32001Nk;
                        String category = c32001Nk.LJLIL;
                        o.LJIIIZ(category, "category");
                        if (!LiveRedDotOfflineEnableSetting.INSTANCE.getValue() && InterfaceC30442Bx8.x.LIZJ().contains(category) && !LiveEffectDowngradeSetting.INSTANCE.remove()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            View view8 = LJIIJ.LJ;
                            if (view8 != null && (findViewById2 = view8.findViewById(R.id.kz4)) != null) {
                                C29306Beo.LJJLJLI(findViewById2);
                            }
                        } else {
                            View view9 = LJIIJ.LJ;
                            if (view9 != null && (findViewById = view9.findViewById(R.id.kz4)) != null) {
                                C29306Beo.LJI(findViewById);
                            }
                        }
                    }
                    if (i == this.LIZLLL) {
                        C80664VlE c80664VlE = this.LIZ;
                        LIZIZ(LJIIJ);
                        c80664VlE.LIZJ(LJIIJ, i, true);
                    } else {
                        C80664VlE c80664VlE2 = this.LIZ;
                        LIZJ(LJIIJ);
                        c80664VlE2.LIZJ(LJIIJ, i, false);
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            if (!EffectMemoryPositionOptSetting.INSTANCE.inExperiment()) {
                this.LIZ.postDelayed(new IDRunnableS85S0100000(this, 74), 1000L);
            }
        }
    }

    public C0PS(C80664VlE c80664VlE, ViewPager viewPager) {
        this.LIZ = c80664VlE;
        this.LIZIZ = viewPager;
        c80664VlE.setTabMargin(9);
        c80664VlE.LIZIZ(new InterfaceC77393UYz() { // from class: X.1Iv
            @Override // X.InterfaceC77393UYz
            public final void LIZ() {
            }

            @Override // X.InterfaceC77393UYz
            public final void LIZIZ(C76956UIe c76956UIe) {
                C0PS.this.getClass();
                C0PS.LIZJ(c76956UIe);
            }

            @Override // X.InterfaceC77393UYz
            public final void LIZJ(C76956UIe c76956UIe) {
                int i;
                C32001Nk c32001Nk;
                C0PS.this.getClass();
                C0PS.LIZIZ(c76956UIe);
                C0PS c0ps = C0PS.this;
                if (c76956UIe != null) {
                    i = c76956UIe.LIZLLL;
                } else {
                    i = -1;
                }
                c0ps.LIZLLL = i;
                Object obj = null;
                if (c76956UIe != null) {
                    obj = c76956UIe.LIZ;
                }
                if ((obj instanceof C32001Nk) && (c32001Nk = (C32001Nk) obj) != null) {
                    String category = c32001Nk.LJLIL;
                    o.LJIIIZ(category, "category");
                    InterfaceC30442Bx8.x.LIZJ().remove(category);
                    if (o.LJ(c32001Nk.LJLILLLLZI, "Recents")) {
                        C30444BxA.LIZ(EnumC30410Bwc.LIVE_EFFECT_RECENT_TAB);
                    }
                }
            }
        });
    }
}
