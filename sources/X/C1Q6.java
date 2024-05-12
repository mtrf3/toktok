package X;

import Y.IDCListenerS135S0100000;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.live.broadcast.api.LiveBgDialogChannel;
import com.bytedance.android.live.effect.SoloBgEffectSelectChannel;
import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel;
import com.bytedance.android.livesdk.dataChannel.GreenScreenCreatorBlockChannel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1Q6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Q6 implements InterfaceC08010Td {
    public final DataChannel LJLIL;
    public final String LJLILLLLZI;
    public View.OnClickListener LJLJI;
    public InterfaceC28989BZh LJLJJI;
    public String LJLJJL;
    public final View LJLJJLL;
    public final View LJLJL;
    public final RunnableC31065CHd LJLJLJ;
    public final TextView LJLJLLL;
    public final View LJLL;
    public final View LJLLI;
    public final View LJLLILLLL;
    public final ViewGroup LJLLJ;
    public Long LJLLL;
    public final BgEffectViewModel LJLLLL;
    public final GridLayoutManager LJLLLLLL;
    public LiveEffect LJLZ;
    public final C20G LJZ;
    public InterfaceC30494Bxy LJZI;
    public InterfaceC30594Bza LJZL;
    public C76104Tts LL;

    @Override // X.InterfaceC08010Td
    public final void LIZ() {
        long LIZ;
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            dataChannel.rv0(LiveBgDialogChannel.class, Boolean.FALSE);
        }
        InterfaceC30594Bza interfaceC30594Bza = this.LJZL;
        if (interfaceC30594Bza != null) {
            long LIZ2 = C30725C4b.LIZ();
            Long l = this.LJLLL;
            if (l != null) {
                LIZ = l.longValue();
            } else {
                LIZ = C30725C4b.LIZ();
            }
            interfaceC30594Bza.LJFF((int) (LIZ2 - LIZ));
        }
        C20G c20g = this.LJZ;
        DataChannel dataChannel2 = c20g.LJLILLLLZI;
        if (dataChannel2 != null) {
            dataChannel2.jv0(c20g);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(c20g);
        DataChannel dataChannel3 = c20g.LJLJLLL;
        if (dataChannel3 != null) {
            dataChannel3.jv0(c20g);
        }
        InterfaceC30494Bxy interfaceC30494Bxy = this.LJZI;
        if (interfaceC30494Bxy != null) {
            interfaceC30494Bxy.LIZ("livebackground");
        }
    }

    public final void LIZJ() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(2000L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        this.LJLLILLLL.startAnimation(rotateAnimation);
    }

    @Override // X.InterfaceC08010Td
    public final View getView() {
        View rootView = this.LJLJJLL;
        o.LJIIIIZZ(rootView, "rootView");
        return rootView;
    }

    @Override // X.InterfaceC08010Td
    public final void onDialogBackground() {
        C76104Tts c76104Tts = this.LL;
        if (c76104Tts != null) {
            c76104Tts.LIZIZ();
        }
        this.LJZ.LJLJJI = true;
    }

    @Override // X.InterfaceC08010Td
    public final void onDialogForeground() {
        this.LJLLL = Long.valueOf(C30725C4b.LIZ());
        C76104Tts c76104Tts = this.LL;
        if (c76104Tts != null) {
            c76104Tts.LIZJ(true);
        }
        C20G c20g = this.LJZ;
        c20g.LJLJJI = false;
        c20g.LLILL();
    }

    @Override // X.InterfaceC08010Td
    public final void LIZIZ(DialogFragment fragment) {
        BgEffectViewModel bgEffectViewModel;
        String str;
        o.LJIIIZ(fragment, "fragment");
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            dataChannel.rv0(LiveBgDialogChannel.class, Boolean.TRUE);
        }
        LIZLLL(null);
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new C54912Dn(this, null), 3);
        if (C78886Uxe.LJJIZ(this.LJLILLLLZI)) {
            bgEffectViewModel = this.LJLLLL;
            str = "solo";
        } else {
            bgEffectViewModel = this.LJLLLL;
            str = "multi";
        }
        bgEffectViewModel.wv0(str);
        InterfaceC30494Bxy interfaceC30494Bxy = this.LJZI;
        if (interfaceC30494Bxy != null) {
            interfaceC30494Bxy.LIZJ("livebackground");
        }
        InterfaceC30494Bxy interfaceC30494Bxy2 = this.LJZI;
        if (interfaceC30494Bxy2 != null) {
            interfaceC30494Bxy2.LJ(this.LJLLJ);
        }
        C20G c20g = this.LJZ;
        DataChannel dataChannel2 = c20g.LJLILLLLZI;
        if (dataChannel2 != null) {
            dataChannel2.mv0(MultiLiveRTCLayoutChannel.class, c20g, new IDqS416S0100000(c20g, 17));
            dataChannel2.nv0(GreenScreenCreatorBlockChannel.class, c20g, new IDqS416S0100000(c20g, 18));
        }
        DataChannelGlobal.LJLJJI.ov0(BroadcastSceneGlobalChannel.class, c20g, new IDqS416S0100000(c20g, 19));
        DataChannel dataChannel3 = c20g.LJLJLLL;
        if (dataChannel3 != null) {
            dataChannel3.mv0(SoloBgEffectSelectChannel.class, c20g, new IDqS416S0100000(c20g, 198));
        }
        GridLayoutManager gridLayoutManager = this.LJLLLLLL;
        int LJZ = ORZ.LJZ(this.LJLZ, this.LJZ.LJLIL);
        if (LJZ == -1) {
            LJZ = 0;
        }
        gridLayoutManager.LJZL(LJZ);
    }

    public final void LIZLLL(List<? extends LiveEffect> list) {
        LiveEffect liveEffect;
        if (C78886Uxe.LJJIZ(this.LJLILLLLZI)) {
            liveEffect = C79081V1x.LJIIJJI();
        } else {
            liveEffect = null;
            if (list != null) {
                Iterator<? extends LiveEffect> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    LiveEffect next = it.next();
                    if (o.LJ(next.getResourceId(), this.LJLJJL)) {
                        liveEffect = next;
                        break;
                    }
                }
                liveEffect = liveEffect;
            }
        }
        this.LJLZ = liveEffect;
    }

    public C1Q6(Context context, DataChannel dataChannel, String dialogType, View.OnClickListener onClickListener, InterfaceC28989BZh interfaceC28989BZh, String str) {
        int i;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dialogType, "dialogType");
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = dialogType;
        this.LJLJI = onClickListener;
        this.LJLJJI = interfaceC28989BZh;
        this.LJLJJL = str;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cul, C16880lQ.LLZIL(context), null);
        this.LJLJJLL = LLLZIIL;
        View findViewById = LLLZIIL.findViewById(R.id.bee);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.clear_btn)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = LLLZIIL.findViewById(R.id.title);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.title)");
        TextView textView = (TextView) findViewById2;
        View inflate = ((ViewStub) LLLZIIL.findViewById(R.id.ajb)).inflate();
        o.LJIIIIZZ(inflate, "rootView.findViewById<Vi…effect_content).inflate()");
        this.LJLJL = inflate;
        View findViewById3 = inflate.findViewById(R.id.btg);
        o.LJIIIIZZ(findViewById3, "effectContent.findViewById(R.id.content_container)");
        RunnableC31065CHd runnableC31065CHd = (RunnableC31065CHd) findViewById3;
        this.LJLJLJ = runnableC31065CHd;
        View findViewById4 = inflate.findViewById(R.id.l45);
        o.LJIIIIZZ(findViewById4, "effectContent.findViewById(R.id.text_empty_view)");
        this.LJLJLLL = (TextView) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.g94);
        o.LJIIIIZZ(findViewById5, "effectContent.findViewById(R.id.loading_view)");
        this.LJLL = findViewById5;
        View findViewById6 = inflate.findViewById(R.id.cyv);
        o.LJIIIIZZ(findViewById6, "effectContent.findViewById(R.id.error_view)");
        this.LJLLI = findViewById6;
        View findViewById7 = findViewById5.findViewById(R.id.kgw);
        o.LJIIIIZZ(findViewById7, "loadingView.findViewById…cker_dialog_loading_icon)");
        this.LJLLILLLL = findViewById7;
        this.LJLLJ = (ViewGroup) LLLZIIL.findViewById(R.id.nbw);
        BgEffectViewModel bgEffectViewModel = (BgEffectViewModel) new ViewModelProvider(C30686C2o.LJLIL, new C1Q5(new C39011g1("livebackground"), new C44821pO())).get(BgEffectViewModel.class);
        this.LJLLLL = bgEffectViewModel;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(4);
        this.LJLLLLLL = gridLayoutManager;
        C20G c20g = new C20G(dataChannel, dialogType, bgEffectViewModel);
        c20g.LJLJL = new IDqS416S0100000(this, 197);
        this.LJZ = c20g;
        if (C78886Uxe.LJJIZ(dialogType)) {
            i = R.string.m9k;
        } else {
            i = R.string.n8g;
        }
        textView.setText(C15380j0.LJIILJJIL(i));
        C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 70), findViewById6);
        C29306Beo.LJJLJLI(findViewById5);
        C29306Beo.LJI(findViewById6);
        LIZJ();
        runnableC31065CHd.LJII(new C37871eB(4, C15380j0.LIZ(14.0f), (C15380j0.LJIIL() - C15380j0.LIZ(294.0f)) / 3), -1);
        runnableC31065CHd.setHasFixedSize(true);
        runnableC31065CHd.setAdapter(c20g);
        runnableC31065CHd.setLayoutManager(gridLayoutManager);
        runnableC31065CHd.setItemAnimator(null);
        if (C78886Uxe.LJJIZ(dialogType)) {
            InterfaceC28989BZh interfaceC28989BZh2 = new InterfaceC28989BZh() { // from class: X.1Q7
                @Override // X.InterfaceC28989BZh
                public final void LIZ(LiveEffect liveEffect, LiveEffect liveEffect2) {
                    C1Q6 c1q6 = C1Q6.this;
                    if (c1q6.LJZI != null) {
                        if (liveEffect2 == null) {
                            if (liveEffect != null) {
                                C12890ez.LIZ().LIZLLL("livebackground");
                                InterfaceC30494Bxy interfaceC30494Bxy = c1q6.LJZI;
                                if (interfaceC30494Bxy != null) {
                                    interfaceC30494Bxy.LJFF(liveEffect);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        Integer LIZJ = InterfaceC30442Bx8.i2.LIZJ();
                        if (LIZJ == null || LIZJ.intValue() != 0) {
                            C31701Mg.LIZJ(c1q6.LJLIL, false);
                            C31691Mf.LIZ.LJIIJJI();
                        }
                        C12890ez.LIZ().LJJIIJ("livebackground", liveEffect, liveEffect2);
                        InterfaceC30494Bxy interfaceC30494Bxy2 = c1q6.LJZI;
                        if (interfaceC30494Bxy2 == null) {
                            return;
                        }
                        interfaceC30494Bxy2.LIZIZ(liveEffect2);
                    }
                }
            };
            this.LJLJJI = interfaceC28989BZh2;
            C11020by.LIZIZ = new WeakReference<>(interfaceC28989BZh2);
            this.LJLJI = new IDCListenerS135S0100000(this, 71);
        }
        C16880lQ.LJIILLIIL(imageView, new IDCListenerS135S0100000(this, 72));
        this.LL = new C76104Tts(1, runnableC31065CHd, new IDqS443S0100000(this, 20));
        c20g.LJLLI = this.LJZL;
    }
}
