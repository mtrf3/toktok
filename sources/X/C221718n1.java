package X;

import Y.ARunnableS22S0200000_3;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerFactoryService;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerViewFactoryApi;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.tiktok.addyours.service.AddYoursServiceImpl;
import com.ss.android.ugc.tiktok.addyours.service.IAddYoursService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS63S0400000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8n1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221718n1 extends AbstractC224038ql {
    public final Aweme LJLLI;
    public View LJLLILLLL;
    public InterfaceC221738n3 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final boolean LJLLLL;
    public final C221728n2 LJLLLLLL;

    @Override // X.AbstractC224038ql
    public final void LJIJI() {
    }

    @Override // X.AbstractC224038ql
    public final void LJIJJ() {
    }

    @Override // X.Y1I
    public final void LJJIIZ() {
    }

    @Override // X.Y1E
    public final int getStickerType() {
        return 88;
    }

    @Override // X.AbstractC224038ql
    public final View LJIILLIIL() {
        return new View(this.LJLILLLLZI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.Y1I
    public final void LJJII() {
        AddYoursStickerStruct addYoursStickerStruct;
        String str;
        String str2;
        String str3;
        Integer num;
        Object obj;
        String str4;
        int i;
        Long videoCount;
        C223778qL c223778qL;
        InteractStickerStruct interactStickerStruct = this.LJLJLLL;
        Integer num2 = null;
        if (interactStickerStruct != null) {
            addYoursStickerStruct = interactStickerStruct.getAddYoursStickerStruct();
        } else {
            addYoursStickerStruct = null;
        }
        C188727au c188727au = new C188727au();
        Aweme aweme = this.LJLLI;
        if (aweme != null) {
            str = aweme.getGroupId();
        } else {
            str = null;
        }
        c188727au.LJI("group_id", str);
        Aweme aweme2 = this.LJLLI;
        if (aweme2 != null) {
            str2 = aweme2.getAuthorUid();
        } else {
            str2 = null;
        }
        c188727au.LJI("author_id", str2);
        C245649kW c245649kW = this.LJLJJI;
        if (c245649kW != null && (c223778qL = c245649kW.LJIIZILJ) != null) {
            str3 = c223778qL.LIZ;
        } else {
            str3 = null;
        }
        c188727au.LJI("enter_from", str3);
        Aweme aweme3 = this.LJLLI;
        if (aweme3 != null) {
            num = Integer.valueOf(aweme3.getAwemeType());
        } else {
            num = null;
        }
        c188727au.LJFF(num, "aweme_type");
        Aweme aweme4 = this.LJLLI;
        if (aweme4 != null) {
            num2 = Integer.valueOf(aweme4.getFollowStatus());
        }
        c188727au.LJFF(num2, "follow_status");
        Object obj2 = "";
        if (addYoursStickerStruct == null || (obj = addYoursStickerStruct.getTopicId()) == null) {
            obj = "";
        }
        c188727au.LJFF(obj, "add_yours_id");
        if (addYoursStickerStruct == null || (str4 = addYoursStickerStruct.getText()) == null) {
            str4 = "";
        }
        c188727au.LJI("add_yours_title", str4);
        if (addYoursStickerStruct != null) {
            i = o.LJ(addYoursStickerStruct.getViewerInvited(), Boolean.TRUE);
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "is_invited");
        if (addYoursStickerStruct != null && (videoCount = addYoursStickerStruct.getVideoCount()) != null) {
            obj2 = videoCount;
        }
        c188727au.LJFF(obj2, "video_cnt");
        GXR.LIZ("add_yours_sticker_show", c188727au.LIZ);
    }

    @Override // X.Y1I
    public final View LIZ(int i) {
        String str;
        List<AddYoursAvatar> list;
        long j;
        C6UI LIZ;
        AddYoursStickerViewFactoryApi addYoursStickerViewFactoryApi;
        Long videoCount;
        InterfaceC221738n3 interfaceC221738n3;
        if (this.LJLLILLLL != null) {
            InteractStickerStruct interactStickerStruct = this.LJLJLLL;
            if (interactStickerStruct != null && (interfaceC221738n3 = this.LJLLJ) != null) {
                AddYoursStickerStruct addYoursStickerStruct = interactStickerStruct.getAddYoursStickerStruct();
                o.LJIIIIZZ(addYoursStickerStruct, "it.addYoursStickerStruct");
                interfaceC221738n3.LIZ(addYoursStickerStruct);
            }
            return this.LJLLILLLL;
        }
        InteractStickerStruct interactStickerStruct2 = this.LJLJLLL;
        InterfaceC65784Pro interfaceC65784Pro = null;
        if (interactStickerStruct2 == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(this.LJLILLLLZI);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
        boolean LJ = C226388uY.LJ();
        AddYoursStickerStruct addYoursStickerStruct2 = interactStickerStruct2.getAddYoursStickerStruct();
        if (addYoursStickerStruct2 == null || (str = addYoursStickerStruct2.getText()) == null) {
            str = "";
        }
        AddYoursStickerStruct addYoursStickerStruct3 = interactStickerStruct2.getAddYoursStickerStruct();
        if (addYoursStickerStruct3 == null || (list = addYoursStickerStruct3.getUserAvatars()) == null) {
            list = C61878OQg.INSTANCE;
        }
        AddYoursStickerStruct addYoursStickerStruct4 = interactStickerStruct2.getAddYoursStickerStruct();
        if (addYoursStickerStruct4 != null && (videoCount = addYoursStickerStruct4.getVideoCount()) != null) {
            j = videoCount.longValue();
        } else {
            j = 0;
        }
        C6UI c6ui = new C6UI(list, str, j, 14);
        boolean z = this.LJLLLL;
        int i2 = R.string.bd4;
        int i3 = R.raw.icon_camera_fill;
        if (z) {
            AqS150S0200000_3 aqS150S0200000_3 = new AqS150S0200000_3(this, interactStickerStruct2, 73);
            if (!LJ) {
                interfaceC65784Pro = aqS150S0200000_3;
            }
            if (!LJ) {
                i3 = R.raw.icon_two_person_large_fill;
            }
            if (LJ) {
                int LIZLLL = C226388uY.LIZLLL();
                if (LIZLLL == C6UU.ADD_YOURS.getValue() || LIZLLL != C6UU.POST_YOURS.getValue()) {
                    i2 = R.string.bcp;
                }
            } else {
                i2 = R.string.hiw;
            }
            LIZ = C6UI.LIZ(c6ui, interfaceC65784Pro, i3, i2);
        } else {
            AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 1495);
            if (!LJ) {
                interfaceC65784Pro = aqS153S0100000_3;
            }
            int LIZLLL2 = C226388uY.LIZLLL();
            if (LIZLLL2 == C6UU.ADD_YOURS.getValue() || LIZLLL2 != C6UU.POST_YOURS.getValue()) {
                i2 = R.string.bcp;
            }
            LIZ = C6UI.LIZ(c6ui, interfaceC65784Pro, R.raw.icon_camera_fill, i2);
        }
        Object LIZ2 = C58096Mr6.LIZ(AddYoursStickerViewFactoryApi.class, false);
        if (LIZ2 != null) {
            addYoursStickerViewFactoryApi = (AddYoursStickerViewFactoryApi) LIZ2;
        } else {
            if (C58096Mr6.k7 == null) {
                synchronized (AddYoursStickerViewFactoryApi.class) {
                    if (C58096Mr6.k7 == null) {
                        C58096Mr6.k7 = new AddYoursStickerFactoryService();
                    }
                }
            }
            addYoursStickerViewFactoryApi = C58096Mr6.k7;
        }
        C6U7 LIZ3 = addYoursStickerViewFactoryApi.LIZ(this.LJLILLLLZI, LIZ);
        LIZ3.getView().setVisibility(4);
        frameLayout.addView(LIZ3.getView());
        LIZ3.getView().post(new ARunnableS22S0200000_3(this, LIZ3, 47));
        this.LJLLJ = LIZ3;
        this.LJLLILLLL = frameLayout;
        IAddYoursService LJIJ = AddYoursServiceImpl.LJIJ();
        LJIJ.LJIIIZ(this.LJLLLLLL);
        AddYoursStickerStruct addYoursStickerStruct5 = interactStickerStruct2.getAddYoursStickerStruct();
        if (addYoursStickerStruct5 != null) {
            LJIJ.LJIIJJI(addYoursStickerStruct5, this.LJLLLLLL);
        }
        return this.LJLLILLLL;
    }

    @Override // X.AbstractC224038ql, X.Y1I
    public final void LJIIIIZZ(int i) {
        super.LJIIIIZZ(i);
        AddYoursServiceImpl.LJIJ().LJIIIZ(this.LJLLLLLL);
    }

    @Override // X.Y1P
    public final boolean LJIIJJI(long j, float f, float f2, int i) {
        return ((AbstractC221838nD) this.LJLLL.getValue()).LJIIJJI(j, f, f2, i);
    }

    @Override // X.Y1P
    public final boolean LJIILIIL(long j, int i, float f, float f2, InterfaceC221818nB popListener) {
        o.LJIIIZ(popListener, "popListener");
        return ((AbstractC221838nD) this.LJLLL.getValue()).LJIILIIL(j, i, f, f2, popListener);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.8n2] */
    public C221718n1(int i, Context context, C224048qm c224048qm, InteractStickerStruct interactStickerStruct, C245649kW c245649kW, Aweme aweme) {
        super(i, context, c224048qm, interactStickerStruct, c245649kW);
        User user;
        this.LJLLI = aweme;
        this.LJLLL = C221108m2.LIZIZ(new AqS63S0400000_3(context, this, interactStickerStruct, c245649kW, 4));
        if (c245649kW != null) {
            user = c245649kW.LIZJ;
        } else {
            user = null;
        }
        this.LJLLLL = AV1.LJIJ(user);
        this.LJLLLLLL = new InterfaceC220468l0() { // from class: X.8n2
            @Override // X.InterfaceC220468l0
            public final void LIZ(AddYoursStickerStruct sticker) {
                o.LJIIIZ(sticker, "sticker");
                InteractStickerStruct interactStickerStruct2 = C221718n1.this.LJLJLLL;
                if (interactStickerStruct2 != null) {
                    interactStickerStruct2.setAddYoursStickerStruct(sticker);
                }
                InterfaceC221738n3 interfaceC221738n3 = C221718n1.this.LJLLJ;
                if (interfaceC221738n3 != null) {
                    interfaceC221738n3.LIZ(AddYoursStickerStruct.copy$default(sticker, null, null, null, null, null, null, null, null, null, 0L, 1023, null));
                }
            }
        };
    }
}
