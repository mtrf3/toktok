package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.4M3, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4M3 implements InterfaceC1040946r, InterfaceC89653fV {
    public final String LIZ;
    public final C4MC LIZIZ;
    public final WeakReference<InterfaceC89653fV> LIZJ;
    public volatile C4M6 LIZLLL;

    public abstract void LJFF(String str, UrlModel urlModel);

    public abstract void LJI(String str, UrlModel urlModel, int i, int i2, int i3, C4M5 c4m5);

    public abstract void LJIIIIZZ(UrlModel urlModel, int i, int i2, int i3, C4M5 c4m5);

    @Override // X.InterfaceC1040946r
    public final void LIZIZ() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unbind: info=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", this=");
        LIZ.append(hashCode());
        C89553fL.LIZIZ("AvatarLoaderImpl", X1D.LIZIZ(LIZ));
        C4M6 c4m6 = this.LIZLLL;
        if (c4m6 != null && (!c4m6.LIZ) && (str = c4m6.LIZIZ) != null) {
            this.LIZIZ.LIZJ(str, this.LIZJ);
        }
        this.LIZLLL = null;
    }

    public C4M3(String str, C4MC resManager) {
        o.LJIIIZ(resManager, "resManager");
        this.LIZ = str;
        this.LIZIZ = resManager;
        this.LIZJ = new WeakReference<>(this);
    }

    @Override // X.InterfaceC89653fV
    public final void LJ(String uid, UrlModel newAvatar) {
        boolean z;
        String str;
        boolean z2;
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(newAvatar, "newAvatar");
        C4M6 c4m6 = this.LIZLLL;
        if (c4m6 != null && !c4m6.LIZ) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onAvatarChanged: binding avatar is group, loadInfo=");
            LIZ.append(this.LIZLLL);
            C89553fL.LIZ("AvatarLoaderImpl", X1D.LIZIZ(LIZ));
            return;
        }
        C4M6 c4m62 = this.LIZLLL;
        String str2 = null;
        if (c4m62 != null) {
            str = c4m62.LIZIZ;
        } else {
            str = null;
        }
        if (o.LJ(str, uid)) {
            C4M6 c4m63 = this.LIZLLL;
            if (c4m63 != null && c4m63.LJIIIIZZ == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C4M6 c4m64 = this.LIZLLL;
                if (c4m64 != null) {
                    str2 = c4m64.LJI;
                }
                if (o.LJ(str2, C89553fL.LJIIIIZZ(newAvatar, true))) {
                    StringBuilder LIZIZ = C25620zW.LIZIZ("onAvatarChanged: uid=", uid, ", valid=");
                    LIZIZ.append(C89553fL.LJI(newAvatar, false));
                    LIZIZ.append(", uri=");
                    LIZIZ.append(C89553fL.LJIIIIZZ(newAvatar, true));
                    C89553fL.LIZIZ("AvatarLoaderImpl", X1D.LIZIZ(LIZIZ));
                    return;
                }
            }
            LJII(newAvatar, 9);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAvatarChanged: uid=");
            LIZ2.append(uid);
            LIZ2.append(", valid=");
            LIZ2.append(C89553fL.LJI(newAvatar, false));
            LIZ2.append(", uri=");
            LIZ2.append(C89553fL.LJIIIIZZ(newAvatar, true));
            C89553fL.LIZIZ("AvatarLoaderImpl", X1D.LIZIZ(LIZ2));
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("onAvatarChanged: uid is not equals, ignore, bondUid=");
        C4M6 c4m65 = this.LIZLLL;
        if (c4m65 != null) {
            str2 = c4m65.LIZIZ;
        }
        LIZ3.append(str2);
        LIZ3.append(", uid=");
        LIZ3.append(uid);
        C89553fL.LIZ("AvatarLoaderImpl", X1D.LIZIZ(LIZ3));
    }

    public final void LJII(UrlModel urlModel, int i) {
        int i2;
        int i3;
        int i4;
        String str;
        C4M6 c4m6 = this.LIZLLL;
        if (c4m6 != null) {
            if (urlModel != null) {
                str = C89553fL.LJIIIIZZ(urlModel, true);
            } else {
                str = null;
            }
            c4m6.LJI = str;
            c4m6.LJIIIIZZ = 1;
            c4m6.LJII = i;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadUserAvatar: info=");
        LIZ.append(this.LIZLLL);
        C89553fL.LIZIZ("AvatarLoaderImpl", X1D.LIZIZ(LIZ));
        C4M6 c4m62 = this.LIZLLL;
        if (c4m62 == null) {
            i2 = R.drawable.dds;
        } else {
            i2 = c4m62.LJ;
            if (i2 <= 0) {
                i2 = R.drawable.dds;
            }
        }
        if (LBS.LJFF) {
            i3 = R.drawable.b0p;
        } else {
            i3 = R.drawable.dds;
        }
        if (urlModel == null) {
            LJIIIIZZ(null, 0, i2, i3, new C4M5(this, this.LIZLLL));
            return;
        }
        C4M6 c4m63 = this.LIZLLL;
        if (c4m63 != null) {
            i4 = c4m63.LIZJ;
        } else {
            i4 = 0;
        }
        LJIIIIZZ(urlModel, i4, i2, i3, new C4M5(this, this.LIZLLL));
    }

    @Override // X.InterfaceC1040946r
    public final void LIZ(IMContact contact, int i, int i2) {
        o.LJIIIZ(contact, "contact");
        if (contact instanceof IMUser) {
            IMUser iMUser = (IMUser) contact;
            String uid = iMUser.getUid();
            o.LJIIIIZZ(uid, "contact.uid");
            LIZLLL(i, i2, iMUser.getDisplayAvatar(), uid);
            return;
        }
        if (contact instanceof C81243Gu) {
            C81243Gu c81243Gu = (C81243Gu) contact;
            LIZLLL(i, i2, c81243Gu.getDisplayAvatar(), c81243Gu.getUid());
        } else {
            if (contact instanceof IMConversation) {
                IMConversation iMConversation = (IMConversation) contact;
                if (iMConversation.getConversationType() == AbstractC63505Ow9.LIZ) {
                    LIZLLL(i, i2, iMConversation.getDisplayAvatar(), String.valueOf(C81273Gx.LIZLLL(iMConversation.getConversationId())));
                    return;
                } else {
                    String conversationId = iMConversation.getConversationId();
                    o.LJIIIIZZ(conversationId, "contact.conversationId");
                    C1040846q.LIZ(this, conversationId, null, iMConversation.getDisplayAvatar(), i, i2, 2);
                    return;
                }
            }
            C89553fL.LIZ("AvatarLoaderImpl", "bind: invalid contact type");
        }
    }

    @Override // X.InterfaceC1040946r
    public final void LIZLLL(int i, int i2, UrlModel urlModel, String uid) {
        boolean z;
        String str;
        o.LJIIIZ(uid, "uid");
        C4M6 c4m6 = this.LIZLLL;
        boolean z2 = false;
        if (c4m6 != null && C89553fL.LJII(uid) && o.LJ(c4m6.LIZIZ, uid) && C78685UuP.LJJJZ(c4m6.LJI) && c4m6.LJIIIIZZ == 2) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (z) {
            C31A c31a = C31A.LIZ;
            C4M6 c4m62 = this.LIZLLL;
            if (c4m62 != null) {
                C31A.LIZIZ(c31a, true, c4m62.LIZIZ, c4m62.LIZLLL, 6, c4m62.LIZ, true, false);
            }
            StringBuilder LIZIZ = C25620zW.LIZIZ("bind: avatar is the same, skip, uid=", uid, ", uri=");
            C4M6 c4m63 = this.LIZLLL;
            if (c4m63 != null) {
                str2 = c4m63.LJI;
            }
            LIZIZ.append(str2);
            C89553fL.LIZIZ("AvatarLoaderImpl", X1D.LIZIZ(LIZIZ));
            return;
        }
        C4M6 c4m64 = this.LIZLLL;
        if (c4m64 != null) {
            str = c4m64.LIZIZ;
        } else {
            str = null;
        }
        if (str == null) {
            StringBuilder LIZIZ2 = C25620zW.LIZIZ("bind: add observer, uid=", uid, ", this=");
            LIZIZ2.append(hashCode());
            C89553fL.LIZIZ("AvatarLoaderImpl", X1D.LIZIZ(LIZIZ2));
            this.LIZIZ.LIZIZ(uid, this.LIZJ);
        } else if (!o.LJ(str, uid)) {
            StringBuilder LIZIZ3 = C25620zW.LIZIZ("bind: replace observer, uid=", uid, ", this=");
            LIZIZ3.append(hashCode());
            C89553fL.LIZIZ("AvatarLoaderImpl", X1D.LIZIZ(LIZIZ3));
            this.LIZIZ.LIZJ(str, this.LIZJ);
            this.LIZIZ.LIZIZ(uid, this.LIZJ);
        } else {
            StringBuilder LIZIZ4 = C25620zW.LIZIZ("bind: observer is same, uid=", uid, ", this=");
            LIZIZ4.append(hashCode());
            C89553fL.LIZIZ("AvatarLoaderImpl", X1D.LIZIZ(LIZIZ4));
        }
        this.LIZLLL = new C4M6(uid, i, false, i2, hashCode(), this.LIZ);
        if (!C89553fL.LJII(uid)) {
            if (urlModel != null && C89553fL.LJI(urlModel, true)) {
                z2 = true;
            }
            LJII(urlModel, 7);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bind: uid is invalid, avatar_valid = ");
            LIZ.append(z2);
            C89553fL.LIZ("AvatarLoaderImpl", X1D.LIZIZ(LIZ));
            return;
        }
        UrlModel LIZ2 = this.LIZIZ.LIZ(uid, urlModel);
        if (LIZ2 != null) {
            if (C89553fL.LJI(LIZ2, true)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("bind: avatar is valid, uid=");
                LIZ3.append(uid);
                C89553fL.LIZIZ("AvatarLoaderImpl", X1D.LIZIZ(LIZ3));
                LJII(LIZ2, 3);
                return;
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("bind: avatar is expired, uid=");
            LIZ4.append(uid);
            C89553fL.LIZIZ("AvatarLoaderImpl", X1D.LIZIZ(LIZ4));
            LJII(LIZ2, 8);
            return;
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("bind: avatar is null, uid=");
        LIZ5.append(uid);
        C89553fL.LIZIZ("AvatarLoaderImpl", X1D.LIZIZ(LIZ5));
        LJII(null, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    @Override // X.InterfaceC1040946r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r22, java.lang.String r23, com.ss.android.ugc.aweme.base.model.UrlModel r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4M3.LIZJ(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, int, int):void");
    }
}
