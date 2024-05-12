package X;

import Y.AfS64S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.spriteimage.SpriteImageScrollLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SkZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72979SkZ {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJJIJIIJIL;
    public final Activity LIZ;
    public final KRJ LIZIZ;
    public final C72977SkX<Long> LIZJ;
    public final C72977SkX<Boolean> LIZLLL;
    public final String LJ;
    public final long LJFF;
    public C73051Slj LJI;
    public TuxTextView LJII;
    public TuxTextView LJIIIIZZ;
    public C72975SkV LJIIIZ;
    public final C72977SkX<Float> LJIIJ;
    public final C72977SkX<C72877Siv> LJIIJJI;
    public final C72977SkX<Integer> LJIIL;
    public final C72977SkX<List<String>> LJIILIIL;
    public final C72977SkX<List<String>> LJIILJJIL;
    public C72983Skd LJIILL;
    public C72981Skb LJIILLIIL;
    public RecyclerView LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public final int LJIJJ;
    public final C72977SkX<Float> LJIJJLI;
    public final AqS162S0100000_12 LJIL;
    public final AqS162S0100000_12 LJJ;
    public final AqS162S0100000_12 LJJI;
    public final AqS162S0100000_12 LJJIFFI;
    public final AqS178S0100000_12 LJJII;
    public final C72977SkX LJJIII;
    public float LJJIIJ;
    public final C72977SkX LJJIIJZLJL;
    public final AqS162S0100000_12 LJJIIZ;
    public final AqS178S0100000_12 LJJIIZI;
    public final AqS194S0100000_12 LJJIJ;
    public XKQ LJJIJIIJI;

    static {
        TBV tbv = new TBV(C72979SkZ.class, "blockCount", "getBlockCount()I", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJJIJIIJIL = new InterfaceC74236TBo[]{tbv, C07250Qf.LIZIZ(C72979SkZ.class, "moveCount", "getMoveCount()I", 0, c65351Pkp)};
    }

    public final void LIZ() {
        View findViewById = this.LIZ.findViewById(R.id.l79);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        float f = (int) this.LJIIJJI.LIZIZ.LJLLI;
        C72981Skb c72981Skb = this.LJIILLIIL;
        if (c72981Skb != null) {
            float f2 = 2;
            float playHeadExtraLength = (c72981Skb.getPlayHeadExtraLength() * f2) + f;
            C72981Skb c72981Skb2 = this.LJIILLIIL;
            if (c72981Skb2 != null) {
                layoutParams.height = (int) ((c72981Skb2.getHandleExtraLength() * f2) + playHeadExtraLength);
                findViewById.setLayoutParams(layoutParams);
                return;
            } else {
                o.LJIJI("scrollHandle");
                throw null;
            }
        }
        o.LJIJI("scrollHandle");
        throw null;
    }

    public final void LIZJ() {
        C72981Skb c72981Skb = this.LJIILLIIL;
        if (c72981Skb != null) {
            C72977SkX<C72877Siv> handleConfig = this.LJIIJJI;
            AqS178S0100000_12 aqS178S0100000_12 = new AqS178S0100000_12(this, 584);
            AqS178S0100000_12 aqS178S0100000_122 = new AqS178S0100000_12(this, 585);
            AqS194S0100000_12 aqS194S0100000_12 = new AqS194S0100000_12(this, 229);
            o.LJIIIZ(handleConfig, "handleConfig");
            c72981Skb.setPlayerPause(aqS178S0100000_12);
            c72981Skb.setPlayOffset(aqS178S0100000_122);
            c72981Skb.LJLLJ = handleConfig;
            c72981Skb.setCalculateSelectedTimeSpan(aqS194S0100000_12);
            Object parent = c72981Skb.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            float f = ((View) parent).getLayoutParams().height;
            C72877Siv c72877Siv = handleConfig.LIZIZ;
            C72977SkX<Float> c72977SkX = c72981Skb.LJLJJL;
            int i = c72877Siv.LJLJLJ;
            Float valueOf = Float.valueOf(c72877Siv.LJLJJL);
            Float valueOf2 = Float.valueOf((c72877Siv.LJLIL - c72877Siv.LJLJJLL) - (c72877Siv.LJLJLLL * c72877Siv.LJLJL));
            if (i != 0) {
                valueOf = valueOf2;
            }
            c72977SkX.LIZIZ(valueOf);
            C72977SkX<Float> c72977SkX2 = c72981Skb.LJLJJLL;
            int i2 = handleConfig.LIZIZ.LJLJLJ;
            Float valueOf3 = Float.valueOf((c72877Siv.LJLJLLL * c72877Siv.LJLJL) + c72981Skb.LJLJJL.LIZIZ.floatValue());
            Float valueOf4 = Float.valueOf(c72877Siv.LJLIL - c72877Siv.LJLJJLL);
            if (i2 != 0) {
                valueOf3 = valueOf4;
            }
            c72977SkX2.LIZIZ(valueOf3);
            c72981Skb.LJLLL = new RectF(c72981Skb.LJLJJL.LIZIZ.floatValue() - c72981Skb.LJLJL, c72981Skb.LJLLI, c72981Skb.LJLJJL.LIZIZ.floatValue(), f - c72981Skb.LJLLI);
            c72981Skb.LJLLLL = new RectF(c72981Skb.LJLJJLL.LIZIZ.floatValue(), c72981Skb.LJLLL.top, c72981Skb.LJLJJLL.LIZIZ.floatValue() + c72981Skb.LJLJL, c72981Skb.LJLLL.bottom);
            c72981Skb.LJLLLLLL = new RectF(c72981Skb.LJLJJL.LIZIZ.floatValue(), c72981Skb.LJLLL.top, c72981Skb.LJLJJLL.LIZIZ.floatValue(), c72981Skb.LJLLL.top + c72981Skb.LJLL);
            c72981Skb.LJLZ = new RectF(c72981Skb.LJLJJL.LIZIZ.floatValue(), c72981Skb.LJLLL.bottom - c72981Skb.LJLL, c72981Skb.LJLJJLL.LIZIZ.floatValue(), c72981Skb.LJLLL.bottom);
            c72981Skb.LJZ.top = c72981Skb.LJLLLLLL.bottom + C7MY.LIZIZ(4);
            RectF rectF = c72981Skb.LJZ;
            rectF.bottom = rectF.top + C7MY.LIZIZ(c72981Skb.LLIIZ);
            if (handleConfig.LIZIZ.LJLJLJ == 0) {
                c72981Skb.LJZ.left = c72981Skb.LJLLL.right + C7MY.LIZIZ(4);
                RectF rectF2 = c72981Skb.LJZ;
                rectF2.right = rectF2.left + C7MY.LIZIZ(c72981Skb.LLIILZL);
            } else {
                c72981Skb.LJZ.right = c72981Skb.LJLLLL.left - C7MY.LIZIZ(4);
                RectF rectF3 = c72981Skb.LJZ;
                rectF3.left = rectF3.right - C7MY.LIZIZ(c72981Skb.LLIILZL);
            }
            RectF rectF4 = c72981Skb.LJLLL;
            c72981Skb.LJZI = new RectF(0.0f, rectF4.top, rectF4.left, rectF4.bottom);
            RectF rectF5 = c72981Skb.LJLLLL;
            c72981Skb.LJZL = new RectF(rectF5.right, rectF5.top, handleConfig.LIZIZ.LJLIL, rectF5.bottom);
            RectF rectF6 = c72981Skb.LLFFF.LIZIZ;
            rectF6.top = 0.0f;
            rectF6.bottom = f;
            C72981Skb c72981Skb2 = this.LJIILLIIL;
            if (c72981Skb2 != null) {
                c72981Skb2.getLeftPosition().LIZ();
                C72983Skd c72983Skd = new C72983Skd(this.LJIIJJI.LIZIZ.LJLJJL);
                this.LJIILL = c72983Skd;
                RecyclerView recyclerView = this.LJIIZILJ;
                if (recyclerView != null) {
                    recyclerView.LJIIJJI(c72983Skd);
                    return;
                } else {
                    o.LJIJI("spriteRecyclerView");
                    throw null;
                }
            }
            o.LJIJI("scrollHandle");
            throw null;
        }
        o.LJIJI("scrollHandle");
        throw null;
    }

    public final void LIZLLL() {
        RecyclerView recyclerView = this.LJIIZILJ;
        if (recyclerView != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            layoutParams.height = O6R.LJJIIZ(this.LJIIJJI.LIZIZ.LJLLI);
            C72981Skb c72981Skb = this.LJIILLIIL;
            if (c72981Skb != null) {
                C29306Beo.LJJLIIIJILLIZJL((int) Float.valueOf(c72981Skb.getPlayHeadExtraLength() + c72981Skb.getHandleExtraLength()).floatValue(), recyclerView);
                recyclerView.setLayoutParams(layoutParams);
                Context context = recyclerView.getContext();
                o.LJIIIIZZ(context, "context");
                C72977SkX<C72877Siv> c72977SkX = this.LJIIJJI;
                C72877Siv c72877Siv = c72977SkX.LIZIZ;
                recyclerView.setLayoutManager(new SpriteImageScrollLinearLayoutManager(context, c72877Siv.LJLJJL, c72877Siv.LJLL, c72977SkX));
                float longValue = ((float) ((this.LIZJ.LIZIZ.longValue() / 1000) % r5.LJLJI)) * this.LJIIJJI.LIZIZ.LJLJLLL;
                Context context2 = recyclerView.getContext();
                o.LJIIIIZZ(context2, "context");
                C72977SkX<List<String>> c72977SkX2 = this.LJIILJJIL;
                C72877Siv c72877Siv2 = this.LJIIJJI.LIZIZ;
                recyclerView.setAdapter(new C72875Sit(context2, c72977SkX2, c72877Siv2, c72877Siv2.LJLJJL, c72877Siv2.LJLJJLL, (int) longValue));
                return;
            }
            o.LJIJI("scrollHandle");
            throw null;
        }
        o.LJIJI("spriteRecyclerView");
        throw null;
    }

    public final void LIZIZ(long j, boolean z, long j2, List list) {
        AqS178S0100000_12 aqS178S0100000_12 = new AqS178S0100000_12(this, 587);
        if (list == null || list.isEmpty()) {
            AqS178S0100000_12 aqS178S0100000_122 = new AqS178S0100000_12(aqS178S0100000_12, 586);
            Long LJJIZ = C38350F3i.LJJIZ(this.LJ);
            if (LJJIZ != null) {
                ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getLiveReplayFrame(LJJIZ.longValue(), j, j2, z).LJJJLIIL(new AfS64S0100000_12((Object) aqS178S0100000_122, 115), new InterfaceC64592gB() { // from class: X.9F6
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                });
                return;
            }
            return;
        }
        aqS178S0100000_12.invoke(list);
    }

    public C72979SkZ(Activity activity, KRJ krj, C72977SkX<Long> videoLengthMS, C72977SkX<Boolean> isLandScape, String videoId, long j) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(videoLengthMS, "videoLengthMS");
        o.LJIIIZ(isLandScape, "isLandScape");
        o.LJIIIZ(videoId, "videoId");
        this.LIZ = activity;
        this.LIZIZ = krj;
        this.LIZJ = videoLengthMS;
        this.LIZLLL = isLandScape;
        this.LJ = videoId;
        this.LJFF = j;
        Float valueOf = Float.valueOf(0.0f);
        this.LJIIJ = new C72977SkX<>(valueOf);
        C72977SkX<C72877Siv> LIZ = C72984Ske.LIZ(C72878Siw.LIZ, isLandScape, new AqS194S0100000_12(this, 228));
        this.LJIIJJI = LIZ;
        this.LJIIL = C72984Ske.LIZIZ(0, LIZ, videoLengthMS, C72874Sis.LJLIL);
        C72977SkX<List<String>> LIZIZ = C72984Ske.LIZIZ(new ArrayList(0), videoLengthMS, LIZ, C72872Siq.LJLIL);
        this.LJIILIIL = LIZIZ;
        this.LJIILJJIL = C72984Ske.LIZ(new ArrayList(0), LIZIZ, C70988RtY.LJLIL);
        this.LJIJJ = 300;
        this.LJIJJLI = C72984Ske.LIZIZ(valueOf, LIZ, videoLengthMS, C72873Sir.LJLIL);
        this.LJIL = new AqS162S0100000_12(this, 1156);
        this.LJJ = new AqS162S0100000_12(this, 1158);
        this.LJJI = new AqS162S0100000_12(this, 1154);
        this.LJJIFFI = new AqS162S0100000_12(this, 1157);
        this.LJJII = new AqS178S0100000_12(this, 583);
        this.LJJIII = new C72977SkX(0);
        this.LJJIIJZLJL = new C72977SkX(0);
        this.LJJIIZ = new AqS162S0100000_12(this, 1155);
        this.LJJIIZI = new AqS178S0100000_12(this, 582);
        this.LJJIJ = new AqS194S0100000_12(this, 227);
    }
}
