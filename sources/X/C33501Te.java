package X;

import Y.IDCListenerS83S0200000;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import com.bytedance.android.live.effect.music.entity.Album;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1Te, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33501Te extends AbstractC029409q<C33531Th> {
    public final DataChannel LJLIL;
    public final InterfaceC88472Yns<Album, C76800UCe> LJLILLLLZI;
    public final List<Album> LJLJI;
    public long LJLJJI;
    public boolean LJLJJL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJI).size();
    }

    public C33501Te(DataChannel dataChannel, C21Z onClick) {
        o.LJIIIZ(onClick, "onClick");
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = onClick;
        this.LJLJI = new ArrayList();
        this.LJLJJI = C14270hD.LJZ;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C33531Th c33531Th, int i) {
        C33531Th holder = c33531Th;
        o.LJIIIZ(holder, "holder");
        Album album = (Album) ListProtector.get(this.LJLJI, i);
        C78720Uuy LIZ = C15650jR.LIZ().LIZ(C47261Igj.LJJIJIL(album.cover));
        LIZ.LJIIIIZZ = R.drawable.cuf;
        LIZ.LJIIJJI(holder.LJLIL);
        holder.LJLILLLLZI.setText(album.name);
        if (this.LJLJJI == album.id) {
            holder.LJLJI.setVisibility(0);
            C87277YNd.LJJIIJZLJL(holder.LJLILLLLZI, R.color.zk);
        } else {
            holder.LJLJI.setVisibility(8);
            C87277YNd.LJJIIJZLJL(holder.LJLILLLLZI, R.color.a48);
        }
        if (this.LJLJJI == album.id && this.LJLJJL) {
            holder.LJLIL.setAlpha(0.7f);
            holder.LJLJJI.setVisibility(0);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(2000L);
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            holder.LJLJJI.setAnimation(rotateAnimation);
            holder.LJLJJI.startAnimation(rotateAnimation);
        } else {
            holder.LJLIL.setAlpha(1.0f);
            holder.LJLJJI.clearAnimation();
            holder.LJLJJI.setVisibility(8);
        }
        C16880lQ.LJIIJ(new IDCListenerS83S0200000(album, this, 10), holder.itemView);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C33531Th com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C33531Th c33531Th = new C33531Th(C1FL.LIZIZ(parent, R.layout.dfu, parent, false, "from(parent.context).inf…usic_item, parent, false)"));
        C0AX.LIZ(parent, c33531Th.itemView, R.id.lj7);
        View view = c33531Th.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c33531Th.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C33531Th.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c33531Th.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c33531Th.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C33531Th.class.getName();
        return c33531Th;
    }
}
