package X;

import Y.AfS54S0100000_2;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6Zs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162606Zs extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final WFB LJLJJI;
    public final C73411SrX LJLJJL;
    public final OSZ<Integer, Bitmap>[] LJLJJLL;
    public boolean LJLJL;
    public final int LJLJLJ;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLJJI.LIZJ / this.LJLJI;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        View view = holder.itemView;
        o.LJII(view, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) view;
        int i2 = 0 + i;
        OSZ<Integer, Bitmap>[] oszArr = this.LJLJJLL;
        Bitmap bitmap = null;
        if (i2 > oszArr.length) {
            imageView.setImageBitmap(null);
            return;
        }
        if (oszArr[0 + i] == null) {
            OSZ<Integer, Bitmap> osz = oszArr[0];
            if (osz != null) {
                bitmap = osz.getSecond();
            }
            imageView.setImageBitmap(bitmap);
            return;
        }
        OSZ<Integer, Bitmap> osz2 = oszArr[0 + i];
        if (osz2 != null) {
            bitmap = osz2.getSecond();
        }
        imageView.setImageBitmap(bitmap);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.cqg, parent, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) LLLLIILL;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = this.LJLILLLLZI;
        layoutParams.width = this.LJLIL;
        imageView.setLayoutParams(layoutParams);
        C113574cz c113574cz = new C113574cz(imageView);
        C0AX.LIZ(parent, c113574cz.itemView, R.id.lj7);
        View view = c113574cz.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c113574cz.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C113574cz.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c113574cz.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c113574cz.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C113574cz.class.getName();
        return c113574cz;
    }

    public C162606Zs(InterfaceC162616Zt videoCoverGenerator, int i, int i2, int i3) {
        o.LJIIIZ(videoCoverGenerator, "videoCoverGenerator");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        WFB wfb = new WFB(videoCoverGenerator, i, i2, videoCoverGenerator.LIZIZ());
        this.LJLJJI = wfb;
        this.LJLJJLL = new OSZ[wfb.LIZJ];
        this.LJLJL = true;
        this.LJLJLJ = 7;
        final long currentTimeMillis = System.currentTimeMillis();
        this.LJLJJL = (C73411SrX) wfb.LIZ().LJJJLL(new AfS54S0100000_2(this, 34), new InterfaceC64592gB() { // from class: X.6Yf
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new InterfaceC29937Boz() { // from class: X.6Zr
            @Override // X.InterfaceC29937Boz
            public final void run() {
                C162606Zs c162606Zs = C162606Zs.this;
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                c162606Zs.getClass();
                C145995oB c145995oB = new C145995oB();
                c145995oB.LJI("type", "tool_performance_video_adapter_extract_cover_time");
                c145995oB.LIZIZ(currentTimeMillis2, "totaltime");
                c145995oB.LIZ(1, "totalstep");
                FMX.LJIIL("tool_performance_operation_cost_time", c145995oB.LIZ);
            }
        });
    }
}
