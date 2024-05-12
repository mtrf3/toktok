package X;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.6mU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170426mU extends AbstractC029409q<C170456mX> {
    public List<EffectModel> LJLIL;
    public C170506mc LJLILLLLZI;
    public int LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C170456mX c170456mX, int i) {
        int i2;
        int i3;
        Drawable LIZ;
        int i4;
        C170456mX c170456mX2 = c170456mX;
        EffectModel effectModel = (EffectModel) ListProtector.get(c170456mX2.LJLJJI.LJLIL, i);
        Drawable drawable = c170456mX2.LJLIL.getResources().getDrawable(effectModel.imagePath);
        if (!effectModel.isEnabled) {
            i2 = 127;
        } else {
            i2 = 255;
        }
        if (i == 0 || C149015t3.LIZIZ()) {
            if (C149015t3.LIZIZ()) {
                if (i == 0) {
                    i3 = 10;
                } else {
                    i3 = 6;
                }
            } else {
                i3 = 12;
            }
            int LIZJ = (int) KL2.LIZJ(c170456mX2.LJLIL.getContext(), i3);
            int LIZJ2 = (int) KL2.LIZJ(c170456mX2.LJLIL.getContext(), 8.0f);
            int color = c170456mX2.itemView.getContext().getResources().getColor(R.color.bb);
            drawable = C78885Uxd.LIZLLL(drawable);
            c170456mX2.LJLIL.setImageDrawable(drawable);
            c170456mX2.LJLIL.setPadding(LIZJ, LIZJ, LIZJ, LIZJ);
            C72790ShW c72790ShW = c170456mX2.LJLIL;
            if (C149015t3.LIZIZ()) {
                LIZ = C78127UlP.LIZJ(color, color, 0, LIZJ2);
            } else {
                LIZ = C78127UlP.LIZ(color, color, 0);
            }
            c72790ShW.setBackground(LIZ);
        } else {
            c170456mX2.LJLIL.setBackground(drawable);
            c170456mX2.LJLIL.setImageDrawable(null);
        }
        SpannableString spannableString = new SpannableString(effectModel.name);
        spannableString.setSpan(new ForegroundColorSpan(C07290Qj.LJIIL(AnonymousClass636.LJIIIIZZ(R.attr.cl, C60903NvH.LJ), i2)), 0, spannableString.length(), 17);
        drawable.setAlpha(i2);
        c170456mX2.LJLILLLLZI.setText(spannableString);
        if (i == c170456mX2.LJLJJI.LJLJI) {
            c170456mX2.LJLILLLLZI.LJJIJL(true);
            c170456mX2.LJLILLLLZI.setSelected(true);
            c170456mX2.LJLILLLLZI.setTypeface(Typeface.defaultFromStyle(1));
            View view = c170456mX2.LJLJI;
            Resources resources = view.getResources();
            if (C149015t3.LIZIZ()) {
                i4 = R.drawable.sc;
            } else {
                i4 = R.drawable.sb;
            }
            view.setBackground(resources.getDrawable(i4));
            return;
        }
        c170456mX2.LJLILLLLZI.LJJIJL(false);
        c170456mX2.LJLILLLLZI.setSelected(false);
        c170456mX2.LJLILLLLZI.setTypeface(Typeface.defaultFromStyle(0));
        c170456mX2.LJLJI.setBackground(null);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C170456mX com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        C170456mX c170456mX = new C170456mX(this, C28289B8j.LIZ(viewGroup, R.layout.bc2, viewGroup, false));
        C0AX.LIZ(viewGroup, c170456mX.itemView, R.id.lj7);
        View view = c170456mX.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c170456mX.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C170456mX.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c170456mX.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c170456mX.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C170456mX.class.getName();
        return c170456mX;
    }
}
