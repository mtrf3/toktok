package X;

import Y.ACListenerS25S1200000_3;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.now.UserNowPost;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7nl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196697nl extends AbstractC196727no {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public Aweme LJLJJI;
    public final String LJLJJL;

    @Override // X.AbstractC196727no
    public final void L() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C12460eI.LIZJ(itemView, new AbstractC13940gg(this) { // from class: X.7nn
            public InterfaceC65784Pro<String> LJ;
            public final C196707nm LJFF;

            @Override // X.AbstractC13940gg
            public final InterfaceC65784Pro<String> LIZJ() {
                return this.LJ;
            }

            @Override // X.AbstractC13940gg
            public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
                return this.LJFF;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [X.7nm] */
            {
                this.LJ = new AqS153S0100000_3(this, 1572);
                this.LJFF = new InterfaceC19530ph() { // from class: X.7nm
                    @Override // X.InterfaceC19530ph
                    public final void LIZ(View view, String itemID) {
                        String str;
                        int i;
                        User author;
                        o.LJIIIZ(itemID, "itemID");
                        C198507qg c198507qg = C198507qg.LIZIZ;
                        C196697nl c196697nl = C196697nl.this;
                        String str2 = c196697nl.LJLJJL;
                        Aweme aweme = c196697nl.LJLJJI;
                        if (aweme == null || (str = aweme.getAuthorUid()) == null) {
                            str = "";
                        }
                        Aweme aweme2 = C196697nl.this.LJLJJI;
                        if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
                            i = author.getFollowStatus();
                        } else {
                            i = -1;
                        }
                        c198507qg.LIZ.LIZ("now_show", str2, str, Integer.valueOf(i));
                    }
                };
            }

            @Override // X.AbstractC13940gg
            public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
                this.LJ = interfaceC65784Pro;
            }
        });
    }

    public final SmartImageView M() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-ivFront>(...)");
        return (SmartImageView) value;
    }

    @Override // X.AbstractC196727no
    public final void LLLZ(int i, Aweme aweme) {
        NowPostInfo nowPostInfo;
        boolean z;
        int i2;
        Integer totalCount;
        this.LJLJJI = aweme;
        if (aweme != null) {
            nowPostInfo = aweme.nowPostInfo;
        } else {
            nowPostInfo = null;
        }
        if (nowPostInfo == null) {
            this.itemView.setVisibility(8);
            return;
        }
        this.itemView.setVisibility(0);
        if (C78996UzQ.LJJIIZI(aweme)) {
            z = true;
        } else {
            InterfaceC194547kI LJIILIIL = C78949Uyf.LJIILIIL(aweme, null, null, 0, null, false, false, false, null, 2046);
            AbstractC194637kR LJII = C65314PkE.LJII();
            if (LJII.LIZ()) {
                C196367nE.LIZ.getClass();
                if (!C196367nE.LJIIIIZZ(LJIILIIL)) {
                    z = false;
                }
            }
            AbstractC193947jK LIZIZ = C193687iu.LIZIZ(C78949Uyf.LJIILIIL(aweme, null, null, 0, null, false, false, false, null, 2046), LJII);
            LIZIZ.getClass();
            z = LIZIZ instanceof C193887jE;
        }
        if (z) {
            Object value = this.LJLIL.getValue();
            o.LJIIIIZZ(value, "<get-ivBack>(...)");
            C195937mX.LJIIIZ((SmartImageView) value, nowPostInfo.getBackImage());
            C195937mX.LJIIIZ(M(), nowPostInfo.getFrontImage());
            M().setVisibility(0);
        } else {
            M().setVisibility(8);
            Object value2 = this.LJLIL.getValue();
            o.LJIIIIZZ(value2, "<get-ivBack>(...)");
            C195937mX.LJIIIZ((SmartImageView) value2, nowPostInfo.getFuzzyImage());
        }
        Object value3 = this.LJLJI.getValue();
        o.LJIIIIZZ(value3, "<get-tvCount>(...)");
        TextView textView = (TextView) value3;
        Object value4 = this.LJLJI.getValue();
        o.LJIIIIZZ(value4, "<get-tvCount>(...)");
        Context context = ((View) value4).getContext();
        Object[] objArr = new Object[1];
        UserNowPost userNowPost = aweme.userNowPost;
        if (userNowPost != null && (totalCount = userNowPost.getTotalCount()) != null) {
            i2 = totalCount.intValue();
        } else {
            i2 = 0;
        }
        objArr[0] = Integer.valueOf(i2);
        textView.setText(context.getString(R.string.izs, objArr));
        if (aweme.shouldShowReviewStatus()) {
            ((TextView) this.itemView.findViewById(R.id.ib_)).setText(aweme.getCoverNotice());
            this.itemView.findViewById(R.id.geh).setVisibility(0);
            this.itemView.findViewById(R.id.ib_).setVisibility(0);
        } else {
            this.itemView.findViewById(R.id.geh).setVisibility(8);
            this.itemView.findViewById(R.id.ib_).setVisibility(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C196697nl(View itemView, String eventLabel, MH9 listener) {
        super(itemView);
        int LIZIZ;
        float f;
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(eventLabel, "eventLabel");
        o.LJIIIZ(listener, "listener");
        this.LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(itemView, 1570));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(itemView, 1571));
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(itemView, 1573));
        this.LJLJJL = eventLabel;
        C16880lQ.LJIIJ(new ACListenerS25S1200000_3(listener, this, eventLabel, 6), itemView);
        ConstraintLayout constraintLayout = (ConstraintLayout) itemView.findViewById(R.id.h6z);
        SmartImageView M = M();
        S3I s3i = new S3I();
        s3i.LIZLLL = C32151Nz.LJIIZILJ(6);
        float LJIIZILJ = C32151Nz.LJIIZILJ(1);
        s3i.LIZJ = -16777216;
        s3i.LIZIZ = LJIIZILJ;
        M.setCircleOptions(new S3L(s3i));
        if (constraintLayout != null) {
            int id = M().getId();
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            anonymousClass064.LJII(constraintLayout);
            anonymousClass064.LJFF(id);
            anonymousClass064.LJIIIIZZ(id, 6, constraintLayout.getId(), 6);
            anonymousClass064.LJIIIIZZ(id, 3, constraintLayout.getId(), 3);
            if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableNowsSelfieWindowGoldenRatio()) {
                f = 0.382f;
            } else {
                f = 0.32f;
            }
            anonymousClass064.LJIIJJI(f, id);
            anonymousClass064.LJIJI(id, "H,3:4");
            anonymousClass064.LIZIZ(constraintLayout);
        }
        if (AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableNowsSelfieWindowGoldenRatio()) {
            LIZIZ = C7MY.LIZIZ(4);
        } else {
            LIZIZ = C7MY.LIZIZ(5);
        }
        C26338AVi.LJI(M(), Integer.valueOf(LIZIZ), Integer.valueOf(LIZIZ), Integer.valueOf(LIZIZ), Integer.valueOf(LIZIZ), false, 16);
    }
}
