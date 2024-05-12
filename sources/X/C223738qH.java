package X;

import Y.ACListenerS23S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS56S1100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.8qH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223738qH extends AbstractC224038ql implements G27 {
    public final Aweme LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C223748qI LJLLJ;
    public InterfaceC82683Wch LJLLL;

    @Override // X.Y1I
    public final void LJJII() {
    }

    @Override // X.Y1I
    public final void LJJIIZ() {
    }

    @Override // X.AbstractC224038ql
    public final View LJIILLIIL() {
        return new View(this.LJLILLLLZI);
    }

    @Override // X.AbstractC224038ql
    public final void LJIJI() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        HashtagStruct hashtagInfo;
        HashtagStruct hashtagInfo2;
        C223778qL c223778qL;
        C223778qL c223778qL2;
        C223778qL c223778qL3;
        C223778qL c223778qL4;
        String str6;
        String str7;
        String str8;
        String str9;
        MentionStruct mentionInfo;
        C223778qL c223778qL5;
        C223778qL c223778qL6;
        C223778qL c223778qL7;
        C223778qL c223778qL8;
        int i = this.LJLIL;
        String str10 = null;
        if (i == 8) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_method", "at_prop");
            C245649kW c245649kW = this.LJLJJI;
            if (c245649kW != null && (c223778qL8 = c245649kW.LJIIZILJ) != null) {
                str6 = c223778qL8.LIZ;
            } else {
                str6 = null;
            }
            c188727au.LJIIIZ("enter_from", str6);
            C245649kW c245649kW2 = this.LJLJJI;
            if (c245649kW2 != null && (c223778qL7 = c245649kW2.LJIIZILJ) != null) {
                str7 = c223778qL7.LIZIZ;
            } else {
                str7 = null;
            }
            c188727au.LJIIIZ("author_id", str7);
            C245649kW c245649kW3 = this.LJLJJI;
            if (c245649kW3 != null && (c223778qL6 = c245649kW3.LJIIZILJ) != null) {
                str8 = c223778qL6.LIZJ;
            } else {
                str8 = null;
            }
            c188727au.LJIIIZ("group_id", str8);
            C245649kW c245649kW4 = this.LJLJJI;
            if (c245649kW4 != null && (c223778qL5 = c245649kW4.LJIIZILJ) != null) {
                str9 = c223778qL5.LIZLLL;
            } else {
                str9 = null;
            }
            c188727au.LJIIIZ("log_pb", str9);
            InteractStickerStruct interactStickerStruct = this.LJLJLLL;
            if (interactStickerStruct != null && (mentionInfo = interactStickerStruct.getMentionInfo()) != null) {
                str10 = mentionInfo.getUserId();
            }
            c188727au.LJIIIZ("to_user_id", str10);
            FMX.LJIIL("at_prop_click", c188727au.LIZ);
            return;
        }
        if (i != 9) {
            return;
        }
        C188727au c188727au2 = new C188727au();
        C245649kW c245649kW5 = this.LJLJJI;
        if (c245649kW5 != null && (c223778qL4 = c245649kW5.LJIIZILJ) != null) {
            str = c223778qL4.LIZ;
        } else {
            str = null;
        }
        c188727au2.LJIIIZ("enter_from", str);
        C245649kW c245649kW6 = this.LJLJJI;
        if (c245649kW6 != null && (c223778qL3 = c245649kW6.LJIIZILJ) != null) {
            str2 = c223778qL3.LIZIZ;
        } else {
            str2 = null;
        }
        c188727au2.LJIIIZ("author_id", str2);
        C245649kW c245649kW7 = this.LJLJJI;
        if (c245649kW7 != null && (c223778qL2 = c245649kW7.LJIIZILJ) != null) {
            str3 = c223778qL2.LIZJ;
        } else {
            str3 = null;
        }
        c188727au2.LJIIIZ("group_id", str3);
        C245649kW c245649kW8 = this.LJLJJI;
        if (c245649kW8 != null && (c223778qL = c245649kW8.LJIIZILJ) != null) {
            str4 = c223778qL.LIZLLL;
        } else {
            str4 = null;
        }
        c188727au2.LJIIIZ("log_pb", str4);
        InteractStickerStruct interactStickerStruct2 = this.LJLJLLL;
        if (interactStickerStruct2 != null && (hashtagInfo2 = interactStickerStruct2.getHashtagInfo()) != null) {
            str5 = hashtagInfo2.getHashtagId();
        } else {
            str5 = null;
        }
        c188727au2.LJIIIZ("tag_id", str5);
        InteractStickerStruct interactStickerStruct3 = this.LJLJLLL;
        if (interactStickerStruct3 != null && (hashtagInfo = interactStickerStruct3.getHashtagInfo()) != null) {
            str10 = hashtagInfo.getHashtagName();
        }
        c188727au2.LJIIIZ("tag_name", str10);
        FMX.LJIIL("tag_prop_click", c188727au2.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f1, code lost:
    
        if (r3 == null) goto L62;
     */
    @Override // X.AbstractC224038ql
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ() {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223738qH.LJIJJ():void");
    }

    @Override // X.Y1E
    public final int getStickerType() {
        InteractStickerStruct interactStickerStruct = this.LJLJLLL;
        if (interactStickerStruct != null) {
            return interactStickerStruct.getType();
        }
        return 0;
    }

    @Override // X.Y1I
    public final View LIZ(int i) {
        return (View) this.LJLLILLLL.getValue();
    }

    @Override // X.AbstractC224038ql, X.Y1P
    public final void LJII(C245649kW interactStickerParams) {
        o.LJIIIZ(interactStickerParams, "interactStickerParams");
        this.LJLJJI = interactStickerParams;
        C223748qI c223748qI = this.LJLLJ;
        c223748qI.getClass();
        c223748qI.LJLJJI = interactStickerParams;
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        InterfaceC82683Wch interfaceC82683Wch = this.LJLLL;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
    }

    @Override // X.Y1P
    public final boolean LJIIJJI(long j, float f, float f2, int i) {
        return LJIIJJI(j, f, f2, i);
    }

    @Override // X.Y1P
    public final boolean LJIILIIL(long j, int i, float f, float f2, InterfaceC221818nB popListener) {
        o.LJIIIZ(popListener, "popListener");
        return LJIILIIL(j, i, f, f2, popListener);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.8qI] */
    public C223738qH(int i, final Context context, C224048qm c224048qm, final InteractStickerStruct interactStickerStruct, final C245649kW c245649kW, Aweme aweme) {
        super(i, context, c224048qm, interactStickerStruct, c245649kW);
        this.LJLLI = aweme;
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS153S0100000_3(context, 1717));
        this.LJLLJ = new AbstractC221838nD(context, this, interactStickerStruct, c245649kW) { // from class: X.8qI
            @Override // X.AbstractC221838nD
            public final List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct stickerStruct) {
                o.LJIIIZ(stickerStruct, "stickerStruct");
                return C223998qh.LIZJ(j, stickerStruct);
            }

            @Override // X.AbstractC221838nD
            public final void LIZJ(float f, float f2, InterfaceC221818nB popListener) {
                HashtagStruct hashtagInfo;
                InteractStickerStruct interactStickerStruct2;
                MentionStruct mentionInfo;
                String userId;
                String str;
                MentionStruct mentionInfo2;
                UrlModel avatarUrl;
                List<String> urlList;
                o.LJIIIZ(popListener, "popListener");
                AbstractC224038ql abstractC224038ql = this.LJLILLLLZI;
                o.LJII(abstractC224038ql, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.MentionHashTagInteractStickerView");
                final C223738qH c223738qH = (C223738qH) abstractC224038ql;
                int[] iArr = new int[2];
                c223738qH.LJLJI.getLocationOnScreen(iArr);
                if (c223738qH.LJLIL == 8 && (interactStickerStruct2 = c223738qH.LJLJLLL) != null && interactStickerStruct2.getMentionInfo() != null) {
                    InteractStickerStruct interactStickerStruct3 = c223738qH.LJLJLLL;
                    if (interactStickerStruct3 == null || (mentionInfo = interactStickerStruct3.getMentionInfo()) == null || (userId = mentionInfo.getUserId()) == null || userId.length() == 0) {
                        return;
                    }
                    InteractStickerStruct interactStickerStruct4 = c223738qH.LJLJLLL;
                    if (interactStickerStruct4 == null || (mentionInfo2 = interactStickerStruct4.getMentionInfo()) == null || (avatarUrl = mentionInfo2.getAvatarUrl()) == null || (urlList = avatarUrl.getUrlList()) == null || urlList.isEmpty()) {
                        str = "";
                    } else {
                        Object obj = ListProtector.get(urlList, 0);
                        o.LJIIIIZZ(obj, "avatarUrlList[0]");
                        str = (String) obj;
                    }
                    C6DJ c6dj = new C6DJ(c223738qH.LJLILLLLZI);
                    c6dj.LJI(WHL.TOP);
                    c6dj.LIZ(((int) f) + iArr[0], ((int) f2) + iArr[1]);
                    c6dj.LJIIJJI(new AqS56S1100000_2(c223738qH, str, 8));
                    InterfaceC82683Wch LIZJ = c6dj.LIZJ();
                    c223738qH.LJLLL = LIZJ;
                    LIZJ.LIZJ(new ACListenerS23S0100000_3(c223738qH, 315), true);
                    InterfaceC82683Wch interfaceC82683Wch = c223738qH.LJLLL;
                    C9XU.LIZ(c223738qH.LJLILLLLZI.hashCode(), c223738qH);
                    if (interfaceC82683Wch == null) {
                        return;
                    }
                    interfaceC82683Wch.LIZIZ(new InterfaceC82688Wcm() { // from class: X.8qK
                        @Override // X.InterfaceC82688Wcm
                        public final void onDismiss() {
                            C9XU.LIZLLL(C223738qH.this);
                        }
                    });
                    interfaceC82683Wch.show();
                    return;
                }
                if (c223738qH.LJLIL != 9) {
                    return;
                }
                InteractStickerStruct interactStickerStruct5 = c223738qH.LJLJLLL;
                if (interactStickerStruct5 != null && (hashtagInfo = interactStickerStruct5.getHashtagInfo()) != null && hashtagInfo.getStatus() == 0) {
                    C26045AKb c26045AKb = new C26045AKb((View) c223738qH.LJLLILLLL.getValue());
                    c26045AKb.LJIIIZ(c223738qH.LJLILLLLZI.getResources().getString(R.string.h1w));
                    c26045AKb.LJIIJ();
                    return;
                }
                C6DJ c6dj2 = new C6DJ(c223738qH.LJLILLLLZI);
                c6dj2.LJI(WHL.TOP);
                c6dj2.LIZ(((int) f) + iArr[0], ((int) f2) + iArr[1]);
                c6dj2.LJIIJJI(new AqS168S0100000_2(c223738qH, 642));
                c6dj2.LJIIJ(new ACListenerS23S0100000_3(c223738qH, 316), true);
                InterfaceC82683Wch LIZJ2 = c6dj2.LIZJ();
                c223738qH.LJLLL = LIZJ2;
                LIZJ2.LIZJ(new ACListenerS23S0100000_3(c223738qH, 317), true);
                InterfaceC82683Wch interfaceC82683Wch2 = c223738qH.LJLLL;
                C9XU.LIZ(c223738qH.LJLILLLLZI.hashCode(), c223738qH);
                if (interfaceC82683Wch2 == null) {
                    return;
                }
                interfaceC82683Wch2.LIZIZ(new InterfaceC82688Wcm() { // from class: X.8qK
                    @Override // X.InterfaceC82688Wcm
                    public final void onDismiss() {
                        C9XU.LIZLLL(C223738qH.this);
                    }
                });
                interfaceC82683Wch2.show();
            }

            {
                o.LJIIIZ(this, "view");
            }
        };
    }
}
