package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviStaticImage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ryh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71307Ryh extends AbstractC029409q<C71308Ryi> {
    public final boolean LJLIL;
    public List<RTP> LJLILLLLZI = C61878OQg.INSTANCE;
    public InterfaceC88471Ynr<? super Integer, ? super RTP, C76800UCe> LJLJI;
    public Integer LJLJJI;
    public Integer LJLJJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size();
    }

    public C71307Ryh(boolean z) {
        this.LJLIL = z;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C71308Ryi c71308Ryi, int i) {
        int i2;
        UrlModel thumbnailUrl;
        C71308Ryi holder = c71308Ryi;
        o.LJIIIZ(holder, "holder");
        Context context = holder.itemView.getContext();
        RTP rtp = (RTP) ListProtector.get(this.LJLILLLLZI, i);
        ProfileNaviStaticImage profileNaviStaticImage = rtp.LIZLLL;
        if (profileNaviStaticImage != null && (thumbnailUrl = profileNaviStaticImage.getThumbnailUrl()) != null) {
            C78764Uvg.LJFF(holder.LJLILLLLZI, thumbnailUrl);
        }
        Integer num = this.LJLJJI;
        if (num == null || num.intValue() != i) {
            if (this.LJLIL) {
                i2 = R.drawable.bsx;
            } else {
                i2 = R.drawable.bsw;
            }
        } else if (this.LJLIL) {
            i2 = R.drawable.bsz;
        } else {
            i2 = R.drawable.bsy;
        }
        holder.LJLIL.setBackground(C04270Et.LIZIZ(context, i2));
        Integer num2 = this.LJLJJL;
        if (num2 == null || num2.intValue() != i) {
            holder.LJLJI.setVisibility(8);
            holder.LJLJI.clearAnimation();
        } else {
            holder.LJLJI.setVisibility(0);
            holder.LJLJI.startAnimation(AnimationUtils.loadAnimation(context, R.anim.gf));
        }
        C16880lQ.LJIIJ(new C71309Ryj(this, i, rtp), holder.itemView);
    }

    @Override // X.AbstractC029409q
    public final C71308Ryi onCreateViewHolder(ViewGroup parent, int i) {
        int i2;
        o.LJIIIZ(parent, "parent");
        if (this.LJLIL) {
            i2 = R.layout.bvy;
        } else {
            i2 = R.layout.bvx;
        }
        C71308Ryi c71308Ryi = new C71308Ryi(C1FL.LIZIZ(parent, i2, parent, false, "from(parent.context)\n   …te(layout, parent, false)"));
        C0AX.LIZ(parent, c71308Ryi.itemView, R.id.lj7);
        View view = c71308Ryi.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c71308Ryi.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C71308Ryi.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c71308Ryi.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c71308Ryi.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C71308Ryi.class.getName();
        return c71308Ryi;
    }
}
