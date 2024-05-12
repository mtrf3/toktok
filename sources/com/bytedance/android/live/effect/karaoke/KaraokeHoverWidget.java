package com.bytedance.android.live.effect.karaoke;

import X.AnonymousClass014;
import X.BZI;
import X.C0NB;
import X.C15380j0;
import X.C15490jB;
import X.C15540jG;
import X.C1H0;
import X.C21180sM;
import X.C21200sO;
import X.C21210sP;
import X.C221108m2;
import X.C279017q;
import X.C279917z;
import X.C28268B7o;
import X.C28787BRn;
import X.C29306Beo;
import X.C2FY;
import X.C2FZ;
import X.C31073CHl;
import X.C31151Kd;
import X.C31321Ku;
import X.C41101jO;
import X.C47061t0;
import X.C47181tC;
import X.C48459J0d;
import X.C62822Ol8;
import X.C73666Sve;
import X.C73943T0h;
import X.C77800Ug8;
import X.C96Q;
import X.InterfaceC30442Bx8;
import X.O6R;
import X.UFE;
import X.X1D;
import X.XKX;
import Y.IDUListenerS170S0200000;
import Y.IDfS292S0100000;
import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.effect.api.effect.KaraokeRecyclableWidget;
import com.bytedance.android.live.effect.karaoke.KaraokeHoverWidget;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.RtcSeiReceivedChannel;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeSeiDelaySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeSeiTimerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestKtvSwitcherSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes.dex */
public final class KaraokeHoverWidget extends KaraokeRecyclableWidget {
    public KaraokeViewModel LJLIL;
    public C1H0 LJLILLLLZI;
    public C47061t0 LJLJI;
    public int LJLJJL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLLJ;
    public boolean LJLLL;
    public int LJLLLLLL;
    public C21200sO LJLZ;
    public boolean LJZ;
    public boolean LJZL;
    public long LL;
    public C73666Sve LLD;
    public C279917z LJLJJI = AnonymousClass014.LIZ();
    public long LJLJJLL = -1;
    public boolean LJLJLLL = true;
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(C47181tC.LJLIL);
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new IDqS420S0100000(this, 44));
    public long LJLLILLLL = -1;
    public long LJLLLL = -1;
    public long LJZI = 200;
    public long LLF = 200;

    public final void LJZ() {
        this.LJLJLJ = false;
        this.LJLLJ = false;
        C1H0 c1h0 = this.LJLILLLLZI;
        if (c1h0 != null) {
            ValueAnimator valueAnimator = c1h0.LJLLL;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            c1h0.LJLLL = null;
            C41101jO c41101jO = c1h0.LJLILLLLZI;
            if (c41101jO != null) {
                c41101jO.LJLJJI = 0;
                c41101jO.LJLILLLLZI = 0L;
                c41101jO.LJLJLLL = 0;
                c41101jO.LJLJJL.clear();
                c41101jO.LL = null;
                c41101jO.invalidate();
            }
            C47061t0 c47061t0 = c1h0.LJLJI;
            if (c47061t0 != null) {
                c47061t0.setRotation(0.0f);
                c47061t0.setImageResource(R.color.yi);
                c47061t0.setBackgroundResource(R.drawable.d6o);
            }
        }
        this.LJLJJI = AnonymousClass014.LIZ();
        C1H0 c1h02 = this.LJLILLLLZI;
        if (c1h02 != null) {
            c1h02.setRedDot(0);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.d_0;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.effect.api.effect.KaraokeRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final JSONObject LJZI() {
        return (JSONObject) this.LJLLI.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C0NB.LIZIZ("KLyric", "onUnload");
        LJZ();
        this.LJLIL = null;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        C21200sO c21200sO = this.LJLZ;
        if (c21200sO != null) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            dataChannelGlobal.getClass();
            dataChannelGlobal.jv0(c21200sO);
        }
        this.LJLZ = null;
    }

    public final void LLF() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GuideAnim Role: ");
        LIZ.append(this.LJLJJL);
        LIZ.append(", posY: ");
        C48459J0d<Float> c48459J0d = InterfaceC30442Bx8.G3;
        LIZ.append(c48459J0d.LIZJ());
        LIZ.append(", shown: ");
        C48459J0d<Boolean> c48459J0d2 = InterfaceC30442Bx8.A3;
        LIZ.append(c48459J0d2.LIZJ());
        C0NB.LIZIZ("KLyric", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("GuideAnim posY: ");
        LIZ2.append(o.LIZJ(c48459J0d.LIZJ(), -1.0f));
        C0NB.LIZIZ("KLyric", X1D.LIZIZ(LIZ2));
        if (this.LJLJJL == 1 && o.LIZJ(c48459J0d.LIZJ(), -1.0f) && !c48459J0d2.LIZJ().booleanValue()) {
            C0NB.LIZIZ("KLyric", "GuideAnim test 1");
            final C47061t0 c47061t0 = this.LJLJI;
            if (c47061t0 != null) {
                if (C15380j0.LJIIZILJ()) {
                    c47061t0.setRotationY(180.0f);
                }
                C47061t0 c47061t02 = this.LJLJI;
                if (c47061t02 != null) {
                    c47061t02.setVisibility(0);
                }
                C15540jG c15540jG = new C15540jG();
                C0NB.LIZIZ("KLyric", "GuideAnim test 2");
                c15540jG.LIZIZ = "tiktok_live_broadcast_demand_1";
                c15540jG.LIZJ = "karaoke_drag_guide_hoverball_only.webp";
                c15540jG.LJIIL = true;
                c15540jG.LIZ = c47061t0;
                c15540jG.LJI = 1;
                c15540jG.LJFF = true;
                c15540jG.LJIIIIZZ = 1000 * 2500;
                c15540jG.LJ = new C31073CHl() { // from class: X.1na
                    @Override // X.C31073CHl
                    public final void LJFF() {
                        C0NB.LIZIZ("KLyric", "GuideAnim onResourceReady");
                    }

                    @Override // X.C31073CHl
                    public final void LJI(Animatable anim) {
                        o.LJIIIZ(anim, "anim");
                        C0NB.LIZIZ("KLyric", "GuideAnim onStart");
                        InterfaceC30442Bx8.A3.LIZ(Boolean.TRUE);
                        C47061t0 c47061t03 = this.LJLJI;
                        if (c47061t03 != null) {
                            c47061t03.setVisibility(0);
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(-1.0f, 1.0f);
                        C47061t0 c47061t04 = c47061t0;
                        KaraokeHoverWidget karaokeHoverWidget = this;
                        ofFloat.setInterpolator(new LinearInterpolator());
                        ofFloat.setDuration(2500L);
                        ofFloat.addUpdateListener(new IDUListenerS170S0200000(c47061t04, karaokeHoverWidget, 1));
                        ofFloat.start();
                    }

                    @Override // X.C31073CHl
                    public final void LJII(Animatable anim) {
                        o.LJIIIZ(anim, "anim");
                        C0NB.LIZIZ("KLyric", "GuideAnim onResourceReady");
                        C47061t0 c47061t03 = this.LJLJI;
                        if (c47061t03 != null) {
                            c47061t03.setVisibility(8);
                        }
                        C1H0 c1h0 = this.LJLILLLLZI;
                        if (c1h0 == null) {
                            return;
                        }
                        c1h0.setTranslationY(0.0f);
                    }
                };
                C15490jB.LJI(c15540jG);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        C0NB.LIZIZ("KLyric", "onHide");
        InterfaceC30442Bx8.y3.LIZ(Boolean.FALSE);
        if (this.LJLJJL == 1 && this.LJLLLL != -1) {
            DataChannel dataChannel = this.dataChannel;
            boolean z = this.LJLLL;
            long currentTimeMillis = System.currentTimeMillis() - this.LJLLLL;
            BZI LIZ = C28787BRn.LIZ("livesdk_live_karaoke_floating_panel_use_time");
            LIZ.LJIILLIIL(dataChannel);
            LIZ.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "is_live_take_default");
            UFE.LIZIZ((int) (currentTimeMillis / 1000), LIZ, "use_time");
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        KaraokeViewModel karaokeViewModel = this.LJLIL;
        if (karaokeViewModel != null) {
            karaokeViewModel.pause();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        C0NB.LIZIZ("KLyric", "onResume");
        KaraokeViewModel karaokeViewModel = this.LJLIL;
        if (karaokeViewModel != null) {
            if (karaokeViewModel.LLD) {
                karaokeViewModel.nv0().LJFF(0, false);
            }
            karaokeViewModel.LLD = false;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        C0NB.LIZIZ("KLyric", "onShow");
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLLLL = currentTimeMillis;
        C21180sM.LIZJ = currentTimeMillis;
        InterfaceC30442Bx8.y3.LIZ(Boolean.TRUE);
        if (this.LJLJJL == 2) {
            C77800Ug8.LJ("livesdk_live_karaoke_audience_floating_panel_show", this.dataChannel);
        }
    }

    @Override // com.bytedance.android.live.effect.api.effect.KaraokeRecyclableWidget
    public final void LJLZ(String seiStr) {
        boolean z;
        boolean z2;
        ValueAnimator valueAnimator;
        C41101jO lyricView;
        o.LJIIIZ(seiStr, "seiStr");
        boolean z3 = false;
        if (C96Q.LIZ(seiStr)) {
            z = true;
        } else {
            z = false;
        }
        if (z && s.LJJLIIIJL(seiStr, "ByteVC", 0, false, 6) == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            C279017q.LJ("Illegal SEI message from LiveCore: ", seiStr, "LyricSEI");
            return;
        }
        if (this.LJLJJL == 1) {
            return;
        }
        try {
            JSONObject optJSONObject = new JSONObject(seiStr).optJSONObject("ktv_sei");
            if (optJSONObject != null) {
                long optLong = optJSONObject.optLong("room_id", 0L);
                long optLong2 = optJSONObject.optLong("song_id", 0L);
                if (this.LJLJJLL == optLong) {
                    if (optLong2 == this.LJLJJI.LIZ) {
                        long optLong3 = optJSONObject.optLong("play_progress", -1L);
                        if (optLong3 == -1) {
                            optLong3 = O6R.LJJIJ(optJSONObject.optDouble("play_progress", -1.0d));
                        }
                        C1H0 c1h0 = this.LJLILLLLZI;
                        if (c1h0 != null && (lyricView = c1h0.getLyricView()) != null) {
                            lyricView.LJI(optLong3);
                        }
                        int optInt = optJSONObject.optInt("play_status", -1);
                        if (optInt != -1 && this.LJLLLLLL != optInt && !this.LJZ) {
                            this.LJLLLLLL = optInt;
                            if (optInt != 0) {
                                if (optInt != 2) {
                                    if (optInt != 3) {
                                    }
                                } else {
                                    C1H0 c1h02 = this.LJLILLLLZI;
                                    if (c1h02 != null) {
                                        c1h02.LJJLL();
                                    }
                                    KaraokeViewModel karaokeViewModel = this.LJLIL;
                                    if (karaokeViewModel != null) {
                                        karaokeViewModel.yv0(new C31321Ku(true, optLong2));
                                    }
                                }
                            }
                            C1H0 c1h03 = this.LJLILLLLZI;
                            if (c1h03 != null && (valueAnimator = c1h03.LJLLL) != null) {
                                valueAnimator.pause();
                            }
                            KaraokeViewModel karaokeViewModel2 = this.LJLIL;
                            if (karaokeViewModel2 != null) {
                                karaokeViewModel2.yv0(new C31321Ku(false, optLong2));
                            }
                        }
                        if (optJSONObject.optInt("lyric_status", -1) == 0) {
                            z3 = true;
                        }
                        if (z3 != this.LJLJLLL) {
                            LL(z3);
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("sei json: ");
                        LIZ.append(optJSONObject);
                        C0NB.LIZIZ("LyricSEI", X1D.LIZIZ(LIZ));
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("sei opt play: ");
                        LIZ2.append(optInt);
                        LIZ2.append(", progress: ");
                        LIZ2.append(optLong3);
                        LIZ2.append(", lyric: ");
                        LIZ2.append(z3);
                        C0NB.LIZIZ("LyricSEI", X1D.LIZIZ(LIZ2));
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    if (this.LJLLILLLL == -1) {
                        this.LJLLILLLL = currentTimeMillis;
                    }
                }
            }
        } catch (Exception e) {
            C0NB.LJFF("LyricSEI", "parse ktv json failed", e);
        }
    }

    public final void LJZL(boolean z) {
        ValueAnimator valueAnimator;
        this.LJZ = z;
        C41101jO c41101jO = null;
        if (z) {
            C1H0 c1h0 = this.LJLILLLLZI;
            if (c1h0 != null) {
                c41101jO = c1h0.getLyricView();
            }
            C29306Beo.LJIIIZ(c41101jO);
            C1H0 c1h02 = this.LJLILLLLZI;
            if (c1h02 != null && (valueAnimator = c1h02.LJLLL) != null) {
                valueAnimator.pause();
            }
            this.LJLLLLLL = 3;
            KaraokeViewModel karaokeViewModel = this.LJLIL;
            if (karaokeViewModel != null) {
                karaokeViewModel.yv0(new C31321Ku(false, this.LJLJJI.LIZ));
                return;
            }
            return;
        }
        if (!this.LJLJLLL) {
            return;
        }
        C1H0 c1h03 = this.LJLILLLLZI;
        if (c1h03 != null) {
            c41101jO = c1h03.getLyricView();
        }
        C29306Beo.LJJLJLI(c41101jO);
    }

    public final void LL(boolean z) {
        this.LJLJLLL = z;
        if (this.LJLJJL == 1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Setting Lyric Switch: ");
            LIZ.append(z);
            C0NB.LIZIZ("LyricSEI", X1D.LIZIZ(LIZ));
            LJZI().put("lyric_status", !this.LJLJLLL ? 1 : 0);
        }
        C41101jO c41101jO = null;
        if (this.LJLJLLL) {
            if (!this.LJZ) {
                C1H0 c1h0 = this.LJLILLLLZI;
                if (c1h0 != null) {
                    c41101jO = c1h0.getLyricView();
                }
                C29306Beo.LJJLJLI(c41101jO);
                return;
            }
            return;
        }
        C1H0 c1h02 = this.LJLILLLLZI;
        if (c1h02 != null) {
            c41101jO = c1h02.getLyricView();
        }
        C29306Beo.LJIIIZ(c41101jO);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        int i;
        DataChannel dataChannel;
        KaraokeViewModel karaokeViewModel;
        C0NB.LIZIZ("KLyric", "onLoad");
        hide();
        if (C29306Beo.LJIIJ(this.dataChannel)) {
            i = 1;
        } else {
            i = 2;
        }
        this.LJLJJL = i;
        this.LJLJJLL = C29306Beo.LJJIZ(this.dataChannel);
        Fragment fragment = this.widgetCallback.getFragment();
        if (fragment.mo49getActivity() != null) {
            this.LJLIL = C21210sP.LIZJ(this.dataChannel);
            if (!this.LJLJJI.LJII() && !this.LJLLJ && (karaokeViewModel = this.LJLIL) != null) {
                karaokeViewModel.yv0(new C31151Kd(this.LJLJJI));
            }
            C1H0 c1h0 = this.LJLILLLLZI;
            if (c1h0 != null) {
                c1h0.LJLLLLLL = new IDqS416S0100000(this, 278);
            }
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new C2FY(this, null), 3);
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new C2FZ(this, null), 3);
        }
        if (MultiGuestKtvSwitcherSetting.INSTANCE.isEnable() && (dataChannel = this.dataChannel) != null) {
            dataChannel.nv0(RtcSeiReceivedChannel.class, this, new IDqS416S0100000(this, 279));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.lv0(this, PauseLiveChannel.class, new IDqS416S0100000(this, 280));
        }
        C73943T0h.LIZ().LIZJ(this, C28268B7o.class).LIZIZ(new IDfS292S0100000(this, 38));
        if (this.LJLJJL == 1) {
            this.LJZI = LiveKaraokeSeiTimerSetting.INSTANCE.getValue();
            this.LLF = LiveKaraokeSeiDelaySetting.INSTANCE.getValue();
            Boolean LIZJ = InterfaceC30442Bx8.E3.LIZJ();
            o.LJIIIIZZ(LIZJ, "KARAOKE_LYRICS_SWITCH.value");
            LL(LIZJ.booleanValue());
        }
        DataChannel dataChannel3 = this.dataChannel;
        o.LJIIIIZZ(dataChannel3, "dataChannel");
        this.LJLZ = new C21200sO(this, dataChannel3);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void setContentView(View view) {
        int i;
        super.setContentView(view);
        this.LJLJI = (C47061t0) findViewById(R.id.chb);
        C1H0 c1h0 = (C1H0) findViewById(R.id.fdk);
        c1h0.setRole(this.LJLJJL);
        C41101jO lyricView = c1h0.getLyricView();
        if (lyricView != null) {
            if (this.LJLJLLL) {
                i = 0;
            } else {
                i = 8;
            }
            lyricView.setVisibility(i);
        }
        this.LJLILLLLZI = c1h0;
    }
}
