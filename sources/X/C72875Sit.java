package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Sit, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72875Sit extends AbstractC029409q<C72876Siu> {
    public final Context LJLIL;
    public final C72977SkX<List<String>> LJLILLLLZI;
    public final C72877Siv LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.LIZIZ.size();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C72876Siu c72876Siu, int i) {
        int LJJIIZ;
        C72876Siu holder = c72876Siu;
        o.LJIIIZ(holder, "holder");
        List<String> list = this.LJLILLLLZI.LIZIZ;
        if (i != list.size() - 2 || (LJJIIZ = this.LJLJJLL) <= 0) {
            if (i == 0) {
                LJJIIZ = this.LJLJJI;
            } else if (i == list.size() - 1) {
                LJJIIZ = this.LJLJJL;
            } else {
                LJJIIZ = O6R.LJJIIZ(this.LJLJI.LJLL);
            }
        }
        View view = holder.LJLILLLLZI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = O6R.LJJIIZ(this.LJLJI.LJLLI);
        layoutParams.width = LJJIIZ;
        view.setLayoutParams(layoutParams);
        if (i == 0 || i == list.size() - 1) {
            holder.LJLIL.setImageDrawable(null);
            holder.LJLILLLLZI.setBackground(null);
            return;
        }
        String str = (String) ListProtector.get(list, i);
        if (str.length() == 0) {
            Drawable LIZ = C20110qd.LIZ(this.LJLIL, R.drawable.bps);
            holder.LJLIL.setImageBitmap(null);
            holder.LJLILLLLZI.setBackground(LIZ);
        } else {
            holder.LJLILLLLZI.setBackground(null);
            C15650jR.LIZ().setUrl(str).LJIIJJI(holder.LJLIL);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C72876Siu com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bqu, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = LIZIZ.getLayoutParams();
        layoutParams.height = O6R.LJJIIZ(this.LJLJI.LJLLI);
        layoutParams.width = O6R.LJJIIZ(this.LJLJI.LJLL);
        LIZIZ.setLayoutParams(layoutParams);
        C72876Siu c72876Siu = new C72876Siu(LIZIZ);
        C0AX.LIZ(viewGroup, c72876Siu.itemView, R.id.lj7);
        View view = c72876Siu.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c72876Siu.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C72876Siu.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c72876Siu.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c72876Siu.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C72876Siu.class.getName();
        return c72876Siu;
    }

    public C72875Sit(Context context, C72977SkX<List<String>> urlList, C72877Siv spriteImageHandleConfig, int i, int i2, int i3) {
        o.LJIIIZ(urlList, "urlList");
        o.LJIIIZ(spriteImageHandleConfig, "spriteImageHandleConfig");
        this.LJLIL = context;
        this.LJLILLLLZI = urlList;
        this.LJLJI = spriteImageHandleConfig;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        this.LJLJJLL = i3;
    }
}
