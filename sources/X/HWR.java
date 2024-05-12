package X;

import Y.ARunnableS43S0100000_7;
import Y.AfS59S0100000_7;
import Y.IDgS348S0100000_7;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.AddYoursAvatarHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public final class HWR {
    public static final /* synthetic */ int LJIILIIL = 0;
    public final ActivityC45651qj LIZ;
    public final Aweme LIZIZ;
    public final AddYourRecordParam LIZJ;
    public C84913XUf LIZLLL;
    public final MusicModel LJ;
    public final AddYoursAvatarHelper LJFF;
    public HWH LJI;
    public long LJII;
    public final String LJIIIIZZ;
    public final int LJIIIZ;
    public boolean LJIIJ;
    public final HWS LJIIJJI;
    public boolean LJIIL;

    public final void LIZIZ() {
        Long LJJIZ;
        String topicId = this.LIZJ.getTopicId();
        if (topicId != null && (LJJIZ = C38350F3i.LJJIZ(topicId)) != null) {
            long longValue = LJJIZ.longValue();
            if (longValue == 0 || !((RBX) HG3.LJIILL()).isLogin()) {
                return;
            }
            this.LJIIL = true;
            new SafeHandler(this.LIZ).post(new ARunnableS43S0100000_7(this, 147));
            AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7(this, 419);
            ((AddYoursAvatarHelper.Api) AddYoursAvatarHelper.LIZIZ.getValue()).getTopics(longValue).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS59S0100000_7(aqS173S0100000_7, 86), new AfS59S0100000_7(aqS173S0100000_7, 87));
        }
    }

    public final void LIZJ() {
        C84913XUf c84913XUf;
        if (this.LIZIZ == null || this.LJ == null || !((RBX) HG3.LJIILL()).isLogin() || (c84913XUf = this.LIZLLL) == null) {
            return;
        }
        c84913XUf.LIZJ(this.LJ, this.LJIIIIZZ, true, false, this.LJIIIZ, false, false);
    }

    public final void LIZLLL() {
        Long topicId;
        MusicModel musicModel;
        List<AddYoursAvatar> userAvatars;
        List<AddYoursAvatar> list;
        List<AddYoursAvatar> userAvatars2;
        String text;
        AddYoursStickerStruct addYoursStickerStruct;
        String str;
        String text2;
        AddYoursStickerStruct addYoursStickerStruct2;
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            J9P.LIZIZ(this.LIZ, "add_yours", "add_yours", null, new IDgS348S0100000_7(this, 1));
            return;
        }
        this.LJII = System.currentTimeMillis();
        if (this.LIZJ.isFollowAY()) {
            User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
            AddYourRecordParam addYourRecordParam = this.LIZJ;
            AddYoursStickerStruct addYoursStickerStruct3 = addYourRecordParam.getAddYoursStickerStruct();
            if (addYoursStickerStruct3 != null && (addYoursStickerStruct2 = AddYoursStickerStruct.copy$default(addYoursStickerStruct3, null, null, null, null, null, null, null, null, null, 0L, 1023, null)) != null) {
                List<AddYoursAvatar> userAvatars3 = addYoursStickerStruct2.getUserAvatars();
                if (userAvatars3 != null) {
                    List LLJILJILJ = ORZ.LLJILJILJ(userAvatars3);
                    Iterator it = ((ArrayList) LLJILJILJ).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (o.LJ(String.valueOf(((AddYoursAvatar) it.next()).getUid()), currentUser.getUid())) {
                                break;
                            }
                        } else {
                            String uid = currentUser.getUid();
                            o.LJIIIIZZ(uid, "curUser.uid");
                            ListProtector.add(LLJILJILJ, 0, new AddYoursAvatar(Long.valueOf(CastLongProtector.parseLong(uid)), currentUser.getAvatarThumb(), currentUser.getNickname()));
                            ORZ.LLILLL(LLJILJILJ, 3);
                            break;
                        }
                    }
                }
            } else {
                addYoursStickerStruct2 = null;
            }
            addYourRecordParam.setAddYoursStickerStruct(addYoursStickerStruct2);
        }
        AddYoursStickerStruct addYoursStickerStruct4 = this.LIZJ.getAddYoursStickerStruct();
        if (addYoursStickerStruct4 != null && (text = addYoursStickerStruct4.getText()) != null && text.length() > 40 && (addYoursStickerStruct = this.LIZJ.getAddYoursStickerStruct()) != null) {
            AddYoursStickerStruct addYoursStickerStruct5 = this.LIZJ.getAddYoursStickerStruct();
            if (addYoursStickerStruct5 != null && (text2 = addYoursStickerStruct5.getText()) != null) {
                C40517FvF c40517FvF = new C40517FvF(0, 40);
                if (c40517FvF.isEmpty()) {
                    str = "";
                } else {
                    str = s.LJLL(text2, c40517FvF);
                }
            } else {
                str = null;
            }
            addYoursStickerStruct.setText(str);
        }
        AddYoursStickerStruct addYoursStickerStruct6 = this.LIZJ.getAddYoursStickerStruct();
        if (addYoursStickerStruct6 == null || (userAvatars = addYoursStickerStruct6.getUserAvatars()) == null || userAvatars.isEmpty()) {
            AddYoursStickerStruct addYoursStickerStruct7 = this.LIZJ.getAddYoursStickerStruct();
            if (addYoursStickerStruct7 != null && (topicId = addYoursStickerStruct7.getTopicId()) != null) {
                long longValue = topicId.longValue();
                this.LJFF.getClass();
                AddYoursAvatarHelper.LIZLLL = null;
                java.util.Map<Long, List<AddYoursAvatar>> map = AddYoursAvatarHelper.LIZJ;
                if (map.containsKey(Long.valueOf(longValue))) {
                    AddYoursAvatarHelper.LIZLLL = (List) ((LinkedHashMap) map).get(Long.valueOf(longValue));
                } else {
                    ((AddYoursAvatarHelper.Api) AddYoursAvatarHelper.LIZIZ.getValue()).getTopics(longValue).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new HWU(longValue));
                }
            }
        } else {
            AddYoursStickerStruct addYoursStickerStruct8 = this.LIZJ.getAddYoursStickerStruct();
            if (addYoursStickerStruct8 != null) {
                AddYoursStickerStruct addYoursStickerStruct9 = this.LIZJ.getAddYoursStickerStruct();
                if (addYoursStickerStruct9 != null && (userAvatars2 = addYoursStickerStruct9.getUserAvatars()) != null) {
                    list = C44729Hgz.LJJIJIIJI(userAvatars2);
                } else {
                    list = null;
                }
                addYoursStickerStruct8.setUserAvatars(list);
            }
        }
        if (this.LIZIZ == null || (musicModel = this.LJ) == null) {
            C223978qf.LIZ(this.LIZJ, true, System.currentTimeMillis() - this.LJII, "", "");
            LJ(null, null);
        } else {
            C84913XUf c84913XUf = this.LIZLLL;
            if (c84913XUf != null) {
                c84913XUf.LIZLLL(musicModel, this.LJIIIIZZ, false, this.LJIIIZ, false, false);
            }
        }
    }

    public static ArrayList LIZ(String str) {
        List list;
        if (str != null) {
            if (str.length() != 0) {
                ArrayList arrayList = new ArrayList();
                List<String> split = new OJD(",").split(str, 0);
                if (!split.isEmpty()) {
                    ListIterator<String> listIterator = split.listIterator(split.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            list = ORZ.LLILLL(split, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                list = C61878OQg.INSTANCE;
                for (String str2 : (String[]) list.toArray(new String[0])) {
                    if (!arrayList.contains(str2)) {
                        arrayList.add(str2);
                    }
                }
                return arrayList;
            }
        }
        return new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
    public final void LJ(MusicModel musicModel, String str) {
        T t;
        C68322mC c68322mC = new C68322mC();
        C84913XUf c84913XUf = this.LIZLLL;
        if (c84913XUf != null) {
            t = c84913XUf.LJI;
        } else {
            t = 0;
        }
        c68322mC.element = t;
        if (musicModel == null) {
            c68322mC.element = null;
        }
        C68322mC c68322mC2 = new C68322mC();
        c68322mC2.element = "";
        if (TextUtils.isEmpty("")) {
            c68322mC2.element = AnonymousClass629.LIZ("randomUUID().toString()");
        }
        AVExternalServiceImpl.LIZ().asyncService("AddYoursRecord", new HS3(c68322mC2, this, c68322mC, musicModel, str));
    }

    public HWR(ActivityC45651qj activity, Aweme aweme, AddYourRecordParam params) {
        MusicModel musicModel;
        String str;
        Music music;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(params, "params");
        this.LIZ = activity;
        this.LIZIZ = aweme;
        this.LIZJ = params;
        if (aweme == null || (music = aweme.getMusic()) == null || CommerceMediaServiceImpl.LIZJ().LJIILLIIL(music)) {
            musicModel = null;
        } else {
            musicModel = music.convertToMusicModel();
        }
        this.LJ = musicModel;
        String stickerIDs = aweme != null ? aweme.getStickerIDs() : null;
        this.LJFF = AddYoursAvatarHelper.LIZ;
        int i = 0;
        if (!TextUtils.isEmpty(stickerIDs)) {
            ArrayList LIZ = LIZ(stickerIDs);
            if (!LIZ.isEmpty()) {
                str = (String) ListProtector.get(LIZ, 0);
                this.LJIIIIZZ = str;
                if (aweme != null && aweme.getVideo() != null) {
                    i = aweme.getVideo().getVideoLength();
                }
                this.LJIIIZ = i;
                this.LJIIJJI = new HWS(this);
            }
        }
        str = "";
        this.LJIIIIZZ = str;
        if (aweme != null) {
            i = aweme.getVideo().getVideoLength();
        }
        this.LJIIIZ = i;
        this.LJIIJJI = new HWS(this);
    }
}
