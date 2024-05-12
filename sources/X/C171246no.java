package X;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* renamed from: X.6no, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171246no extends AbstractC171276nr<C171266nq> {
    public C171236nn LJLJJI;
    public boolean LJLJJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLILLLLZI).size();
    }

    public C171246no(C84507XEp c84507XEp) {
        super(c84507XEp);
        this.LJLJJL = true;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (C164996dj.LIZLLL(((EffectModel) ListProtector.get(this.LJLILLLLZI, i)).category)) {
            return 2;
        }
        return 1;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C171266nq c171266nq = (C171266nq) viewHolder;
        EffectModel effectModel = (EffectModel) ListProtector.get(this.LJLILLLLZI, i);
        int intValue = ((Number) ListProtector.get(this.LJLJI, i)).intValue();
        if (effectModel == null) {
            c171266nq.getClass();
        } else {
            c171266nq.LJLILLLLZI.setText(effectModel.name);
            if (!TextUtils.isEmpty(effectModel.iconUrl) && !effectModel.iconUrl.equals(c171266nq.LJLJI.getTag())) {
                if (CastIntegerProtector.parseInt(effectModel.key) < 0) {
                    int identifier = C60903NvH.LJ.getResources().getIdentifier(effectModel.iconUrl, "drawable", C60903NvH.LJ.getPackageName());
                    C72790ShW c72790ShW = c171266nq.LJLJI;
                    c72790ShW.setImageDrawable(c72790ShW.getResources().getDrawable(identifier));
                    c171266nq.LJLJI.setTag(effectModel.iconUrl);
                }
                C72790ShW c72790ShW2 = c171266nq.LJLJI;
                String str = effectModel.iconUrl;
                Bitmap.Config config = Bitmap.Config.RGB_565;
                c72790ShW2.getClass();
                C170676mt.LIZIZ(c72790ShW2, str, config);
                c171266nq.LJLJI.setTag(effectModel.iconUrl);
            }
            if (c171266nq.LJLJJLL != intValue) {
                c171266nq.LJLJJLL = intValue;
                if (intValue != 2) {
                    if (intValue != 4) {
                        if (intValue != 8) {
                            if (intValue != 16) {
                                if (intValue == 32) {
                                    if (C74216TAu.LIZIZ.LIZIZ()) {
                                        C78596Usy.LJJJLIIL(c171266nq.LJLIL.getContext(), false);
                                    }
                                    c171266nq.LJLIL.setVisibility(0);
                                    c171266nq.L();
                                }
                            } else {
                                c171266nq.L();
                                c171266nq.LJLIL.setVisibility(8);
                            }
                        } else {
                            c171266nq.LJLIL.setVisibility(0);
                            c171266nq.LJLIL.setImageResource(R.drawable.th);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c171266nq.LJLIL, "rotation", 0.0f, 360.0f);
                            c171266nq.LJLJJL = ofFloat;
                            ofFloat.setDuration(800L);
                            c171266nq.LJLJJL.setRepeatMode(1);
                            c171266nq.LJLJJL.setRepeatCount(-1);
                            C149985uc.LIZ(c171266nq.LJLJJL);
                            c171266nq.LJLJJL.start();
                        }
                    } else {
                        c171266nq.LJLIL.setVisibility(8);
                    }
                } else {
                    c171266nq.L();
                    c171266nq.LJLIL.setVisibility(0);
                }
            }
            if (effectModel.isGoToCapCutEffect) {
                c171266nq.LJLJJI.setVisibility(0);
            } else {
                c171266nq.LJLJJI.setVisibility(8);
            }
        }
        c171266nq.M(this.LJLJJL);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        C171266nq c171266nq = new C171266nq(this, C28289B8j.LIZ(viewGroup, R.layout.bc0, viewGroup, false));
        if (i == 2) {
            C72790ShW c72790ShW = c171266nq.LJLJI;
            c72790ShW.setOnTouchListener(new ViewOnTouchListenerC170476mZ(1.2f, 100L, c72790ShW));
        }
        C0AX.LIZ(viewGroup, c171266nq.itemView, R.id.lj7);
        View view = c171266nq.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c171266nq.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C171266nq.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c171266nq.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c171266nq.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C171266nq.class.getName();
        return c171266nq;
    }
}
