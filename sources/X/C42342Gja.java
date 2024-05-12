package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gja, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42342Gja extends AbstractC029409q<C42343Gjb> {
    public final Context LJLIL;
    public final VEMediaParserProviderV2 LJLILLLLZI;
    public final int LJLJI;
    public float LJLJJI;
    public final List<OSZ<Integer, Integer>> LJLJJL;
    public List<VideoSegment> LJLJJLL;
    public final int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public float LJLL;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        if (this.LJLJJLL.isEmpty()) {
            return 0;
        }
        return this.LJLJLLL;
    }

    public final int LJLZ(float f) {
        int LJJIIZ;
        int LJJIIZ2;
        ((ArrayList) this.LJLJJL).clear();
        if (this.LJLJI == 1) {
            Iterator it = ((ArrayList) this.LJLJJLL).iterator();
            LJJIIZ = 0;
            while (it.hasNext()) {
                VideoSegment videoSegment = (VideoSegment) it.next();
                float ceil = (float) Math.ceil((((float) (videoSegment.LJ() - videoSegment.LJIIIZ())) / videoSegment.LJIIIIZZ()) / this.LJLJJI);
                if (Float.isNaN(ceil)) {
                    LJJIIZ2 = 0;
                } else {
                    LJJIIZ2 = O6R.LJJIIZ(ceil);
                }
                List<OSZ<Integer, Integer>> list = this.LJLJJL;
                Integer valueOf = Integer.valueOf(LJJIIZ);
                LJJIIZ += LJJIIZ2;
                ((ArrayList) list).add(new OSZ(valueOf, Integer.valueOf(LJJIIZ - 1)));
            }
        } else {
            this.LJLL = ((VideoSegment) ListProtector.get(this.LJLJJLL, 0)).LJIIIIZZ();
            if (f != 0.0f) {
                this.LJLL = f;
            }
            float ceil2 = (float) Math.ceil((((float) r1.duration) / this.LJLL) / this.LJLJJI);
            if (Float.isNaN(ceil2)) {
                LJJIIZ = 0;
            } else {
                LJJIIZ = O6R.LJJIIZ(ceil2);
            }
            ((ArrayList) this.LJLJJL).add(new OSZ(0, Integer.valueOf(LJJIIZ - 1)));
        }
        return LJJIIZ;
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(C42343Gjb c42343Gjb) {
        C42343Gjb holder = c42343Gjb;
        o.LJIIIZ(holder, "holder");
        super.onViewRecycled(holder);
        holder.LJLIL.setImageBitmap(null);
        Bitmap bitmap = holder.LJLILLLLZI;
        if (bitmap != null) {
            bitmap.recycle();
        }
        holder.LJLILLLLZI = null;
    }

    public final void LJLLLLLL(float f, float f2) {
        this.LJLJJI = f * this.LJLJL;
        this.LJLJLLL = LJLZ(f2);
        this.LJLILLLLZI.LIZ();
        notifyDataSetChanged();
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C42343Gjb c42343Gjb, int i) {
        float min;
        float floatValue;
        C42343Gjb holder = c42343Gjb;
        o.LJIIIZ(holder, "holder");
        int size = ((ArrayList) holder.LJLJI.LJLJJL).size();
        for (int i2 = 0; i2 < size; i2++) {
            OSZ osz = (OSZ) ListProtector.get(holder.LJLJI.LJLJJL, i2);
            if (i >= ((Number) osz.getFirst()).intValue() && i <= ((Number) osz.getSecond()).intValue()) {
                OSZ osz2 = (OSZ) ListProtector.get(holder.LJLJI.LJLJJL, i2);
                VideoSegment videoSegment = (VideoSegment) ListProtector.get(holder.LJLJI.LJLJJLL, i2);
                if (holder.LJLJI.LJLJI == 1) {
                    min = Math.min((videoSegment.LJIIIIZZ() * (i - ((Number) osz2.getFirst()).intValue()) * holder.LJLJI.LJLJJI) + ((float) videoSegment.LJIIIZ()), (float) videoSegment.LJ());
                } else {
                    float intValue = i - ((Number) osz2.getFirst()).intValue();
                    C42342Gja c42342Gja = holder.LJLJI;
                    min = Math.min(intValue * c42342Gja.LJLJJI * c42342Gja.LJLL, (float) videoSegment.duration);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(i2);
                LIZ.append('-');
                LIZ.append(min);
                String LIZIZ = X1D.LIZIZ(LIZ);
                holder.LJLIL.setTag(LIZIZ);
                ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                C42342Gja c42342Gja2 = holder.LJLJI;
                marginLayoutParams.height = c42342Gja2.LJLJLJ;
                marginLayoutParams.width = c42342Gja2.LJLJL;
                if (i == ((Number) osz2.getSecond()).intValue()) {
                    C42342Gja c42342Gja3 = holder.LJLJI;
                    if (c42342Gja3.LJLJI == 1) {
                        floatValue = (((float) (videoSegment.LJ() - videoSegment.LJIIIZ())) / videoSegment.LJIIIIZZ()) - (holder.LJLJI.LJLJJI * (((Number) osz2.getSecond()).intValue() - ((Number) osz2.getFirst()).intValue()));
                    } else {
                        floatValue = (((float) videoSegment.duration) / c42342Gja3.LJLL) - (((Number) osz2.getSecond()).floatValue() * c42342Gja3.LJLJJI);
                    }
                    if (floatValue >= 0.0f) {
                        marginLayoutParams.width = O6R.LJJIIZ((floatValue / holder.LJLJI.LJLJJI) * r1.LJLJL);
                    }
                }
                holder.itemView.setLayoutParams(marginLayoutParams);
                Bitmap bitmap = holder.LJLILLLLZI;
                if (bitmap != null && bitmap.isRecycled()) {
                    ImageView imageView = holder.LJLIL;
                    C42342Gja c42342Gja4 = holder.LJLJI;
                    if (c42342Gja4.LJLJI == 1) {
                        imageView.setBackground(c42342Gja4.LJLIL.getResources().getDrawable(R.drawable.uc));
                    } else {
                        imageView.setBackground(c42342Gja4.LJLIL.getResources().getDrawable(R.drawable.ui));
                    }
                }
                String videoPath = ((VideoSegment) ListProtector.get(holder.LJLJI.LJLJJLL, i2)).LJII(false);
                VEMediaParserProviderV2 vEMediaParserProviderV2 = holder.LJLJI.LJLILLLLZI;
                o.LJIIIIZZ(videoPath, "videoPath");
                vEMediaParserProviderV2.LIZIZ(i, videoPath, (int) min, new C42344Gjc(holder, LIZIZ, holder));
                return;
            }
        }
        throw new IllegalArgumentException(KMP.LJ("unknow pos = ", i));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final C42343Gjb com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C42343Gjb c42343Gjb = new C42343Gjb(this, AnonymousClass030.LIZLLL(this.LJLIL, R.layout.bco, parent, false, "from(context).inflate(R.…_frame_v2, parent, false)"));
        C0AX.LIZ(parent, c42343Gjb.itemView, R.id.lj7);
        View view = c42343Gjb.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c42343Gjb.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C42343Gjb.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c42343Gjb.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c42343Gjb.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C42343Gjb.class.getName();
        return c42343Gjb;
    }

    public C42342Gja(ActivityC45651qj context, int[] iArr, float f, VEMediaParserProviderV2 mBitmapCache, int i) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(mBitmapCache, "mBitmapCache");
        this.LJLIL = context;
        this.LJLILLLLZI = mBitmapCache;
        this.LJLJI = i;
        this.LJLJJL = new ArrayList();
        this.LJLJJLL = new ArrayList();
        int i2 = iArr[0];
        this.LJLJL = i2;
        this.LJLJLJ = iArr[1];
        this.LJLJJI = f * i2;
    }
}
