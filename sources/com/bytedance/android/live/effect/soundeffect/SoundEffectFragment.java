package com.bytedance.android.live.effect.soundeffect;

import X.ActivityC45651qj;
import X.C08930Wr;
import X.C0K4;
import X.C0K5;
import X.C10A;
import X.C15380j0;
import X.C16880lQ;
import X.C28507BGt;
import X.C28J;
import X.C28R;
import X.C29306Beo;
import X.C29602Bja;
import X.C2H9;
import X.C2HD;
import X.C37871eB;
import X.C37901eE;
import X.C37911eF;
import X.C37931eH;
import X.C37951eJ;
import X.C44351od;
import X.C47121t6;
import X.C51029K0z;
import X.C76104Tts;
import X.C78983UzD;
import X.EnumC29596BjU;
import X.EnumC31066CHe;
import X.RunnableC31065CHd;
import X.XKX;
import Y.IDCListenerS135S0100000;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.api.SoundEffectPanelCloseEvent;
import com.bytedance.android.live.effect.soundeffect.SoundEffectFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSoundEffectNewPanelTypeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class SoundEffectFragment extends LiveDialogFragment implements View.OnLayoutChangeListener {
    public static final /* synthetic */ int LJLJLJ = 0;
    public SoundEffectViewModel LJLIL;
    public C44351od LJLILLLLZI;
    public C76104Tts LJLJI;
    public long LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.d2d);
        C78983UzD.LJIILIIL(c28507BGt);
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        C78983UzD.LJJLIIIJJIZ(this);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        _$_findCachedViewById(R.id.af5).removeOnLayoutChangeListener(this);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.pv0(SoundEffectPanelCloseEvent.class);
        }
        C08930Wr.LIZIZ(this.LJLJJI, this.dataChannel, false);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.rv0(LiveDialogStatusChannel.class, new C29602Bja(false, 0, hashCode(), EnumC29596BjU.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C44351od c28j;
        long j;
        Room room;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJJI = System.currentTimeMillis();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
            if (LJIILIIL != null && (room = (Room) LJIILIIL.kv0(RoomChannel.class)) != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            this.LJLIL = (SoundEffectViewModel) ViewModelProviders.of(mo49getActivity, new C37901eE(new C37931eH(j), new C37951eJ())).get(SoundEffectViewModel.class);
        }
        this.LJLJJLL = LiveSoundEffectNewPanelTypeSetting.useNewSoundEffectDialog();
        _$_findCachedViewById(R.id.af5).getBackground().setAlpha(255);
        C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 93), _$_findCachedViewById(R.id.cc0));
        if (!this.LJLJJLL) {
            c28j = new C44351od(this.dataChannel, false, this, this.LJLIL, R.layout.d2o);
        } else {
            c28j = new C28J(this.dataChannel, this, this.LJLIL);
        }
        this.LJLILLLLZI = c28j;
        if (this.LJLJJLL) {
            C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.co3));
            C16880lQ.LJJIIZ((C47121t6) _$_findCachedViewById(R.id.co3), new IDCListenerS135S0100000(this, 94));
        } else {
            C29306Beo.LJJJJLI(C15380j0.LIZ(133.0f), _$_findCachedViewById(R.id.gyn));
        }
        RunnableC31065CHd runnableC31065CHd = (RunnableC31065CHd) _$_findCachedViewById(R.id.j_m);
        if (this.LJLJJLL) {
            runnableC31065CHd.LJII(new C37871eB(5, 0, (C15380j0.LJIIL() - C15380j0.LIZ(372.0f)) / 4), -1);
            runnableC31065CHd.setHasFixedSize(true);
            runnableC31065CHd.setItemAnimator(new C28R(C15380j0.LIZ(60.0f)));
            RecyclerView.RecycledViewPool LJLJL = runnableC31065CHd.LJLJL(EnumC31066CHe.EFFECT_SOUND_EDITABLE, true);
            if (LJLJL != null) {
                LJLJL.setMaxRecycledViews(0, 10);
            }
            int LIZ = C15380j0.LIZ(16.0f);
            C29306Beo.LJJJJZ(LIZ, LIZ, runnableC31065CHd);
            C76104Tts c76104Tts = new C76104Tts(1, runnableC31065CHd, new IDqS443S0100000(this, 47));
            this.LJLJI = c76104Tts;
            c76104Tts.LIZJ(true);
            C44351od c44351od = this.LJLILLLLZI;
            if (c44351od != null) {
                runnableC31065CHd.setAdapter(c44351od);
                runnableC31065CHd.getContext();
                GridLayoutManager gridLayoutManager = new GridLayoutManager(5);
                gridLayoutManager.LLJJIJIIJIL(false);
                runnableC31065CHd.setLayoutManager(gridLayoutManager);
            } else {
                o.LJIJI("soundEffectAdapter");
                throw null;
            }
        } else {
            runnableC31065CHd.getContext();
            runnableC31065CHd.setLayoutManager(new LinearLayoutManager(0, false));
            runnableC31065CHd.LJII(new C37911eF(18.0f, 18.0f, 12.0f), -1);
            C44351od c44351od2 = this.LJLILLLLZI;
            if (c44351od2 != null) {
                runnableC31065CHd.setAdapter(c44351od2);
                runnableC31065CHd.setHasFixedSize(true);
                runnableC31065CHd.setItemAnimator(null);
                RecyclerView.RecycledViewPool LJLJL2 = runnableC31065CHd.LJLJL(EnumC31066CHe.EFFECT_SOUND, true);
                if (LJLJL2 != null) {
                    LJLJL2.setMaxRecycledViews(0, 7);
                }
                C76104Tts c76104Tts2 = new C76104Tts(0, runnableC31065CHd, new IDqS443S0100000(this, 48));
                this.LJLJI = c76104Tts2;
                c76104Tts2.LIZJ(true);
            } else {
                o.LJIJI("soundEffectAdapter");
                throw null;
            }
        }
        ((C0K5) _$_findCachedViewById(R.id.cst)).setErrorClickListener(new C0K4() { // from class: X.1eG
            @Override // X.C0K4
            public final void LIZIZ() {
                SoundEffectFragment soundEffectFragment = SoundEffectFragment.this;
                soundEffectFragment.getClass();
                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(soundEffectFragment), null, null, new C2H9(soundEffectFragment, null), 3);
            }
        });
        _$_findCachedViewById(R.id.af5).addOnLayoutChangeListener(this);
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2HD(this, null), 3);
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2H9(this, null), 3);
        C08930Wr.LIZJ(this.dataChannel, false);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.LJLJJL != _$_findCachedViewById(R.id.af5).getHeight()) {
            int height = _$_findCachedViewById(R.id.af5).getHeight();
            this.LJLJJL = height;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(LiveDialogStatusChannel.class, new C29602Bja(true, height, hashCode(), EnumC29596BjU.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
            }
        }
    }
}
