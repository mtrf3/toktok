package X;

import Y.ACListenerS36S0200000_1;
import android.view.View;
import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4X6, reason: invalid class name */
/* loaded from: classes2.dex */
public class C4X6 extends AnonymousClass461<PictureCardTemplate> {
    public final View LLIIIJ;
    public final C113054c9 LLIIIL;
    public final C112874br LLIIIZ;
    public PictureCardTemplate LLIIJI;

    @Override // X.AbstractC1041546x
    public void setOnClickListener(View.OnClickListener onClickListener) {
        o.LJIIIZ(onClickListener, "onClickListener");
        super.setOnClickListener(onClickListener);
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZ(new ACListenerS36S0200000_1(onClickListener, this, 71));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4X6(View itemView, EnumC110124Tw itemType) {
        super(itemView, itemType);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(itemType, "itemType");
        View findViewById = itemView.findViewById(R.id.btt);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.content_layout)");
        this.LLIIIJ = findViewById;
        View findViewById2 = itemView.findViewById(R.id.l75);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.thumbnail_content)");
        this.LLIIIL = (C113054c9) findViewById2;
        o.LJIIIIZZ(itemView.findViewById(R.id.ja6), "itemView.findViewById(R.id.safety_mask)");
        this.LLIIIZ = new C112874br(C4XA.LIZ, itemView, new C4X4(InterfaceC104994Ad.LIZ));
    }

    @Override // X.AbstractC1041546x
    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        Integer num;
        o.LJIIIZ(msg, "msg");
        C4AH c4ah = c49v.LIZ;
        if (c4ah != null) {
            this.LLIIIL.setRoundingParams(c4ah);
        }
        View view = this.LLIIIJ;
        C110614Vt c110614Vt = new C110614Vt();
        C48E c48e = c49v.LIZJ;
        if (c48e != null) {
            num = Integer.valueOf(c48e.LJLIL);
        } else {
            num = null;
        }
        c110614Vt.LIZ = num;
        C4AH c4ah2 = c49v.LIZ;
        if (c4ah2 != null) {
            c110614Vt.LJIIIIZZ = Float.valueOf(c4ah2.LJLIL);
            c110614Vt.LJIIIZ = Float.valueOf(c4ah2.LJLILLLLZI);
            c110614Vt.LJIIJ = Float.valueOf(c4ah2.LJLJJI);
            c110614Vt.LJIIJJI = Float.valueOf(c4ah2.LJLJI);
        }
        C71313Ryn.LIZIZ(this.LLIIIJ, "content.context", c110614Vt, view);
    }

    @Override // X.AnonymousClass461
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void m0(C109544Rq msg, C109544Rq c109544Rq, PictureCardTemplate pictureCardTemplate, int i) {
        ImageComponent imageComponent;
        Boolean bool;
        o.LJIIIZ(msg, "msg");
        this.LLIIJI = pictureCardTemplate;
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZIZ(50331648, 59);
        }
        AnonymousClass470 anonymousClass4702 = this.LJLJJI;
        ImageComponent imageComponent2 = null;
        if (anonymousClass4702 != null) {
            C99033ud c99033ud = this.LJLLL;
            if (c99033ud != null) {
                bool = Boolean.valueOf(c99033ud.isMediaMsgMasking());
            } else {
                bool = null;
            }
            anonymousClass4702.LIZIZ(50331652, C78939UyV.LJJJLIIL(msg, bool));
        }
        boolean z = false;
        this.LLIIIZ.LJIIIIZZ(ORY.LJJIJLIJ(new ResolutionComponent[]{pictureCardTemplate.thumbnailComponent.resolution, pictureCardTemplate.imageComponent.resolution}));
        C112874br c112874br = this.LLIIIZ;
        C112974c1 LJJII = C70657RoD.LJJII(pictureCardTemplate.fallbackInfo);
        String LJIIIZ = C78923UyF.LJIIIZ(msg);
        PictureCardTemplate pictureCardTemplate2 = this.LLIIJI;
        if (pictureCardTemplate2 != null) {
            imageComponent = pictureCardTemplate2.thumbnailComponent;
            imageComponent2 = pictureCardTemplate2.imageComponent;
        } else {
            imageComponent = null;
        }
        List<String> LIZ = C85183Vy.LIZ(LJIIIZ, imageComponent, imageComponent2);
        C99033ud c99033ud2 = this.LJLLL;
        if (c99033ud2 != null) {
            z = c99033ud2.isMediaMsgMasking();
        }
        c112874br.LJI(msg, LJJII, LIZ, false, z, this.LJLLL);
    }
}
