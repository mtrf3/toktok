package com.bytedance.android.live.effect.livegoal;

import X.C05880Ky;
import X.C09650Zl;
import X.C0NA;
import X.C0NB;
import X.C0U0;
import X.C0U1;
import X.C10A;
import X.C12890ez;
import X.C15380j0;
import X.C15490jB;
import X.C15540jG;
import X.C16880lQ;
import X.C1DH;
import X.C1H1;
import X.C1H2;
import X.C221108m2;
import X.C23010vJ;
import X.C28507BGt;
import X.C29306Beo;
import X.C2A8;
import X.C30326BvG;
import X.C31691Mf;
import X.C31701Mg;
import X.C32537Cpp;
import X.C41121jQ;
import X.C47261Igj;
import X.C54522Ca;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C73943T0h;
import X.C76800UCe;
import X.C78983UzD;
import X.CFX;
import X.CN1;
import X.InterfaceC30442Bx8;
import X.InterfaceC72996Skq;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.OUP;
import X.YLM;
import Y.IDCListenerS135S0100000;
import Y.IDRunnableS85S0100000;
import Y.IDTListenerS110S0100000;
import Y.IDfS124S0200000;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.api.GreenScreenLiveGoalBlockGlobalChannel;
import com.bytedance.android.live.effect.api.LiveGoalDialogShow;
import com.bytedance.android.live.effect.api.LiveGoalEffectChannel;
import com.bytedance.android.live.effect.api.LiveGoalHighLightEvent;
import com.bytedance.android.live.effect.livegoal.LiveGoalBackgroundDialogFragment;
import com.bytedance.android.live.effect.model.LastPosition;
import com.bytedance.android.live.effect.model.LiveGoalInfo;
import com.bytedance.android.live.effect.model.VideoSize;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveGoalDialogShowChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamGoalEditWebLinkSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.m;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class LiveGoalBackgroundDialogFragment extends LiveDialogFragment {
    public static final /* synthetic */ int LLFII = 0;
    public JSONObject LJLIL;
    public List<? extends LiveEffect> LJLILLLLZI;
    public boolean LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public final AnimatorSet LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public C2A8 LJLJLLL;
    public View LJLL;
    public View LJLLI;
    public View LJLLILLLL;
    public View LJLLJ;
    public View LJLLL;
    public View LJLLLL;
    public String LJLLLLLL;
    public List<C05880Ky> LJLZ;
    public VideoSize LJZ;
    public final C15540jG LJZI;
    public boolean LJZL;
    public final C1H2 LL;
    public final C1H1 LLD;
    public final IDTListenerS110S0100000 LLF;
    public final C41121jQ LLFF;
    public final Map<Integer, View> LLFFF;

    public /* synthetic */ LiveGoalBackgroundDialogFragment(int i) {
        this();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFFF).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFFF;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.1H1] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.1jQ] */
    public LiveGoalBackgroundDialogFragment() {
        this.LLFFF = new LinkedHashMap();
        this.LJLILLLLZI = new ArrayList();
        this.LJLJJL = "";
        this.LJLJJLL = new AnimatorSet();
        this.LJLJL = C221108m2.LIZIZ(new IDqS420S0100000(this, 50));
        this.LJLJLJ = C221108m2.LIZIZ(new IDqS420S0100000(this, 49));
        this.LJZI = new C15540jG();
        this.LL = new C1H2(this);
        this.LLD = new C0U0() { // from class: X.1H1
            @Override // X.C0U0
            public final void LIZ(C05880Ky c05880Ky) {
                LiveGoalBackgroundDialogFragment liveGoalBackgroundDialogFragment = LiveGoalBackgroundDialogFragment.this;
                if (c05880Ky == null) {
                    liveGoalBackgroundDialogFragment.getClass();
                    return;
                }
                List<C05880Ky> list = liveGoalBackgroundDialogFragment.LJLZ;
                if (list == null) {
                    return;
                }
                for (C05880Ky c05880Ky2 : list) {
                    if (c05880Ky.getType() == c05880Ky2.getType()) {
                        c05880Ky2.LIZ(R.id.evj).setBackgroundResource(R.drawable.d7i);
                    } else {
                        c05880Ky2.LIZ(R.id.evj).setBackgroundResource(R.drawable.d7j);
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
            @Override // X.C0U0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(X.C0U1 r7) {
                /*
                    Method dump skipped, instructions count: 243
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1H1.LIZIZ(X.0U1):void");
            }
        };
        this.LLF = new IDTListenerS110S0100000(this, 6);
        this.LLFF = new InterfaceC88472Yns<InterfaceC72996Skq, C76800UCe>() { // from class: X.1jQ
            @Override // X.InterfaceC88472Yns
            public final C76800UCe invoke(InterfaceC72996Skq interfaceC72996Skq) {
                InterfaceC72996Skq cb = interfaceC72996Skq;
                o.LJIIIZ(cb, "cb");
                cb.LIZLLL(new IDqS416S0100000(LiveGoalBackgroundDialogFragment.this, 68));
                cb.LIZJ(C47391tX.LJLIL);
                return C76800UCe.LIZ;
            }
        };
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cy_);
        c28507BGt.LIZJ = R.style.ac9;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -1;
        c28507BGt.LJIILIIL = 3;
        c28507BGt.LJI = 0.0f;
        return c28507BGt;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, O] */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        String format;
        Object obj;
        Long l;
        int i;
        C2A8 c2a8;
        Window window;
        View decorView;
        CharSequence text;
        String optString;
        DataChannel dataChannel;
        super.onStart();
        C78983UzD.LJJLIIIJJIZ(this);
        Integer LIZJ = InterfaceC30442Bx8.i2.LIZJ();
        Long l2 = null;
        if (LIZJ == null || LIZJ.intValue() != 0) {
            List<LiveEffect> LIZ = C12890ez.LIZ().LIZ("livebackground");
            o.LJIIIIZZ(LIZ, "LiveComposerManagerProvi…el.LIVE_BACKGROUND_PANEL)");
            ?? LJLLLL = ORZ.LJLLLL(LIZ);
            if (LJLLLL != 0 && (dataChannel = C31691Mf.LIZJ) != null) {
                ((C32537Cpp) dataChannel.gv0(C54522Ca.class)).LIZ = LJLLLL;
            }
        }
        m LIZJ2 = InterfaceC30442Bx8.g2.LIZJ();
        if (LIZJ2.LJJIJ("time") != null) {
            format = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, LIZJ2.LJJIJ("time"));
            o.LJIIIIZZ(format, "get()\n                .t…liveGoalSP.get(END_TIME))");
        } else {
            format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format((Object) Long.MAX_VALUE);
            o.LJIIIIZZ(format, "SimpleDateFormat(\n      ….MAX_VALUE,\n            )");
        }
        if (LIZJ2.LJJIJ("last_position") != null) {
            obj = OUP.LJJIIZI(LIZJ2.LJJIJ("last_position"), LastPosition.class);
        } else {
            obj = null;
        }
        if (obj == null) {
            new LastPosition(10000, 10000);
        }
        String LJII = C31691Mf.LJII();
        String str = "";
        if (LJII == null) {
            LJII = "";
        }
        JSONObject jSONObject = this.LJLIL;
        if (jSONObject != null) {
            l = Long.valueOf(jSONObject.optLong("goal_num"));
        } else {
            l = null;
        }
        JSONObject jSONObject2 = this.LJLIL;
        if (jSONObject2 != null) {
            l2 = Long.valueOf(jSONObject2.optLong("cur_num"));
        }
        JSONObject jSONObject3 = this.LJLIL;
        if (jSONObject3 != null && (optString = jSONObject3.optString("goal_str")) != null) {
            str = optString;
        }
        LastPosition lastPosition = new LastPosition(10000, 10000);
        VideoSize videoSize = this.LJZ;
        int i2 = 0;
        if (videoSize != null && videoSize.isFullScreen) {
            i = 1;
        } else {
            i = 0;
        }
        Integer LIZJ3 = InterfaceC30442Bx8.j2.LIZJ();
        o.LJIIIIZZ(LIZJ3, "LIVE_GOAL_EFFECT_FIRST_USE.value");
        LiveGoalInfo liveGoalInfo = new LiveGoalInfo(LJII, l, l2, str, format, 0.38f, null, null, null, null, lastPosition, i ^ 1, LIZJ3.intValue(), 0, 0, null, null, 122880, null);
        C05880Ky c05880Ky = (C05880Ky) _$_findCachedViewById(R.id.h2y);
        if (c05880Ky != null) {
            c05880Ky.setLiveGoalInfo(liveGoalInfo);
        }
        C05880Ky c05880Ky2 = (C05880Ky) _$_findCachedViewById(R.id.dpb);
        if (c05880Ky2 != null) {
            c05880Ky2.setLiveGoalInfo(liveGoalInfo);
        }
        C05880Ky c05880Ky3 = (C05880Ky) _$_findCachedViewById(R.id.e72);
        if (c05880Ky3 != null) {
            c05880Ky3.setLiveGoalInfo(liveGoalInfo);
        }
        C05880Ky c05880Ky4 = (C05880Ky) _$_findCachedViewById(R.id.n3n);
        if (c05880Ky4 != null) {
            c05880Ky4.setLiveGoalInfo(liveGoalInfo);
        }
        C2A8 c2a82 = this.LJLJLLL;
        if (c2a82 != null && (text = c2a82.getText()) != null) {
            i2 = text.length();
        }
        if (i2 < 26) {
            C23010vJ.LIZLLL(this.LJLJLLL, 2, 700);
        } else {
            C23010vJ.LIZLLL(this.LJLJLLL, 5, 700);
            if (i2 > 34 && (c2a8 = this.LJLJLLL) != null) {
                c2a8.setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    public final void vl() {
        this.LL.LIZ = false;
        this.LJZI.LIZ();
        View _$_findCachedViewById = _$_findCachedViewById(R.id.fx2);
        if (_$_findCachedViewById != null) {
            C29306Beo.LJI(_$_findCachedViewById);
        }
        View view = this.LJLLILLLL;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJLLJ;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.j83);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.setOnTouchListener(this.LLF);
        }
    }

    public final void wl() {
        LiveEffect liveEffect;
        LiveEffect liveEffect2;
        LiveEffect liveEffect3;
        LiveEffect liveEffect4;
        LiveEffect.LiveGoalExtra liveGoalExtra;
        LiveEffect.LiveGoalExtra liveGoalExtra2;
        LiveEffect.LiveGoalExtra liveGoalExtra3;
        if (this.LJLILLLLZI.size() >= 4) {
            ((C05880Ky) _$_findCachedViewById(R.id.h2y)).setLiveEffect((LiveEffect) ListProtector.get(this.LJLILLLLZI, 0));
            ((C05880Ky) _$_findCachedViewById(R.id.dpb)).setLiveEffect((LiveEffect) ListProtector.get(this.LJLILLLLZI, 1));
            ((C05880Ky) _$_findCachedViewById(R.id.e72)).setLiveEffect((LiveEffect) ListProtector.get(this.LJLILLLLZI, 2));
            ((C05880Ky) _$_findCachedViewById(R.id.n3n)).setLiveEffect((LiveEffect) ListProtector.get(this.LJLILLLLZI, 3));
        }
        C05880Ky c05880Ky = (C05880Ky) _$_findCachedViewById(R.id.h2y);
        Iterator<? extends LiveEffect> it = this.LJLILLLLZI.iterator();
        while (true) {
            liveEffect = null;
            if (it.hasNext()) {
                liveEffect2 = it.next();
                if (liveEffect2.isNone()) {
                    break;
                }
            } else {
                liveEffect2 = null;
                break;
            }
        }
        c05880Ky.setLiveEffect(liveEffect2);
        C05880Ky c05880Ky2 = (C05880Ky) _$_findCachedViewById(R.id.dpb);
        Iterator<? extends LiveEffect> it2 = this.LJLILLLLZI.iterator();
        while (true) {
            if (it2.hasNext()) {
                liveEffect3 = it2.next();
                LiveEffect liveEffect5 = liveEffect3;
                o.LJIIIZ(liveEffect5, "<this>");
                LiveEffect.StickerSDKExtra stickerSDKExtra = liveEffect5.sdkExtraModel;
                if (stickerSDKExtra != null && (liveGoalExtra3 = stickerSDKExtra.liveGoalExtra) != null && liveGoalExtra3.isFullScreen()) {
                    break;
                }
            } else {
                liveEffect3 = null;
                break;
            }
        }
        c05880Ky2.setLiveEffect(liveEffect3);
        C05880Ky c05880Ky3 = (C05880Ky) _$_findCachedViewById(R.id.e72);
        Iterator<? extends LiveEffect> it3 = this.LJLILLLLZI.iterator();
        while (true) {
            if (it3.hasNext()) {
                liveEffect4 = it3.next();
                LiveEffect liveEffect6 = liveEffect4;
                o.LJIIIZ(liveEffect6, "<this>");
                LiveEffect.StickerSDKExtra stickerSDKExtra2 = liveEffect6.sdkExtraModel;
                if (stickerSDKExtra2 != null && (liveGoalExtra2 = stickerSDKExtra2.liveGoalExtra) != null && liveGoalExtra2.isHorizontal()) {
                    break;
                }
            } else {
                liveEffect4 = null;
                break;
            }
        }
        c05880Ky3.setLiveEffect(liveEffect4);
        C05880Ky c05880Ky4 = (C05880Ky) _$_findCachedViewById(R.id.n3n);
        Iterator<? extends LiveEffect> it4 = this.LJLILLLLZI.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            LiveEffect next = it4.next();
            LiveEffect liveEffect7 = next;
            o.LJIIIZ(liveEffect7, "<this>");
            LiveEffect.StickerSDKExtra stickerSDKExtra3 = liveEffect7.sdkExtraModel;
            if (stickerSDKExtra3 != null && (liveGoalExtra = stickerSDKExtra3.liveGoalExtra) != null && liveGoalExtra.isVertical()) {
                liveEffect = next;
                break;
            }
        }
        c05880Ky4.setLiveEffect(liveEffect);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String value;
        super.onDestroyView();
        Context context = getContext();
        if (context != null) {
            IHybridContainerService iHybridContainerService = (IHybridContainerService) CN1.LIZ(IHybridContainerService.class);
            if (C29306Beo.LJIJJLI(this.LJLJJL)) {
                value = this.LJLJJL;
            } else if (C29306Beo.LJJI()) {
                value = LiveStreamGoalEditWebLinkSetting.INSTANCE.getPreviewValue();
            } else {
                value = LiveStreamGoalEditWebLinkSetting.INSTANCE.getValue();
            }
            iHybridContainerService.Vs0(context, value, new IDqS416S0100000(this, 166));
        }
        ((C05880Ky) _$_findCachedViewById(R.id.h2y)).setDataChannel(null);
        ((C05880Ky) _$_findCachedViewById(R.id.dpb)).setDataChannel(null);
        ((C05880Ky) _$_findCachedViewById(R.id.e72)).setDataChannel(null);
        ((C05880Ky) _$_findCachedViewById(R.id.n3n)).setDataChannel(null);
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        LiveGoalInfo liveGoalInfo;
        Integer LIZJ;
        super.onResume();
        m mVar = C31691Mf.LJ;
        if (mVar != null && (liveGoalInfo = (LiveGoalInfo) OUP.LJJIIZI(mVar, LiveGoalInfo.class)) != null && ((LIZJ = InterfaceC30442Bx8.i2.LIZJ()) == null || LIZJ.intValue() != 0)) {
            C30326BvG.LIZJ(new IDRunnableS85S0100000(liveGoalInfo, 61), null, 500L);
        }
        C31701Mg.LIZ(this.dataChannel, "livesdk_stream_goal_background_panel_show").LJJIIJZLJL();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        JSONObject jSONObject = this.LJLIL;
        if (jSONObject != null) {
            str = jSONObject.optString("icon_url");
        } else {
            str = null;
        }
        C31691Mf.LJ(str, this.LJLLLLLL, this.LLFF);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.qv0(LiveGoalDialogShow.class, Boolean.FALSE);
        }
        C0NA.LIZJ(C65352Pkq.LIZ(LiveGoalDialogShowChannel.class));
    }

    public final void xl(boolean z) {
        String str;
        if (z) {
            View view = this.LJLLILLLL;
            if (view != null && view.getVisibility() == 0) {
                return;
            }
            View view2 = this.LJLLJ;
            if (view2 != null && view2.getVisibility() == 0) {
                return;
            }
            View view3 = this.LJLLILLLL;
            if (view3 != null) {
                view3.setAlpha(1.0f);
            }
            View view4 = this.LJLLJ;
            if (view4 != null) {
                view4.setAlpha(1.0f);
            }
            View view5 = this.LJLLILLLL;
            if (view5 != null) {
                view5.setVisibility(0);
            }
            View view6 = this.LJLLJ;
            if (view6 != null) {
                view6.setVisibility(0);
            }
            str = "VISIBLE";
        } else {
            View view7 = this.LJLLILLLL;
            if (view7 != null) {
                view7.setAlpha(0.0f);
            }
            View view8 = this.LJLLJ;
            if (view8 != null) {
                view8.setAlpha(0.0f);
            }
            View view9 = this.LJLLL;
            if (view9 != null) {
                view9.setVisibility(4);
            }
            View view10 = this.LJLLLL;
            if (view10 != null) {
                view10.setVisibility(4);
            }
            View view11 = this.LJLLILLLL;
            if (view11 != null) {
                view11.setVisibility(4);
            }
            View view12 = this.LJLLJ;
            if (view12 != null) {
                view12.setVisibility(4);
            }
            str = "INVISIBLE";
        }
        C0NB.LIZIZ("LiveGoalEffect", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<? extends LiveEffect> list;
        Integer num;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (list = (List) dataChannel.kv0(LiveGoalEffectChannel.class)) == null) {
            list = this.LJLILLLLZI;
        }
        this.LJLILLLLZI = list;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.qv0(LiveGoalDialogShow.class, Boolean.TRUE);
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.ov0(this, LiveGoalEffectChannel.class, new IDqS416S0100000(this, 62));
            dataChannel3.lv0(this, LiveGoalHighLightEvent.class, new IDqS416S0100000(this, 63));
        }
        Room LJIILL = C1DH.LJIILL(this.dataChannel);
        if (LJIILL != null) {
            long id = LJIILL.getId();
            IUserManageService iUserManageService = (IUserManageService) CN1.LIZ(IUserManageService.class);
            getContext();
            iUserManageService.Ye0(id, this.dataChannel, 8);
        }
        DataChannelGlobal.LJLJJI.qv0(this, this, GreenScreenLiveGoalBlockGlobalChannel.class, new IDqS416S0100000(this, 64));
        C73943T0h.LIZ().LIZJ(this, YLM.class).LIZIZ(new IDfS124S0200000(this, view, 1));
        C0NA.LIZIZ(C65352Pkq.LIZ(LiveGoalDialogShowChannel.class));
        View none_item = _$_findCachedViewById(R.id.h2y);
        o.LJIIIIZZ(none_item, "none_item");
        View full_screen_item = _$_findCachedViewById(R.id.dpb);
        o.LJIIIIZZ(full_screen_item, "full_screen_item");
        View horizontal_item = _$_findCachedViewById(R.id.e72);
        o.LJIIIIZZ(horizontal_item, "horizontal_item");
        View vertical_item = _$_findCachedViewById(R.id.n3n);
        o.LJIIIIZZ(vertical_item, "vertical_item");
        this.LJLZ = C47261Igj.LJJIJIIJI(none_item, full_screen_item, horizontal_item, vertical_item);
        this.LJLJLLL = (C2A8) view.findViewById(R.id.c_i);
        this.LJLL = view.findViewById(R.id.drk);
        View findViewById = view.findViewById(R.id.leo);
        this.LJLLI = findViewById;
        C29306Beo.LJJLIIIJILLIZJL(C15380j0.LJIILIIL(), findViewById);
        this.LJLLILLLL = view.findViewById(R.id.lfr);
        this.LJLLJ = view.findViewById(R.id.aqs);
        View view2 = this.LJLLILLLL;
        if (view2 != null) {
            view2.setAlpha(0.0f);
        }
        View view3 = this.LJLLJ;
        if (view3 != null) {
            view3.setAlpha(0.0f);
        }
        this.LJLLL = view.findViewById(R.id.lf4);
        this.LJLLLL = view.findViewById(R.id.aq2);
        C05880Ky c05880Ky = (C05880Ky) _$_findCachedViewById(R.id.h2y);
        if (c05880Ky != null) {
            C15490jB.LJ(c05880Ky.LJLIL, CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1"), "ttlive_live_goal_none.png");
            c05880Ky.setText(R.string.mr4);
            c05880Ky.setPosition(0);
            c05880Ky.setDataChannel(this.dataChannel);
            c05880Ky.setListener(this.LL);
            c05880Ky.setClickListener(this.LLD);
        }
        C05880Ky c05880Ky2 = (C05880Ky) _$_findCachedViewById(R.id.dpb);
        if (c05880Ky2 != null) {
            C15490jB.LJ(c05880Ky2.LJLIL, CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1"), "ttlive_live_goal_full_screen.png");
            c05880Ky2.setText(R.string.mr2);
            c05880Ky2.setPosition(1);
            c05880Ky2.setDataChannel(this.dataChannel);
            c05880Ky2.setListener(this.LL);
            c05880Ky2.setClickListener(this.LLD);
        }
        C05880Ky c05880Ky3 = (C05880Ky) _$_findCachedViewById(R.id.e72);
        if (c05880Ky3 != null) {
            C15490jB.LJ(c05880Ky3.LJLIL, CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1"), "ttlive_live_goal_horizontal.png");
            c05880Ky3.setText(R.string.mr3);
            c05880Ky3.setPosition(2);
            c05880Ky3.setDataChannel(this.dataChannel);
            c05880Ky3.setListener(this.LL);
            c05880Ky3.setClickListener(this.LLD);
        }
        C05880Ky c05880Ky4 = (C05880Ky) _$_findCachedViewById(R.id.n3n);
        if (c05880Ky4 != null) {
            C15490jB.LJ(c05880Ky4.LJLIL, CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1"), "ttlive_live_goal_vertical.png");
            c05880Ky4.setText(R.string.mr5);
            c05880Ky4.setPosition(3);
            c05880Ky4.setDataChannel(this.dataChannel);
            c05880Ky4.setListener(this.LL);
            c05880Ky4.setClickListener(this.LLD);
        }
        wl();
        Integer LIZJ = InterfaceC30442Bx8.i2.LIZJ();
        if (C31691Mf.LJIIIIZZ()) {
            LIZJ = 0;
        }
        List<C05880Ky> list2 = this.LJLZ;
        if (list2 != null) {
            Iterator<C05880Ky> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C05880Ky next = it.next();
                C0U1 type = next.getType();
                if (type != null) {
                    num = Integer.valueOf(type.getValue());
                } else {
                    num = null;
                }
                if (o.LJ(LIZJ, num) && !this.LJZL) {
                    next.LIZ(R.id.evj).setBackgroundResource(R.drawable.d7i);
                    break;
                }
            }
        }
        LiveIconView liveIconView = (LiveIconView) _$_findCachedViewById(R.id.aej);
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, new IDCListenerS135S0100000(this, 66));
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.j83);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setOnTouchListener(this.LLF);
        }
        if (this.LJLJI) {
            _$_findCachedViewById(R.id.h3t).setVisibility(8);
        }
    }
}
