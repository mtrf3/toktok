package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.jvm.internal.o;

/* renamed from: X.3hm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91063hm {
    public final Context LIZ;
    public final int LIZIZ;
    public final InterfaceC88472Yns<Integer, C76800UCe> LIZJ;

    public final void LIZ(FragmentManager fragmentManager, final String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        ASL asl = new ASL();
        C92213jd c92213jd = new C92213jd(this.LIZ, this.LIZIZ, this.LIZJ);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLI = c92213jd;
        tuxSheet.LJLILLLLZI = new DialogInterface.OnDismissListener() { // from class: X.3hq
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                String str;
                if (dialogInterface == null) {
                    return;
                }
                AST LJIIIIZZ = ASQ.LJIIIIZZ(dialogInterface);
                if (LJIIIIZZ instanceof C91153hv) {
                    int i = ((C91153hv) LJIIIIZZ).LIZ;
                    if (i != 1) {
                        if (i != 3) {
                            if (i != 4) {
                                str = "close";
                            } else {
                                str = "create_video_sticker";
                            }
                        } else {
                            str = "not_now";
                        }
                    } else {
                        str = "confirm";
                    }
                } else {
                    InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns = C91063hm.this.LIZJ;
                    if (interfaceC88472Yns != null) {
                        interfaceC88472Yns.invoke(0);
                    }
                    str = "click_background";
                }
                String str2 = enterFrom;
                C85323Wm onEventV3 = C772831o.LIZ();
                o.LJIIIZ(onEventV3, "onEventV3");
                C1HQ c1hq = new C1HQ();
                c1hq.put("enter_from", str2);
                c1hq.put("action", str);
                onEventV3.LIZIZ("video_sticker_popup_close", c1hq);
            }
        };
        tuxSheet.show(fragmentManager, "VideoStickerUserEducationSheet");
        int i = this.LIZIZ;
        if (i == EnumC91123hs.EDUCATION_SHEET_GOT_IT.getValue()) {
            Keva kevaRepo = C91093hp.LIZLLL();
            o.LJIIIIZZ(kevaRepo, "kevaRepo");
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(curUserId, "userService().curUserId");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("key_has_show_chat_page_education_sheet");
            LIZ.append(curUserId);
            kevaRepo.storeBoolean(X1D.LIZIZ(LIZ), true);
        } else if (i == EnumC91123hs.EDUCATION_SHEET_CREATE_AND_NOT_NOW.getValue()) {
            Keva kevaRepo2 = C91093hp.LIZLLL();
            o.LJIIIIZZ(kevaRepo2, "kevaRepo");
            String curUserId2 = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(curUserId2, "userService().curUserId");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("key_has_show_feed_education_sheet");
            LIZ2.append(curUserId2);
            kevaRepo2.storeBoolean(X1D.LIZIZ(LIZ2), true);
        }
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", enterFrom);
        onEventV3.LIZIZ("video_sticker_popup_show", c1hq);
    }

    public C91063hm(int i, Context context, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = i;
        this.LIZJ = interfaceC88472Yns;
    }
}
