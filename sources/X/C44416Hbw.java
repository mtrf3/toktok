package X;

import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.profile.model.SpecialAccount;
import com.ss.android.ugc.aweme.profile.model.TTSeller;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Hbw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44416Hbw {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZLLL() {
        User currentUser;
        InterfaceC44417Hbx LIZ2 = NH7.LIZ();
        if (LIZ2 == null || (currentUser = LIZ2.getCurrentUser()) == null || currentUser.getMusicComplianceAccount() <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF() {
        InterfaceC44417Hbx LIZ2;
        String str;
        InterfaceC44417Hbx LIZ3;
        String str2;
        InterfaceC44417Hbx LIZ4;
        InterfaceC44417Hbx LIZ5;
        User currentUser;
        SpecialAccount specialAccount;
        TTSeller seller;
        InterfaceC44417Hbx LIZ6 = NH7.LIZ();
        if (LIZ6 != null && LIZ6.isChildrenMode()) {
            return false;
        }
        InterfaceC44417Hbx LIZ7 = NH7.LIZ();
        if ((LIZ7 == null || !LIZ7.LIZ()) && (((LIZ2 = NH7.LIZ()) == null || (currentUser = LIZ2.getCurrentUser()) == null || (specialAccount = currentUser.specialAccount) == null || (seller = specialAccount.getSeller()) == null || seller.getType() != 1) && !LIZLLL())) {
            InterfaceC44417Hbx LIZ8 = NH7.LIZ();
            String str3 = null;
            if (LIZ8 != null) {
                str = LIZ8.getShootWay();
            } else {
                str = null;
            }
            if ((!TextUtils.equals(str, "challenge") || (LIZ5 = NH7.LIZ()) == null || !LIZ5.isCommerceChallenge()) && ((LIZ3 = NH7.LIZ()) == null || !LIZ3.LIZJ() || !C19N.LJ("enable_music_legal_optimize", false))) {
                InterfaceC44417Hbx LIZ9 = NH7.LIZ();
                if (LIZ9 != null) {
                    str2 = LIZ9.getShootWay();
                } else {
                    str2 = null;
                }
                if (!TextUtils.equals(str2, "tcm_upload")) {
                    InterfaceC44417Hbx LIZ10 = NH7.LIZ();
                    if (LIZ10 != null) {
                        str3 = LIZ10.getShootWay();
                    }
                    if (!TextUtils.equals(str3, "mission")) {
                        InterfaceC44417Hbx LIZ11 = NH7.LIZ();
                        o.LJI(LIZ11);
                        if (!LIZ11.isInShoutout() && !H92.LJ() && ((LIZ4 = NH7.LIZ()) == null || !LIZ4.isSubOnlyVideo())) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static final C47325Ihl LIZJ(MusicModel musicModel) {
        o.LJIIIZ(musicModel, "musicModel");
        C47325Ihl c47325Ihl = new C47325Ihl();
        c47325Ihl.LJFF = musicModel.getMusicId();
        if (musicModel.getMusicType() == MusicModel.MusicType.ONLINE) {
            c47325Ihl.LIZJ = 4;
        }
        c47325Ihl.LIZLLL = musicModel.getDuration();
        if (musicModel.isPlayUrlValid()) {
            c47325Ihl.LIZIZ = musicModel.getUrl().getUrlList();
        }
        c47325Ihl.LJI = true;
        return c47325Ihl;
    }

    public static C44418Hby LJI(Aweme aweme) {
        int i;
        o.LJIIIZ(aweme, "<this>");
        C44421Hc1 c44421Hc1 = new C44421Hc1();
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        c44421Hc1.LIZIZ = aid;
        C44421Hc1 LIZIZ = LIZIZ(LIZIZ(c44421Hc1, aweme.getVideo().getPlayAddrH264()), aweme.getVideo().getPlayAddrBytevc1());
        List<BitRate> bitRate = aweme.getVideo().getBitRate();
        if (bitRate != null && !bitRate.isEmpty()) {
            for (BitRate bitRate2 : bitRate) {
                UrlModel playAddr = bitRate2.getPlayAddr();
                if (playAddr != null) {
                    LIZIZ.getClass();
                    C44398Hbe c44398Hbe = new C44398Hbe(LIZIZ);
                    c44398Hbe.LIZIZ = playAddr.getUrlKey();
                    c44398Hbe.LJ = playAddr.getSize();
                    if (bitRate2.isBytevc1() == 1) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    c44398Hbe.LIZJ = i;
                    C44386HbS c44386HbS = new C44386HbS(c44398Hbe);
                    c44386HbS.LIZ = bitRate2.getBitRate();
                    c44386HbS.LIZJ = bitRate2.getQualityType();
                    c44386HbS.LIZIZ = bitRate2.getGearName();
                    c44398Hbe.LJFF = c44386HbS;
                    c44398Hbe.LIZ();
                }
            }
        }
        Video video = aweme.getVideo();
        if (video != null) {
            LIZIZ.getClass();
            C44390HbW c44390HbW = new C44390HbW(LIZIZ);
            c44390HbW.LIZ = video.getVideoModelStr();
            LIZIZ.LIZLLL = c44390HbW;
        }
        C44412Hbs LIZ2 = LIZIZ.LIZ();
        C44421Hc1 c44421Hc12 = LIZ2.LIZ;
        c44421Hc12.LJ = LIZ2;
        return new C44388HbU(c44421Hc12).LIZ();
    }

    public static C44421Hc1 LIZIZ(C44421Hc1 c44421Hc1, VideoUrlModel videoUrlModel) {
        if (videoUrlModel == null) {
            return c44421Hc1;
        }
        c44421Hc1.getClass();
        C44398Hbe c44398Hbe = new C44398Hbe(c44421Hc1);
        c44398Hbe.LIZIZ = videoUrlModel.getUrlKey();
        c44398Hbe.LIZJ = videoUrlModel.isBytevc1() ? 1 : 0;
        c44398Hbe.LIZLLL = videoUrlModel.getUrlList();
        c44398Hbe.LJ = videoUrlModel.getSize();
        C44421Hc1 LIZ2 = c44398Hbe.LIZ();
        o.LJIIIIZZ(LIZ2, "createPlayItem()\n       …          .addToBuilder()");
        return LIZ2;
    }

    public static void LJ(RecyclerView recyclerView, AbstractC030309z abstractC030309z) {
        if (recyclerView.getItemDecorationCount() <= 0) {
            recyclerView.LJII(abstractC030309z, -1);
        } else {
            recyclerView.LJJJJZI();
        }
    }

    public static final void LIZ(LinearLayoutManager linearLayoutManager, List<Boolean> list, InterfaceC88471Ynr<? super Integer, ? super Boolean, C76800UCe> interfaceC88471Ynr) {
        boolean z;
        int LLIL = linearLayoutManager.LLIL();
        int LLILLIZIL = linearLayoutManager.LLILLIZIL();
        if (LLILLIZIL >= list.size()) {
            int size = (LLILLIZIL - list.size()) + 1;
            boolean[] zArr = new boolean[size];
            for (int i = 0; i < size; i++) {
                zArr[i] = false;
            }
            list.addAll(ORY.LJL(zArr));
        }
        C40517FvF c40517FvF = new C40517FvF(LLIL, LLILLIZIL);
        int i2 = 0;
        for (Boolean bool : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                boolean booleanValue = bool.booleanValue();
                int i4 = c40517FvF.LJLIL;
                if (i2 <= c40517FvF.LJLILLLLZI && i4 <= i2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!booleanValue) {
                    if (z) {
                        interfaceC88471Ynr.invoke(Integer.valueOf(i2), Boolean.TRUE);
                    }
                } else if (!z) {
                    interfaceC88471Ynr.invoke(Integer.valueOf(i2), Boolean.FALSE);
                }
                ListProtector.set(list, i2, Boolean.valueOf(z));
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }
}
