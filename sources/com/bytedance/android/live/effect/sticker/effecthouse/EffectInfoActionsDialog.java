package com.bytedance.android.live.effect.sticker.effecthouse;

import X.BZI;
import X.C0LQ;
import X.C15380j0;
import X.C16880lQ;
import X.C28507BGt;
import X.C28787BRn;
import X.C29306Beo;
import X.C29O;
import X.C41081jM;
import X.XKX;
import Y.IDCListenerS135S0100000;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class EffectInfoActionsDialog extends LiveDialogFragment {
    public static final /* synthetic */ int LJLJL = 0;
    public LiveEffect LJLIL;
    public StickerEffectViewModel LJLILLLLZI;
    public C0LQ LJLJI;
    public boolean LJLJJI;
    public ViewGroup LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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
        C28507BGt c28507BGt = new C28507BGt(R.layout.d2l);
        c28507BGt.LIZJ = R.style.aap;
        c28507BGt.LIZIZ = 0;
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -2;
        return c28507BGt;
    }

    public final void vl(boolean z) {
        int i;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_sticker_remove_confirm_click");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJIILLIIL(this.dataChannel);
        LiveEffect liveEffect = this.LJLIL;
        if (liveEffect != null) {
            LIZ.LJIJJ(Long.valueOf(liveEffect.effectId), "sticker_id");
            LiveEffect liveEffect2 = this.LJLIL;
            if (liveEffect2 != null) {
                LIZ.LJIJJ(liveEffect2.getResourceId(), "resource_id");
                LiveEffect liveEffect3 = this.LJLIL;
                if (liveEffect3 != null) {
                    LIZ.LJIJJ(liveEffect3.getName(), "sticker_name");
                    LiveEffect liveEffect4 = this.LJLIL;
                    if (liveEffect4 != null) {
                        Effect effect = liveEffect4.getEffect();
                        if (effect != null) {
                            i = effect.getSource();
                        } else {
                            i = 0;
                        }
                        LIZ.LJIJJ(Integer.valueOf(i), "source");
                        LIZ.LJIJJ("panel", "method");
                        LIZ.LJIJJ(Integer.valueOf(z ? 1 : 0), "is_remove");
                        LIZ.LJJIIJZLJL();
                        return;
                    }
                    o.LJIJI("selectedEffect");
                    throw null;
                }
                o.LJIJI("selectedEffect");
                throw null;
            }
            o.LJIJI("selectedEffect");
            throw null;
        }
        o.LJIJI("selectedEffect");
        throw null;
    }

    public final void wl(boolean z) {
        TextView textView;
        int i;
        C41081jM c41081jM;
        int i2;
        ViewGroup viewGroup = this.LJLJJL;
        if (viewGroup != null && (c41081jM = (C41081jM) viewGroup.findViewById(R.id.e_q)) != null) {
            if (z) {
                i2 = R.drawable.crd;
            } else {
                i2 = R.drawable.cre;
            }
            c41081jM.setImageResource(i2);
        }
        ViewGroup viewGroup2 = this.LJLJJL;
        if (viewGroup2 != null && (textView = (TextView) viewGroup2.findViewById(R.id.title)) != null) {
            if (z) {
                i = R.string.kzb;
            } else {
                i = R.string.kza;
            }
            textView.setText(i);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        StickerEffectViewModel stickerEffectViewModel = this.LJLILLLLZI;
        ViewGroup viewGroup = null;
        if (stickerEffectViewModel != null) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModel), null, null, new C29O(this, null), 3);
            StickerEffectViewModel stickerEffectViewModel2 = this.LJLILLLLZI;
            if (stickerEffectViewModel2 != null) {
                List<Object> list = stickerEffectViewModel2.LJLJJI.LJLJLJ.LJLILLLLZI;
                LiveEffect liveEffect = this.LJLIL;
                if (liveEffect != null) {
                    this.LJLJJI = list.contains(liveEffect);
                    View view2 = getView();
                    if (view2 != null) {
                        viewGroup = (ViewGroup) view2.findViewById(R.id.d5b);
                    }
                    this.LJLJJL = viewGroup;
                    wl(this.LJLJJI);
                    View _$_findCachedViewById = _$_findCachedViewById(R.id.d5b);
                    C29306Beo.LJI(_$_findCachedViewById.findViewById(R.id.gm4));
                    C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 0), _$_findCachedViewById);
                    View _$_findCachedViewById2 = _$_findCachedViewById(R.id.iwx);
                    ((C41081jM) _$_findCachedViewById2.findViewById(R.id.e_q)).setImageResource(R.drawable.cs8);
                    ((TextView) _$_findCachedViewById2.findViewById(R.id.title)).setText(R.string.kzk);
                    ((TextView) _$_findCachedViewById2.findViewById(R.id.title)).setTextColor(C15380j0.LIZIZ(R.color.a3v));
                    C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 2), _$_findCachedViewById2);
                    View _$_findCachedViewById3 = _$_findCachedViewById(R.id.ivj);
                    ((C41081jM) _$_findCachedViewById3.findViewById(R.id.e_q)).setImageResource(R.drawable.cs7);
                    ((TextView) _$_findCachedViewById3.findViewById(R.id.title)).setText(R.string.kzi);
                    C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 1), _$_findCachedViewById3);
                    return;
                }
                o.LJIJI("selectedEffect");
                throw null;
            }
            o.LJIJI("viewModel");
            throw null;
        }
        o.LJIJI("viewModel");
        throw null;
    }
}
