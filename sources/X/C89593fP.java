package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS56S1200000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.3fP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89593fP implements C4MC {
    public static final /* synthetic */ int LJFF = 0;
    public final java.util.Map<String, List<WeakReference<InterfaceC89653fV>>> LIZ = new LinkedHashMap();
    public final ConcurrentHashMap<String, UrlModel> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, UrlModel> LIZJ = new ConcurrentHashMap<>();
    public final HashSet<String> LIZLLL = new HashSet<>();
    public boolean LJ;

    public final synchronized void LJI() {
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onUserUpdate$im_base_release(C39R event) {
        o.LJIIIZ(event, "event");
        String str = event.LJLIL;
        if (str == null) {
            return;
        }
        UrlModel avatarThumb = event.LJLJI.getAvatarThumb();
        o.LJIIIIZZ(avatarThumb, "event.user.avatarThumb");
        LJ(str, avatarThumb);
    }

    @Override // X.C4MC
    public final UrlModel LIZ(String uid, UrlModel urlModel) {
        UrlModel urlModel2;
        o.LJIIIZ(uid, "uid");
        UrlModel urlModel3 = this.LIZJ.get(uid);
        boolean z = false;
        String str = null;
        if (C89553fL.LJI(urlModel3, false)) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("getAvatar: fixed, uid=", uid, ", uri=");
            if (urlModel3 != null) {
                str = C89553fL.LJIIIIZZ(urlModel3, true);
            }
            LIZIZ.append(str);
            C89553fL.LIZ("DMAvatarResManager", X1D.LIZIZ(LIZIZ));
            return urlModel3;
        }
        UrlModel urlModel4 = this.LIZIZ.get(uid);
        if (C89553fL.LJI(urlModel4, false)) {
            StringBuilder LIZIZ2 = C25620zW.LIZIZ("getAvatar: checking, uid=", uid, ", uri=");
            if (urlModel4 != null) {
                str = C89553fL.LJIIIIZZ(urlModel4, true);
            }
            LIZIZ2.append(str);
            C89553fL.LIZ("DMAvatarResManager", X1D.LIZIZ(LIZIZ2));
            return urlModel4;
        }
        IMUser LJIIL = C80533Eb.LJIIL(uid);
        if (LJIIL != null) {
            urlModel2 = LJIIL.getAvatarThumb();
        } else {
            urlModel2 = null;
        }
        if (C89553fL.LJI(urlModel2, false)) {
            StringBuilder LIZIZ3 = C25620zW.LIZIZ("getAvatar: cache, uid=", uid, ", uri=");
            if (urlModel2 != null) {
                str = C89553fL.LJIIIIZZ(urlModel2, true);
            }
            LIZIZ3.append(str);
            C89553fL.LIZIZ("DMAvatarResManager", X1D.LIZIZ(LIZIZ3));
            return urlModel2;
        }
        if (urlModel != null && C89553fL.LJI(urlModel, false)) {
            z = true;
        }
        if (z) {
            StringBuilder LIZIZ4 = C25620zW.LIZIZ("getAvatar: outer, uid=", uid, ", uri=");
            LIZIZ4.append(C89553fL.LJIIIIZZ(urlModel, true));
            C89553fL.LIZIZ("DMAvatarResManager", X1D.LIZIZ(LIZIZ4));
            this.LIZIZ.put(uid, urlModel);
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C89583fO(uid, urlModel, this, null), 3);
            return urlModel;
        }
        if (urlModel2 != null) {
            StringBuilder LIZIZ5 = C25620zW.LIZIZ("getAvatar: invalid, cache, uid=", uid, ", uri=");
            LIZIZ5.append(C89553fL.LJIIIIZZ(urlModel2, true));
            C89553fL.LIZIZ("DMAvatarResManager", X1D.LIZIZ(LIZIZ5));
            urlModel = urlModel2;
        } else if (urlModel != null) {
            StringBuilder LIZIZ6 = C25620zW.LIZIZ("getAvatar: invalid, outer, uid=", uid, ", uri=");
            LIZIZ6.append(C89553fL.LJIIIIZZ(urlModel, true));
            C89553fL.LIZIZ("DMAvatarResManager", X1D.LIZIZ(LIZIZ6));
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getAvatar: null, uid=");
            LIZ.append(uid);
            C89553fL.LIZIZ("DMAvatarResManager", X1D.LIZIZ(LIZ));
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C89603fQ(this, uid, null), 3);
            return null;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C89623fS(this, uid, null), 3);
        return urlModel;
    }

    @Override // X.C4MC
    public final synchronized void LIZIZ(String uid, WeakReference<InterfaceC89653fV> observer) {
        Integer num;
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(observer, "observer");
        List list = (List) ((LinkedHashMap) this.LIZ).get(uid);
        if (list == null) {
            this.LIZ.put(uid, C47261Igj.LJJIJIL(observer));
        } else {
            ORS.LJJLIL(C89633fT.LJLIL, list);
            list.add(observer);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("registerObserver: add observer, uid=");
        LIZ.append(uid);
        LIZ.append(", observer=");
        InterfaceC89653fV interfaceC89653fV = observer.get();
        if (interfaceC89653fV != null) {
            num = Integer.valueOf(interfaceC89653fV.hashCode());
        } else {
            num = null;
        }
        LIZ.append(num);
        C89553fL.LIZIZ("DMAvatarResManager", X1D.LIZIZ(LIZ));
        if (this.LIZ.size() > 200) {
            LJI();
        }
    }

    @Override // X.C4MC
    public final synchronized void LIZJ(String str, WeakReference<InterfaceC89653fV> observer) {
        Integer num;
        o.LJIIIZ(observer, "observer");
        List list = (List) ((LinkedHashMap) this.LIZ).get(str);
        if (list == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unRegisterObserver: list is null, uid=");
            LIZ.append(str);
            C89553fL.LIZ("DMAvatarResManager", X1D.LIZIZ(LIZ));
            return;
        }
        if (list.isEmpty()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("unRegisterObserver: list is empty, uid=");
            LIZ2.append(str);
            C89553fL.LIZ("DMAvatarResManager", X1D.LIZIZ(LIZ2));
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("unRegisterObserver: remove observer, uid=");
        LIZ3.append(str);
        LIZ3.append(", observer=");
        InterfaceC89653fV interfaceC89653fV = observer.get();
        if (interfaceC89653fV != null) {
            num = Integer.valueOf(interfaceC89653fV.hashCode());
        } else {
            num = null;
        }
        LIZ3.append(num);
        C89553fL.LIZIZ("DMAvatarResManager", X1D.LIZIZ(LIZ3));
        list.remove(observer);
        if (list.isEmpty()) {
            this.LIZ.remove(str);
        }
    }

    public final void LJ(String str, UrlModel urlModel) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("notifyChange: uid=", str, ", avatar=");
        LIZIZ.append(C89553fL.LJIIIIZZ(urlModel, true));
        C89553fL.LIZIZ("DMAvatarResManager", X1D.LIZIZ(LIZIZ));
        synchronized (this) {
            List list = (List) ((LinkedHashMap) this.LIZ).get(str);
            if (list != null) {
                if (list.isEmpty()) {
                    this.LIZ.remove(str);
                } else {
                    C43045Guv.LIZLLL(new AqS56S1200000_1((List) new ArrayList(list), (List<? extends WeakReference<InterfaceC89653fV>>) str, (String) urlModel, (UrlModel) 6), 0L);
                }
            }
        }
    }

    public final void LJFF(final int i, final String str) {
        synchronized (this) {
            if (this.LIZLLL.contains(str)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("refreshUserInfoFromNet: remainRetry=");
                LIZ.append(i);
                LIZ.append(", uid=");
                LIZ.append(str);
                C89553fL.LIZIZ("DMAvatarResManager", X1D.LIZIZ(LIZ));
                return;
            }
            this.LIZLLL.add(str);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("refreshUserInfoFromNet: remainRetry=");
            LIZ2.append(i);
            LIZ2.append(", uid=");
            LIZ2.append(str);
            C89553fL.LIZIZ("DMAvatarResManager", X1D.LIZIZ(LIZ2));
            if (str.length() > 0 && 1 != 0) {
                C80533Eb.LJIIJJI(str, null, true, new C3EU() { // from class: X.3fM
                    @Override // X.C3EU
                    public final void LIZ(IMUser result) {
                        String str2;
                        boolean z;
                        o.LJIIIZ(result, "result");
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("refreshUserInfoFromNet: onQueryResult, uid=");
                        LIZ3.append(str);
                        LIZ3.append(", uri=");
                        UrlModel avatarThumb = result.getAvatarThumb();
                        if (avatarThumb != null) {
                            str2 = C89553fL.LJIIIIZZ(avatarThumb, true);
                        } else {
                            str2 = null;
                        }
                        LIZ3.append(str2);
                        LIZ3.append(", enableLimit=");
                        C62822Ol8 c62822Ol8 = C84673Tz.LIZ;
                        if (((Number) c62822Ol8.getValue()).intValue() == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        LIZ3.append(z);
                        C89553fL.LIZIZ("DMAvatarResManager", X1D.LIZIZ(LIZ3));
                        if (((Number) c62822Ol8.getValue()).intValue() == 2) {
                            C89553fL.LIZ.add(result.getUid());
                        }
                        C89593fP c89593fP = this;
                        String str3 = str;
                        synchronized (this) {
                            c89593fP.LIZLLL.remove(str3);
                        }
                        C89593fP c89593fP2 = this;
                        if (c89593fP2.LIZJ.contains(result.getUid()) && C89553fL.LJI(result.getAvatarThumb(), false)) {
                            String uid = result.getUid();
                            o.LJIIIIZZ(uid, "result.uid");
                            UrlModel avatarThumb2 = result.getAvatarThumb();
                            o.LJIIIIZZ(avatarThumb2, "result.avatarThumb");
                            c89593fP2.LIZLLL(avatarThumb2, uid, false);
                            return;
                        }
                        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C89573fN(c89593fP2, result, null), 3);
                    }

                    @Override // X.C3EU
                    public final void LIZIZ(Throwable throwable) {
                        o.LJIIIZ(throwable, "throwable");
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("refreshUserInfoFromNet: onQueryError, uid=");
                        LIZ3.append(str);
                        LIZ3.append(", remainRetry=");
                        LIZ3.append(i);
                        C89553fL.LIZIZ("DMAvatarResManager", X1D.LIZIZ(LIZ3));
                        if (i > 0) {
                            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C89613fR(this, str, i, null), 3);
                            return;
                        }
                        C89593fP c89593fP = this;
                        String str2 = str;
                        synchronized (this) {
                            c89593fP.LIZLLL.remove(str2);
                        }
                    }
                });
            }
        }
    }

    public final void LIZLLL(UrlModel urlModel, String str, boolean z) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("addToFixedAvatar: uid=", str, ", uri=");
        LIZIZ.append(C89553fL.LJIIIIZZ(urlModel, true));
        LIZIZ.append(", needNotify=");
        LIZIZ.append(z);
        C89553fL.LIZ("DMAvatarResManager", X1D.LIZIZ(LIZIZ));
        this.LIZJ.put(str, urlModel);
        if (z) {
            LJ(str, urlModel);
        }
    }
}
