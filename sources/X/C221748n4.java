package X;

import android.content.Context;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerRecordServiceImpl;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.tools.sticker.IAddYoursStickerRecordService;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8n4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221748n4 extends AbstractC221838nD {
    public final Aweme LJLJJL;
    public long LJLJJLL;

    public final void LJIIIIZZ(View view) {
        List<NormalTrackTimeStamp> LIZIZ;
        NormalTrackTimeStamp normalTrackTimeStamp;
        if (view.getWidth() == 0 || view.getHeight() == 0 || (LIZIZ = C223998qh.LIZIZ(this.LJLJI)) == null || (normalTrackTimeStamp = (NormalTrackTimeStamp) ListProtector.get(LIZIZ, 0)) == null) {
            return;
        }
        RectF LIZ = LIZ(normalTrackTimeStamp);
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        view.setTranslationX(((LIZ.width() - view.getWidth()) / 2.0f) + LIZ.left);
        view.setTranslationY(((LIZ.height() - view.getHeight()) / 2.0f) + LIZ.top);
        view.setScaleX(LIZ.width() / view.getWidth());
        view.setScaleY(LIZ.width() / view.getWidth());
        view.setRotation(normalTrackTimeStamp.getRotation());
        view.setVisibility(0);
        view.invalidate();
    }

    @Override // X.AbstractC221838nD
    public final List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct stickerStruct) {
        o.LJIIIZ(stickerStruct, "stickerStruct");
        return C223998qh.LIZJ(j, stickerStruct);
    }

    @Override // X.AbstractC221838nD
    public final void LIZJ(float f, float f2, InterfaceC221818nB popListener) {
        String str;
        int i;
        Parcelable[] parcelableArr;
        User author;
        String uid;
        C223778qL c223778qL;
        List<AddYoursAvatar> userAvatars;
        User author2;
        C223778qL c223778qL2;
        C223778qL c223778qL3;
        o.LJIIIZ(popListener, "popListener");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LJLJJLL < 1000) {
            return;
        }
        this.LJLJJLL = currentTimeMillis;
        String str2 = null;
        if (C226388uY.LJ()) {
            if (this.LJLJJL != null) {
                IAddYoursStickerRecordService LIZIZ = AddYoursStickerRecordServiceImpl.LIZIZ();
                ActivityC45651qj LJIJJLI = C86793Y4n.LJIJJLI(this.LJLIL);
                Aweme aweme = this.LJLJJL;
                AddYoursStickerStruct addYoursStickerStruct = this.LJLJI.getAddYoursStickerStruct();
                C245649kW c245649kW = this.LJLJJI;
                if (c245649kW != null && (c223778qL3 = c245649kW.LJIIZILJ) != null) {
                    str2 = c223778qL3.LIZ;
                }
                LIZIZ.LIZ(LJIJJLI, aweme, new AddYourRecordParam(addYoursStickerStruct, false, true, str2, "add_yours", "add_yours_card", String.valueOf(C77357UXp.LJIJ(this.LJLJJL.getAuthor())), true, false, this.LJLJJL.getGroupId(), null, null, 3074, null)).LIZLLL();
                return;
            }
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLIL, "//addyours/topic_detail");
        C245649kW c245649kW2 = this.LJLJJI;
        if (c245649kW2 != null && (c223778qL2 = c245649kW2.LJIIZILJ) != null) {
            str = c223778qL2.LIZ;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        buildRoute.withParam("enter_from", str);
        Aweme aweme2 = this.LJLJJL;
        if (aweme2 != null && (author2 = aweme2.getAuthor()) != null) {
            i = author2.getFollowStatus();
        } else {
            i = 0;
        }
        buildRoute.withParam("follow_status", i);
        AddYoursStickerStruct addYoursStickerStruct2 = this.LJLJI.getAddYoursStickerStruct();
        if (addYoursStickerStruct2 == null || (userAvatars = addYoursStickerStruct2.getUserAvatars()) == null || (parcelableArr = (AddYoursAvatar[]) userAvatars.toArray(new AddYoursAvatar[0])) == null) {
            parcelableArr = new Parcelable[0];
        }
        buildRoute.withParam("user_avatars", parcelableArr);
        AddYoursStickerStruct addYoursStickerStruct3 = this.LJLJI.getAddYoursStickerStruct();
        o.LJIIIIZZ(addYoursStickerStruct3, "stickerStruct.addYoursStickerStruct");
        buildRoute.withParam("topic", C78915Uy7.LJJIJL(addYoursStickerStruct3));
        C245649kW c245649kW3 = this.LJLJJI;
        if (c245649kW3 != null && (c223778qL = c245649kW3.LJIIZILJ) != null) {
            str2 = c223778qL.LIZ;
        }
        if (o.LJ(str2, "others_homepage")) {
            Aweme aweme3 = this.LJLJJL;
            if (aweme3 != null && (author = aweme3.getAuthor()) != null && (uid = author.getUid()) != null) {
                str3 = uid;
            }
            buildRoute.withParam("viewed_user_id", str3);
        }
        Aweme aweme4 = this.LJLJJL;
        if (aweme4 != null) {
            buildRoute.withParam("from_aweme", aweme4);
        }
        buildRoute.open();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C221748n4(Context context, C221718n1 view, InteractStickerStruct stickerStruct, C245649kW c245649kW, Aweme aweme) {
        super(context, view, stickerStruct, c245649kW);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(stickerStruct, "stickerStruct");
        this.LJLJJL = aweme;
    }
}
