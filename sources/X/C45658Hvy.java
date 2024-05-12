package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Hvy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45658Hvy extends AbstractC029409q<RecyclerView.ViewHolder> {
    public boolean LJLIL;
    public final Context LJLILLLLZI;
    public List<Integer> LJLJJI;
    public List<Integer> LJLJJL;
    public boolean LJLJJLL;
    public final int LJLJL;
    public QBF LJLJLJ;
    public List<MediaModel> LJLLILLLL;
    public final C45657Hvx LJLLJ;
    public final HMO LJLLL;
    public final List<MediaModel> LJLJI = new ArrayList();
    public int LJLL = -1;
    public int LJLLI = -1;
    public final double LJLJLLL = 1.0d;

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLJI).size();
    }

    public final void LJLLLLLL(int i) {
        List<Integer> list = this.LJLJJL;
        if (list == null) {
            this.LJLJJL = new ArrayList();
        } else {
            list.clear();
        }
        List<Integer> list2 = this.LJLJJI;
        if (list2 == null) {
            this.LJLJJI = new ArrayList();
        } else {
            list2.clear();
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.LJLJJI.add(-1);
        }
    }

    public final void LJZ(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            int i = layoutParams.width;
            int i2 = this.LJLJL;
            if (i != i2) {
                int i3 = layoutParams.height;
                double d = this.LJLJLLL;
                if (i3 != ((int) (i2 * d))) {
                    layoutParams.width = i2;
                    layoutParams.height = (int) (i2 * d);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.W5O, REQUEST] */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r18, int r19) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45658Hvy.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bs0, C16880lQ.LLZIL(this.LJLILLLLZI), null);
        C45662Hw2 c45662Hw2 = new C45662Hw2(LLLZIIL);
        c45662Hw2.LJLIL = (W5G) LLLZIIL.findViewById(R.id.ggp);
        c45662Hw2.LJLILLLLZI = (TextView) LLLZIIL.findViewById(R.id.n5j);
        c45662Hw2.LJLJI = (TextView) LLLZIIL.findViewById(R.id.ehy);
        View findViewById = LLLZIIL.findViewById(R.id.mu_);
        c45662Hw2.LJLJJI = findViewById;
        findViewById.setVisibility(8);
        c45662Hw2.LJLJJLL = LLLZIIL.findViewById(R.id.jl6);
        FrameLayout frameLayout = (FrameLayout) LLLZIIL.findViewById(R.id.ded);
        c45662Hw2.LJLJJL = frameLayout;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = (int) KL2.LIZJ(c45662Hw2.LJLJJL.getContext(), 48.0f);
        layoutParams.width = (int) KL2.LIZJ(c45662Hw2.LJLJJL.getContext(), 48.0f);
        c45662Hw2.LJLJJL.setLayoutParams(layoutParams);
        LLLZIIL.setTag(c45662Hw2);
        C0AX.LIZ(viewGroup, c45662Hw2.itemView, R.id.lj7);
        View view = c45662Hw2.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
        }
        try {
            if (c45662Hw2.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C45662Hw2.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c45662Hw2.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(c45662Hw2.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C45662Hw2.class.getName();
        return c45662Hw2;
    }

    public C45658Hvy(Context context, C45657Hvx c45657Hvx, int i) {
        this.LJLJL = 0;
        this.LJLILLLLZI = context;
        this.LJLLJ = c45657Hvx;
        context.getResources().getDimensionPixelOffset(R.dimen.z8);
        this.LJLJL = (KL2.LJIIJJI(context) - ((i - 1) * ((int) KL2.LIZJ(context, 1.5f)))) / i;
        HMO hmo = new HMO(context);
        this.LJLLL = hmo;
        hmo.LIZJ = false;
        hmo.LIZLLL = "enter_from_multi";
    }

    public final void LJLZ(int i, String str, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j);
            C6BK c6bk = new C6BK();
            c6bk.LIZ.put("status", String.valueOf(i));
            c6bk.LIZ.put("scene_name", "select");
            c6bk.LIZ.put("type", str);
            C43882HKc.LIZ.LJIILIIL("aweme_video_import_duration", jSONObject, c6bk.LJ());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
