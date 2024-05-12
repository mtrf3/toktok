package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AQX implements InterfaceC47119IeR {
    public final /* synthetic */ Aweme LIZ;
    public final /* synthetic */ EnumC237029Ry LIZIZ;

    public AQX(Aweme aweme, EnumC237029Ry enumC237029Ry) {
        this.LIZ = aweme;
        this.LIZIZ = enumC237029Ry;
    }

    @Override // X.InterfaceC47119IeR
    public final /* synthetic */ void LIZIZ() {
    }

    @Override // X.InterfaceC47119IeR
    public final void LIZ(int i, long j, long j2, String context) {
        UrlModel originCover;
        List<String> urlList;
        UrlModel originCover2;
        List<String> urlList2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("offline_mode.");
        String curSecUserId = AQW.LJ.getCurSecUserId();
        if (curSecUserId == null) {
            return;
        }
        LIZ.append(curSecUserId);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (C78685UuP.LJJJZ(context)) {
            o.LJIIIIZZ(context, "context");
            if (ujb.o.LJJJLIIL(context, LIZIZ, false)) {
                String str = null;
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            if (i != 7) {
                                if (i != 8) {
                                    return;
                                }
                                C26222AQw c26222AQw = AQW.LIZLLL;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("start downloading ");
                                LIZ2.append(this.LIZ.getAid());
                                c26222AQw.LJIIIIZZ(X1D.LIZIZ(LIZ2));
                                AQW.LIZ.getClass();
                                if (AQW.LIZIZ() != null || AQO.LIZJ() == C9SN.USER_PAUSE || AQO.LIZJ() == C9SN.UNINITIALIZED) {
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append("downloadState: ");
                                    LIZ3.append(AQO.LIZJ());
                                    LIZ3.append("  pause download and return");
                                    c26222AQw.LJIIIIZZ(X1D.LIZIZ(LIZ3));
                                    AQW.LJIIJJI(false);
                                    return;
                                }
                                if (!AQW.LIZJ && this.LIZIZ == EnumC237029Ry.SYSTEM_RESUME && AQO.LIZLLL().getInt("keva_end_reason", -1) == -1) {
                                    AQW.LIZJ = true;
                                    AQW.LJIIIZ(C9SO.OTHERS.getValue());
                                }
                                if (!AQO.LIZLLL().getBoolean("HAS_DOWNLOAD_START", false) && AQO.LIZIZ() < AQO.LIZ()) {
                                    AQW.LIZJ = true;
                                    AQW.LJIIJ(this.LIZIZ);
                                    AQO.LJIIIIZZ(C9SN.DOWNLOADING);
                                }
                                Video video = this.LIZ.getVideo();
                                if (video == null || (originCover = video.getOriginCover()) == null || (urlList = originCover.getUrlList()) == null || !(!urlList.isEmpty())) {
                                    return;
                                }
                                W6J LIZ4 = W5I.LIZ();
                                Video video2 = this.LIZ.getVideo();
                                if (video2 != null && (originCover2 = video2.getOriginCover()) != null && (urlList2 = originCover2.getUrlList()) != null) {
                                    str = (String) ListProtector.get(urlList2, 0);
                                }
                                LIZ4.LJIILIIL(W5O.LIZIZ(str));
                                return;
                            }
                            C26222AQw c26222AQw2 = AQW.LIZLLL;
                            StringBuilder LIZ5 = X1D.LIZ();
                            LIZ5.append("task added aid: ");
                            LIZ5.append(this.LIZ.getAid());
                            c26222AQw2.LJIIIIZZ(X1D.LIZIZ(LIZ5));
                            return;
                        }
                        C26222AQw c26222AQw3 = AQW.LIZLLL;
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append("cancel download ");
                        LIZ6.append(this.LIZ.getAid());
                        c26222AQw3.LJIIIIZZ(X1D.LIZIZ(LIZ6));
                        return;
                    }
                    C26222AQw c26222AQw4 = AQW.LIZLLL;
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("download failed ");
                    LIZ7.append(this.LIZ.getAid());
                    c26222AQw4.LJIIIIZZ(X1D.LIZIZ(LIZ7));
                    return;
                }
                C26222AQw c26222AQw5 = AQW.LIZLLL;
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append("preload succeed ");
                LIZ8.append(this.LIZ.getAid());
                LIZ8.append(' ');
                LIZ8.append(j);
                LIZ8.append(' ');
                LIZ8.append(j2);
                c26222AQw5.LJIIIIZZ(X1D.LIZIZ(LIZ8));
                if (AQO.LIZJ() != C9SN.DOWNLOADING) {
                    if (AQO.LIZIZ() >= AQO.LIZ()) {
                        AQO.LJIIIIZZ(C9SN.DOWNLOADED);
                        return;
                    }
                    return;
                } else {
                    StringBuilder LIZ9 = X1D.LIZ();
                    LIZ9.append("download complete ");
                    LIZ9.append(this.LIZ.getAid());
                    c26222AQw5.LJIIIIZZ(X1D.LIZIZ(LIZ9));
                    XKX.LIZLLL(AQW.LIZIZ, null, null, new AQR(this.LIZ, null), 3);
                    return;
                }
            }
        }
        if (!C78685UuP.LJJJZ(context)) {
            return;
        }
        o.LJIIIIZZ(context, "context");
        if (!ujb.o.LJJJLIIL(context, "offline_mode.", false)) {
            return;
        }
        C47242IgQ.LIZ().removePriorityTaskByContextKey(context);
    }
}
