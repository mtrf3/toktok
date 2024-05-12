package com.ss.android.ugc.aweme.story.feed.common.newarch.component;

import X.AbstractC73672Svk;
import X.C1799074g;
import X.C1DF;
import X.C203097y5;
import X.C214348b8;
import X.C221108m2;
import X.C221138m5;
import X.C222588oQ;
import X.C227768wm;
import X.C42625Go9;
import X.C50912JyW;
import X.C50913JyX;
import X.C55096Ljo;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C73411SrX;
import X.C73969T1h;
import X.C78596Usy;
import X.C78866UxK;
import X.C8JF;
import X.C8M6;
import X.C8MM;
import X.C8MP;
import X.C8TD;
import X.C8TE;
import X.C8YN;
import X.EF7;
import X.InterfaceC1798974f;
import X.InterfaceC55235Lm3;
import X.KR8;
import X.M89;
import X.QD3;
import X.TBT;
import Y.AfS55S0100000_3;
import Y.IDaS214S0100000_3;
import android.provider.Settings;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class StoryFakePlayerComponent extends BaseCellContentComponent<StoryFakePlayerComponent> implements StoryFakePlayerAbility {
    public final C5H3 LL;
    public final C221138m5 LLD;
    public final C221138m5 LLF;
    public final C221138m5 LLFF;
    public final C62822Ol8 LLFFF;
    public Aweme LLFII;
    public long LLFZ;
    public int LLI;
    public C73411SrX LLIFFJFJJ;

    public StoryFakePlayerComponent() {
        new LinkedHashMap();
        this.LL = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C8TE.INSTANCE);
        this.LLD = KR8.LJIIJJI(new AqS153S0100000_3(this, 903));
        this.LLF = KR8.LJIIJJI(new AqS153S0100000_3(this, 904));
        this.LLFF = KR8.LJIIJJI(new AqS153S0100000_3(this, 905));
        this.LLFFF = C221108m2.LIZIZ(C8M6.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.component.StoryFakePlayerAbility
    public final void Q20() {
        C73411SrX c73411SrX = this.LLIFFJFJJ;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            nm0();
        } else {
            mr();
        }
    }

    public final C203097y5 b4() {
        return (C203097y5) this.LLFFF.getValue();
    }

    public final void g4() {
        if (!C1DF.LJJIII(this.LLFII)) {
            return;
        }
        this.LLFZ = 0L;
        this.LLI = 0;
        C73411SrX c73411SrX = this.LLIFFJFJJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        b4().LIZ(this.LLFII, qT());
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.component.StoryFakePlayerAbility
    public final void mr() {
        if (C1DF.LJJIII(this.LLFII)) {
            C73411SrX c73411SrX = this.LLIFFJFJJ;
            if (c73411SrX != null && !c73411SrX.isDisposed()) {
                return;
            }
            C203097y5 b4 = b4();
            b4.getClass();
            b4.LIZ = System.currentTimeMillis();
            e4(this.LLFZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.component.StoryFakePlayerAbility
    public final void nm0() {
        C73411SrX c73411SrX;
        if (C1DF.LJJIII(this.LLFII) && (c73411SrX = this.LLIFFJFJJ) != null && !c73411SrX.isDisposed()) {
            C73411SrX c73411SrX2 = this.LLIFFJFJJ;
            if (c73411SrX2 != null) {
                c73411SrX2.dispose();
            }
            b4().LIZ(this.LLFII, qT());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJJJ() {
        nm0();
        this.LLFII = null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        C42625Go9.LIZJ(this);
        C73411SrX c73411SrX = this.LLIFFJFJJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        InterfaceC55235Lm3 interfaceC55235Lm3 = (InterfaceC55235Lm3) this.LLD.getValue();
        if (interfaceC55235Lm3 != null) {
            C55096Ljo.LJIILL(interfaceC55235Lm3, StoryFakePlayerAbility.class, null);
        }
    }

    public final M89 qT() {
        BaseFeedPageParams baseFeedPageParams;
        C222588oQ c222588oQ = a1().LIZLLL;
        if (c222588oQ != null && (baseFeedPageParams = c222588oQ.LJ) != null) {
            return baseFeedPageParams.param;
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LLIILZL() {
        g4();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJIII(int i) {
        nm0();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJIJIIJIL(int i) {
        mr();
    }

    public final void c4(Aweme aweme) {
        int i;
        List<PhotoModeImageUrlModel> imageList;
        C73411SrX c73411SrX;
        if (!C1DF.LJJIII(aweme)) {
            return;
        }
        C73411SrX c73411SrX2 = this.LLIFFJFJJ;
        int i2 = 0;
        if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = this.LLIFFJFJJ) != null) {
            c73411SrX.dispose();
        }
        this.LLFZ = 0L;
        this.LLI = 0;
        C203097y5 b4 = b4();
        M89 qT = qT();
        b4.getClass();
        if (aweme != null && qT != null) {
            b4.LIZ = System.currentTimeMillis();
            C50913JyX c50913JyX = new C50913JyX();
            c50913JyX.LJIILL(aweme);
            c50913JyX.LJJIIZI(aweme);
            c50913JyX.LJJIIZ = C227768wm.LJIIZILJ(aweme);
            try {
                if (Settings.System.getInt(EF7.LIZIZ().getContentResolver(), "accelerometer_rotation") == 0) {
                    c50913JyX.LJLJL = 0;
                } else {
                    c50913JyX.LJLJL = 1;
                }
            } catch (Throwable unused) {
            }
            String eventType = qT.getEventType();
            o.LJI(eventType);
            c50913JyX.LIZLLL = eventType;
            c50913JyX.LJJJJZI = "story";
            C78866UxK.LJIILIIL(c50913JyX, aweme);
            C78596Usy.LJII(aweme, c50913JyX);
            c50913JyX.LJ("enter_position", C78596Usy.LJJIIZ(qT), InterfaceC1798974f.LIZ);
            c50913JyX.LJIILIIL();
        }
        C203097y5 b42 = b4();
        M89 qT2 = qT();
        b42.getClass();
        if (aweme != null && qT2 != null) {
            C50912JyW c50912JyW = new C50912JyW();
            c50912JyW.LJJIIZI(aweme);
            String eventType2 = qT2.getEventType();
            o.LJI(eventType2);
            c50912JyW.LIZLLL = eventType2;
            c50912JyW.LJJJJZI = "story";
            C78866UxK.LJIILIIL(c50912JyW, aweme);
            C78596Usy.LJII(aweme, c50912JyW);
            String LJJIIZ = C78596Usy.LJJIIZ(qT2);
            C1799074g c1799074g = InterfaceC1798974f.LIZ;
            c50912JyW.LJ("enter_position", LJJIIZ, c1799074g);
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            c50912JyW.LJ("aweme_id", aid, c1799074g);
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                i = imageList.size();
            } else {
                i = 0;
            }
            c50912JyW.LIZJ(i, "pic_cnt");
            c50912JyW.LIZJ(1, "pic_location");
            User author = aweme.getAuthor();
            if (author != null) {
                i2 = author.getFansCount();
            }
            c50912JyW.LIZJ(i2, "fans");
            c50912JyW.LJIILIIL();
        }
        e4(0L);
    }

    public final void e4(long j) {
        this.LLIFFJFJJ = (C73411SrX) AbstractC73672Svk.LJJIJIIJIL(j, (long) Math.ceil(33.333333333333336d - j), 0L, 300L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLL(new AfS55S0100000_3(this, 36), new AfS55S0100000_3(this, 37), new IDaS214S0100000_3(this, 0));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        C8MP.LIZ(this, "event_on_page_resume", new AqS169S0100000_3(this, 435));
        C8MP.LIZ(this, "event_on_page_pause", new AqS169S0100000_3(this, 436));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onMaskShowOrHide(C8JF event) {
        String str;
        o.LJIIIZ(event, "event");
        String str2 = event.LJLILLLLZI;
        Aweme aweme = this.LLFII;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (!o.LJ(str2, str)) {
            return;
        }
        if (event.LJLIL) {
            g4();
        } else {
            c4(this.LLFII);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C42625Go9.LIZIZ(this);
        InterfaceC55235Lm3 interfaceC55235Lm3 = (InterfaceC55235Lm3) this.LLD.getValue();
        if (interfaceC55235Lm3 != null) {
            C55096Ljo.LJIIJJI(interfaceC55235Lm3, this, StoryFakePlayerAbility.class, null);
        }
        C8YN.LJII(this, (AssemViewModel) this.LL.getValue(), new TBT() { // from class: X.8MC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJZI;
            }
        }, null, C8TD.LJLIL, 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        c4(aweme);
    }
}
