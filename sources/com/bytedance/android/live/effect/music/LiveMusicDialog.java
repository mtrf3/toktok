package com.bytedance.android.live.effect.music;

import X.AbstractC030309z;
import X.AbstractC73672Svk;
import X.C0K5;
import X.C10A;
import X.C14270hD;
import X.C15380j0;
import X.C16880lQ;
import X.C1VT;
import X.C21Z;
import X.C28507BGt;
import X.C29306Beo;
import X.C29602Bja;
import X.C2NU;
import X.C33501Te;
import X.C41081jM;
import X.C73969T1h;
import X.C78983UzD;
import X.EnumC29596BjU;
import X.EnumC29609Bjh;
import X.InterfaceC14400hQ;
import X.InterfaceC64592gB;
import X.InterfaceC86003Zc;
import X.T16;
import Y.IDCListenerS135S0100000;
import Y.IDfS292S0100000;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.music.LiveMusicDialog;
import com.bytedance.android.live.effect.music.entity.Accompaniment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;
import o3.h0;
import ujb.s;

/* loaded from: classes.dex */
public final class LiveMusicDialog extends LiveDialogFragment implements InterfaceC14400hQ, View.OnLayoutChangeListener {
    public static final /* synthetic */ int LJLLL = 0;
    public long LJLIL;
    public C33501Te LJLILLLLZI;
    public final Drawable LJLJI;
    public final Drawable LJLJJI;
    public final Drawable LJLJJL;
    public final Drawable LJLJJLL;
    public final Drawable LJLJL;
    public final Drawable LJLJLJ;
    public final Drawable LJLJLLL;
    public int LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();

    @Override // X.InterfaceC14400hQ
    public final void Ij() {
        vl(false);
    }

    @Override // X.InterfaceC14400hQ
    public final void LJJJLL() {
        vl(false);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
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

    @Override // X.InterfaceC14400hQ
    public final void d() {
        vl(true);
    }

    public LiveMusicDialog() {
        Drawable LJI = C15380j0.LJI(R.drawable.cy1);
        o.LJIIIIZZ(LJI, "getDrawable(R.drawable.ttlive_ic_music_pause)");
        this.LJLJI = LJI;
        Drawable LJI2 = C15380j0.LJI(R.drawable.cy2);
        o.LJIIIIZZ(LJI2, "getDrawable(R.drawable.ttlive_ic_music_play)");
        this.LJLJJI = LJI2;
        Drawable LJI3 = C15380j0.LJI(R.drawable.cy3);
        o.LJIIIIZZ(LJI3, "getDrawable(R.drawable.ttlive_ic_music_play_gray)");
        this.LJLJJL = LJI3;
        Drawable LJI4 = C15380j0.LJI(R.drawable.cxz);
        o.LJIIIIZZ(LJI4, "getDrawable(R.drawable.ttlive_ic_music_next)");
        this.LJLJJLL = LJI4;
        Drawable LJI5 = C15380j0.LJI(R.drawable.cy0);
        o.LJIIIIZZ(LJI5, "getDrawable(R.drawable.ttlive_ic_music_next_gray)");
        this.LJLJL = LJI5;
        Drawable LJI6 = C15380j0.LJI(R.drawable.cy4);
        o.LJIIIIZZ(LJI6, "getDrawable(R.drawable.ttlive_ic_music_vlolume)");
        this.LJLJLJ = LJI6;
        Drawable LJI7 = C15380j0.LJI(R.drawable.cy5);
        o.LJIIIIZZ(LJI7, "getDrawable(R.drawable.t…ve_ic_music_vlolume_gray)");
        this.LJLJLLL = LJI7;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.czl);
        C78983UzD.LJIILIIL(c28507BGt);
        return c28507BGt;
    }

    @Override // X.InterfaceC14400hQ
    public final void o8() {
        C33501Te c33501Te = this.LJLILLLLZI;
        if (c33501Te != null) {
            if (c33501Te.LJLJJL) {
                c33501Te.LJLJJL = false;
                c33501Te.notifyDataSetChanged();
            }
            _$_findCachedViewById(R.id.hs1).setClickable(true);
            wl();
            vl(true);
            return;
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    public final void wl() {
        final String str;
        final String str2;
        Accompaniment accompaniment;
        Accompaniment accompaniment2;
        C1VT c1vt = C14270hD.LJZI;
        if (c1vt == null || (accompaniment2 = c1vt.getAccompaniment()) == null || (str = accompaniment2.title) == null) {
            str = "";
        }
        C1VT c1vt2 = C14270hD.LJZI;
        if (c1vt2 != null && (accompaniment = c1vt2.getAccompaniment()) != null) {
            str2 = accompaniment.author;
        } else {
            str2 = null;
        }
        AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.1H4
            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9<CharSequence> interfaceC73573Su9) {
                String str3;
                Integer valueOf;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (C39927Flj.LIZLLL(str2)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str);
                    LIZ.append(" - ");
                    LIZ.append(str2);
                    str3 = X1D.LIZIZ(LIZ);
                } else {
                    str3 = str;
                }
                spannableStringBuilder.append((CharSequence) str3);
                LiveMusicDialog liveMusicDialog = this;
                String str4 = str;
                liveMusicDialog.getClass();
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4) && str4 != null && (valueOf = Integer.valueOf(s.LJJLIIIJL(str3, str4, 0, false, 6))) != null && valueOf.intValue() != -1) {
                    C23010vJ.LJFF(spannableStringBuilder, valueOf.intValue(), str4.length() + valueOf.intValue(), 33, LiveChatShowDelayForHotLiveSetting.DEFAULT);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(C15380j0.LIZIZ(R.color.bc)), valueOf.intValue(), str4.length() + valueOf.intValue(), 33);
                }
                interfaceC73573Su9.onNext(spannableStringBuilder);
            }
        }).LJJL(T16.LIZIZ).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new IDfS292S0100000(this, 9), new InterfaceC64592gB() { // from class: X.1H5
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        _$_findCachedViewById(R.id.bst).removeOnLayoutChangeListener(this);
        C14270hD.LJFF().remove(this);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(LiveDialogStatusChannel.class, new C29602Bja(false, 0, hashCode(), EnumC29596BjU.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
        }
        _$_clearFindViewByIdCache();
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final EnumC29609Bjh getPanelType() {
        return EnumC29609Bjh.PANEL_MUSIC;
    }

    @Override // X.InterfaceC14400hQ
    public final void t6(long j) {
        if (!C14270hD.LL) {
            C33501Te c33501Te = this.LJLILLLLZI;
            if (c33501Te != null) {
                if (c33501Te.LJLJJI == j) {
                    c33501Te.LJLJJL = true;
                    c33501Te.notifyDataSetChanged();
                }
                ((TextView) _$_findCachedViewById(R.id.gtg)).setText(C15380j0.LJIILJJIL(R.string.mex));
                _$_findCachedViewById(R.id.hs1).setClickable(false);
                vl(false);
                return;
            }
            o.LJIJI("mAdapter");
            throw null;
        }
    }

    public final void vl(boolean z) {
        boolean z2;
        Drawable drawable;
        String str;
        Drawable drawable2;
        Drawable drawable3;
        if (C14270hD.LJZI != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && C14270hD.LJZ != 0) {
            ((ImageView) _$_findCachedViewById(R.id.hs1)).setImageDrawable(this.LJLJJL);
        } else {
            ImageView imageView = (ImageView) _$_findCachedViewById(R.id.hs1);
            if (z) {
                drawable = this.LJLJI;
            } else {
                drawable = this.LJLJJI;
            }
            imageView.setImageDrawable(drawable);
            View _$_findCachedViewById = _$_findCachedViewById(R.id.hs1);
            if (z) {
                str = this.LJLLILLLL;
            } else {
                str = this.LJLLI;
            }
            _$_findCachedViewById.setContentDescription(str);
        }
        C41081jM c41081jM = (C41081jM) _$_findCachedViewById(R.id.h0y);
        if (z2) {
            drawable2 = this.LJLJJLL;
        } else {
            drawable2 = this.LJLJL;
        }
        c41081jM.setImageDrawable(drawable2);
        _$_findCachedViewById(R.id.h0y).setClickable(z2);
        C41081jM c41081jM2 = (C41081jM) _$_findCachedViewById(R.id.ne2);
        if (z2) {
            drawable3 = this.LJLJLJ;
        } else {
            drawable3 = this.LJLJLLL;
        }
        c41081jM2.setImageDrawable(drawable3);
        _$_findCachedViewById(R.id.ne2).setClickable(z2);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        _$_findCachedViewById(R.id.bst).addOnLayoutChangeListener(this);
        _$_findCachedViewById(R.id.bst).getLayoutParams().height = (getResources().getDisplayMetrics().heightPixels * 34) / 100;
        _$_findCachedViewById(R.id.bst).getBackground().setAlpha(255);
        C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 50), _$_findCachedViewById(R.id.he_));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.gq_);
        recyclerView.getContext();
        boolean z = false;
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        C33501Te c33501Te = new C33501Te(this.dataChannel, C21Z.LJLIL);
        this.LJLILLLLZI = c33501Te;
        recyclerView.setAdapter(c33501Te);
        recyclerView.LJII(new AbstractC030309z() { // from class: X.1Tg
            @Override // X.AbstractC030309z
            public final void LJ(Rect rect, View view2, RecyclerView recyclerView2, C0AC c0ac) {
                T28.LJ(rect, "outRect", view2, "view", recyclerView2, "parent", c0ac, "state");
                super.LJ(rect, view2, recyclerView2, c0ac);
                rect.set(12, 40, 12, 20);
            }
        }, -1);
        recyclerView.setHasFixedSize(true);
        C14270hD.LJFF().add(this);
        wl();
        vl(C14270hD.LL);
        View next_button = _$_findCachedViewById(R.id.h0y);
        o.LJIIIIZZ(next_button, "next_button");
        C29306Beo.LJJJLL(next_button, 500L, new IDqS416S0100000(this, 226));
        View volume_button = _$_findCachedViewById(R.id.ne2);
        o.LJIIIIZZ(volume_button, "volume_button");
        C29306Beo.LJJJLL(volume_button, 500L, new IDqS416S0100000(this, 227));
        View play_pause_button = _$_findCachedViewById(R.id.hs1);
        o.LJIIIIZZ(play_pause_button, "play_pause_button");
        C29306Beo.LJJJLL(play_pause_button, 500L, new IDqS416S0100000(this, 228));
        getContext();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
        }
        if (!z) {
            ((C0K5) _$_findCachedViewById(R.id.gt7)).LJI();
        } else {
            ((C0K5) _$_findCachedViewById(R.id.gt7)).LJFF();
            C14270hD.LIZIZ(new IDqS416S0100000(this, 224));
        }
        h0.LJIJJ(_$_findCachedViewById(R.id.bst).findViewById(R.id.title), true);
        this.LJLLILLLL = view.getContext().getResources().getString(R.string.k48);
        this.LJLLI = view.getContext().getResources().getString(R.string.k49);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.LJLL != _$_findCachedViewById(R.id.bst).getHeight()) {
            int height = _$_findCachedViewById(R.id.bst).getHeight();
            this.LJLL = height;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(LiveDialogStatusChannel.class, new C29602Bja(true, height, hashCode(), EnumC29596BjU.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
            }
        }
    }
}
