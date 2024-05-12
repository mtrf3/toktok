package X;

import Y.ARunnableS49S0100000_13;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.EmoteEditDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.EditTextStickerViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UGB implements InterfaceC87207YKl {
    public final /* synthetic */ EmoteEditDialogFragment LIZ;

    @Override // X.InterfaceC87207YKl
    public final float LIZ(float f) {
        return f;
    }

    @Override // X.InterfaceC87207YKl
    public final void LIZIZ(YKR textStickerView) {
        o.LJIIIZ(textStickerView, "textStickerView");
    }

    @Override // X.InterfaceC87207YKl
    public final void LJFF(YKR view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.InterfaceC87207YKl
    public final void LJII(YKR stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
    }

    public UGB(EmoteEditDialogFragment emoteEditDialogFragment) {
        this.LIZ = emoteEditDialogFragment;
    }

    @Override // X.InterfaceC87207YKl
    public final void LIZJ(YKR textStickerView) {
        o.LJIIIZ(textStickerView, "textStickerView");
        EditTextStickerViewModel editTextStickerViewModel = this.LIZ.LJLLJ;
        if (editTextStickerViewModel != null) {
            editTextStickerViewModel.o().LJII(Boolean.FALSE);
            EmoteEditDialogFragment emoteEditDialogFragment = this.LIZ;
            emoteEditDialogFragment.LJLLILLLL = textStickerView;
            emoteEditDialogFragment.Hl(textStickerView);
            return;
        }
        o.LJIJI("textStickerViewModel");
        throw null;
    }

    @Override // X.InterfaceC87207YKl
    public final PointF LJ(YKR view) {
        o.LJIIIZ(view, "view");
        return new PointF(0.0f, 0.0f);
    }

    @Override // X.InterfaceC87207YKl
    public final void LJI(YKR stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        EmoteEditDialogFragment emoteEditDialogFragment = this.LIZ;
        emoteEditDialogFragment.LJLJJI = emoteEditDialogFragment.Al(stickerView);
        this.LIZ.Dl(stickerView);
    }

    @Override // X.InterfaceC87207YKl
    public final void LIZLLL(YKR textStickerView, RectF rectF, UGD ugd) {
        o.LJIIIZ(textStickerView, "textStickerView");
        if (!ugd.LJLJJI && !ugd.LJLJJL) {
            boolean LJIIZILJ = O5Y.LJIIZILJ(this.LIZ.LJLLL, textStickerView.getAnglePointList());
            C6D9 c6d9 = (C6D9) this.LIZ._$_findCachedViewById(R.id.kg_);
            if (c6d9 != null) {
                EmoteEditDialogFragment emoteEditDialogFragment = this.LIZ;
                int LIZJ = c6d9.LIZJ(ugd.LJLIL - textStickerView.getDeltaX(), ugd.LJLILLLLZI - textStickerView.getDeltaY(), ugd.LJLJI, LJIIZILJ);
                emoteEditDialogFragment.getClass();
                if (LIZJ != 1) {
                    if (LIZJ != 3) {
                        if (LIZJ == 4) {
                            textStickerView.LJIIJ(0.3137255f, true);
                        }
                    } else {
                        C16880lQ.LJLLLL(textStickerView, (FrameLayout) emoteEditDialogFragment._$_findCachedViewById(R.id.dh7));
                        EditTextStickerViewModel editTextStickerViewModel = emoteEditDialogFragment.LJLLJ;
                        if (editTextStickerViewModel != null) {
                            editTextStickerViewModel.Tv0(textStickerView);
                            emoteEditDialogFragment.LJLLILLLL = null;
                            emoteEditDialogFragment._$_findCachedViewById(R.id.cor).setVisibility(8);
                            ViewGroup.LayoutParams layoutParams = emoteEditDialogFragment._$_findCachedViewById(R.id.cor).getLayoutParams();
                            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                marginLayoutParams.leftMargin = 0;
                                marginLayoutParams.topMargin = 0;
                            }
                            layoutParams.width = -1;
                            layoutParams.height = -1;
                            emoteEditDialogFragment._$_findCachedViewById(R.id.cor).setLayoutParams(layoutParams);
                            View _$_findCachedViewById = emoteEditDialogFragment._$_findCachedViewById(R.id.dh7);
                            if (_$_findCachedViewById != null) {
                                _$_findCachedViewById.post(new ARunnableS49S0100000_13(emoteEditDialogFragment, 19));
                            }
                        } else {
                            o.LJIJI("textStickerViewModel");
                            throw null;
                        }
                    }
                } else {
                    textStickerView.LJIIJ(0.3137255f, false);
                }
            }
        }
        if (this.LIZ._$_findCachedViewById(R.id.kg_) != null) {
            textStickerView.setAlpha(1.0f);
        }
    }
}
