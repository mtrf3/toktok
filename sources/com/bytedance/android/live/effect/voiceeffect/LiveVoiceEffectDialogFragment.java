package com.bytedance.android.live.effect.voiceeffect;

import X.AbstractC030309z;
import X.C06020Lm;
import X.C10A;
import X.C16880lQ;
import X.C1O0;
import X.C1O2;
import X.C28507BGt;
import X.C29306Beo;
import X.C29602Bja;
import X.C2DR;
import X.C30686C2o;
import X.C32131Nx;
import X.C32141Ny;
import X.C42181l8;
import X.C54222Aw;
import X.C5H3;
import X.C78983UzD;
import X.C88207Yjb;
import X.CHK;
import X.CHM;
import X.EnumC29596BjU;
import X.EnumC29609Bjh;
import X.EnumC31066CHe;
import X.InterfaceC08970Wv;
import X.InterfaceC08980Ww;
import X.RunnableC31065CHd;
import X.XKX;
import Y.IDCListenerS135S0100000;
import Y.IDRunnableS29S0200000;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastVoiceEffectSelectedChannel;
import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class LiveVoiceEffectDialogFragment extends LiveDialogFragment implements InterfaceC08970Wv, InterfaceC08980Ww, View.OnLayoutChangeListener {
    public int LJLIL;
    public C32131Nx LJLILLLLZI;
    public VoiceEffectViewModel LJLJI;
    public final Map<Integer, View> LJLJJI;

    public /* synthetic */ LiveVoiceEffectDialogFragment(int i) {
        this();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    public LiveVoiceEffectDialogFragment() {
        this.LJLJJI = new LinkedHashMap();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.d2g);
        C78983UzD.LJIILIIL(c28507BGt);
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        _$_findCachedViewById(R.id.k7e).removeOnLayoutChangeListener(this);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(LiveDialogStatusChannel.class, new C29602Bja(false, 0, hashCode(), EnumC29596BjU.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
        }
        C32141Ny.LJII = null;
        C32141Ny.LJI = null;
        C32141Ny.LIZ();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        C78983UzD.LJJLIIIJJIZ(this);
        C32131Nx c32131Nx = this.LJLILLLLZI;
        if (c32131Nx != null && c32131Nx.LJLJL) {
            C32141Ny.LIZ();
            c32131Nx.LJLJL = false;
            c32131Nx.notifyDataSetChanged();
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final EnumC29609Bjh getPanelType() {
        return EnumC29609Bjh.PANEL_EFFECT_VOICE;
    }

    @Override // X.InterfaceC08970Wv
    public final void D2(boolean z) {
        if (z) {
            ((TextView) _$_findCachedViewById(R.id.mqf)).setText(R.string.mp7);
            C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.a_i));
            C06020Lm c06020Lm = (C06020Lm) _$_findCachedViewById(R.id.a9t);
            Iterator<ValueAnimator> it = c06020Lm.LJLILLLLZI.iterator();
            while (it.hasNext()) {
                ValueAnimator next = it.next();
                int viewAnimatorHeight = c06020Lm.getViewAnimatorHeight();
                int i = c06020Lm.LJLJJL;
                next.setIntValues(i, viewAnimatorHeight, i);
                next.start();
            }
            return;
        }
        ((TextView) _$_findCachedViewById(R.id.mqf)).setText(R.string.mp6);
        C29306Beo.LJI(_$_findCachedViewById(R.id.a_i));
        Iterator<ValueAnimator> it2 = ((C06020Lm) _$_findCachedViewById(R.id.a9t)).LJLILLLLZI.iterator();
        while (it2.hasNext()) {
            it2.next().cancel();
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(true);
        C32141Ny.LJII = this;
        C32141Ny.LJI = this;
    }

    @Override // X.InterfaceC08980Ww
    public final void Y(LiveEffect liveEffect, boolean z) {
        int i;
        o.LJIIIZ(liveEffect, "liveEffect");
        if (z) {
            i = R.string.mp5;
        } else {
            i = R.string.mp6;
        }
        ((TextView) _$_findCachedViewById(R.id.mqf)).setText(i);
        if (!z) {
            Handler handler = (Handler) C32141Ny.LJIIJJI.getValue();
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new IDRunnableS29S0200000(this, liveEffect, 22), 30000L);
        } else {
            ((Handler) C32141Ny.LJIIJJI.getValue()).removeCallbacksAndMessages(null);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(BroadcastVoiceEffectSelectedChannel.class, Boolean.valueOf(!z));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CHK chk;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (mo49getActivity() != null) {
            VoiceEffectViewModel voiceEffectViewModel = (VoiceEffectViewModel) new ViewModelProvider(C30686C2o.LJLIL, new C1O2(new C1O0(), new C42181l8())).get(VoiceEffectViewModel.class);
            this.LJLILLLLZI = new C32131Nx(this.dataChannel, voiceEffectViewModel);
            this.LJLJI = voiceEffectViewModel;
        }
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2DR(this, null), 3);
        _$_findCachedViewById(R.id.k7e).getBackground().setAlpha(255);
        C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 67), _$_findCachedViewById(R.id.nb3));
        RunnableC31065CHd runnableC31065CHd = (RunnableC31065CHd) _$_findCachedViewById(R.id.j_r);
        runnableC31065CHd.getContext();
        runnableC31065CHd.setLayoutManager(new LinearLayoutManager(0, false));
        runnableC31065CHd.LJII(new AbstractC030309z() { // from class: X.1O3
            @Override // X.AbstractC030309z
            public final void LJ(Rect rect, View view2, RecyclerView recyclerView, C0AC c0ac) {
                boolean z;
                T28.LJ(rect, "outRect", view2, "view", recyclerView, "parent", c0ac, "state");
                if (C16310kV.LIZLLL(recyclerView) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                int LJJJJIZL = RecyclerView.LJJJJIZL(view2);
                if (LJJJJIZL == 0) {
                    if (z) {
                        rect.right = C15380j0.LJFF(R.dimen.abf);
                    } else {
                        rect.left = C15380j0.LJFF(R.dimen.abf);
                    }
                } else if (z) {
                    rect.right = C15380j0.LJFF(R.dimen.abe);
                } else {
                    rect.left = C15380j0.LJFF(R.dimen.abe);
                }
                C0A2 layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null && LJJJJIZL == layoutManager.LJJJJZ() - 1) {
                    if (z) {
                        rect.left = C15380j0.LJFF(R.dimen.abf);
                    } else {
                        rect.right = C15380j0.LJFF(R.dimen.abf);
                    }
                }
            }
        }, -1);
        runnableC31065CHd.setAdapter(this.LJLILLLLZI);
        runnableC31065CHd.setHasFixedSize(true);
        runnableC31065CHd.setItemAnimator(null);
        RecyclerView.RecycledViewPool LJLJL = runnableC31065CHd.LJLJL(EnumC31066CHe.EFFECT_VOICE, true);
        if (LJLJL != null) {
            LJLJL.setMaxRecycledViews(0, 7);
        }
        RecyclerView rv_voice_item = (RecyclerView) _$_findCachedViewById(R.id.j_r);
        o.LJIIIIZZ(rv_voice_item, "rv_voice_item");
        C5H3 c5h3 = (C5H3) ((LinkedHashMap) C88207Yjb.LJ).get("panel_sound_slide");
        if (c5h3 != null) {
            chk = (CHK) c5h3.getValue();
        } else {
            chk = null;
        }
        rv_voice_item.LJIIJJI(new CHM(chk));
        _$_findCachedViewById(R.id.k7e).addOnLayoutChangeListener(this);
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C54222Aw(this, null), 3);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.LJLIL != _$_findCachedViewById(R.id.k7e).getHeight()) {
            int height = _$_findCachedViewById(R.id.k7e).getHeight();
            this.LJLIL = height;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(LiveDialogStatusChannel.class, new C29602Bja(true, height, hashCode(), EnumC29596BjU.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
            }
        }
    }
}
