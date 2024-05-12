package Y;

import X.AI8;
import X.C00F;
import X.C43021GuX;
import X.C43023GuZ;
import X.C43026Guc;
import X.C43045Guv;
import X.C43882HKc;
import X.C6BK;
import X.C76800UCe;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS62S1200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AfS17S1200000_7 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS17S1200000_7 afS17S1200000_7, Object obj) {
        int intValue;
        int i;
        Integer num;
        SuggestMusicList suggestMusicList = (SuggestMusicList) obj;
        if (suggestMusicList != null) {
            List<MusicModel> list = suggestMusicList.musicList;
            o.LJIIIIZZ(list, "result.musicList");
            for (MusicModel musicModel : list) {
                musicModel.setLogPb(suggestMusicList.logPb);
                musicModel.setComeFromForMod(1);
            }
            ((C43021GuX) afS17S1200000_7.l1).LIZLLL = suggestMusicList.musicList;
            Integer num2 = suggestMusicList.musicType;
            if (num2 == null) {
                intValue = 3;
            } else {
                intValue = num2.intValue();
            }
            List<? extends MusicModel> list2 = ((C43021GuX) afS17S1200000_7.l1).LIZLLL;
            long currentTimeMillis = System.currentTimeMillis() - ((C43021GuX) afS17S1200000_7.l1).LJFF;
            if (intValue == 2) {
                i = 2;
            } else {
                i = 3;
            }
            int i2 = suggestMusicList.cursor;
            boolean z = suggestMusicList.hasMore;
            String str = afS17S1200000_7.s0;
            if (str == null) {
                str = "";
            }
            C43023GuZ c43023GuZ = new C43023GuZ(z, i, i2, str, currentTimeMillis, list2, false, 64);
            ((C43021GuX) afS17S1200000_7.l1).LJIIIIZZ.onNext(c43023GuZ);
            ((C43021GuX) afS17S1200000_7.l1).LJ.onNext(c43023GuZ);
            ((C43021GuX) afS17S1200000_7.l1).LJIIIZ.onNext(Boolean.TRUE);
            Integer valueOf = Integer.valueOf((int) c43023GuZ.LIZIZ);
            List list3 = (List) afS17S1200000_7.l2;
            if (list3 != null) {
                num = Integer.valueOf(list3.size());
            } else {
                num = null;
            }
            Integer num3 = suggestMusicList.musicType;
            C6BK c6bk = new C6BK();
            c6bk.LIZ.put("time_cost_ms", valueOf);
            if (num != null) {
                num.intValue();
                c6bk.LIZIZ(num, "photo_to_video_assets_count");
            }
            if (num3 != null) {
                num3.intValue();
                c6bk.LIZIZ(num3, "music_type");
            }
            C43882HKc.LIZLLL(0, "ies_ai_recommend_request_monitor", c6bk.LJ(), true);
            ((C43021GuX) afS17S1200000_7.l1).getClass();
            if (C00F.LIZ(31744, 0, "creative_tools_ai_music_disk_cache_optimize", true) == 1 || C43026Guc.LIZ()) {
                C43045Guv.LIZIZ(new AqS157S0100000_7(c43023GuZ, 23));
                return;
            }
            return;
        }
        if (C43026Guc.LIZ()) {
            ((C43021GuX) afS17S1200000_7.l1).getClass();
            if (!NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).isWeakNetwork()) {
                C43021GuX c43021GuX = (C43021GuX) afS17S1200000_7.l1;
                List list4 = (List) afS17S1200000_7.l2;
                c43021GuX.getClass();
                C43045Guv.LIZIZ(new AqS62S1200000_7(c43021GuX, "Result is null", list4, 0));
                return;
            }
        }
        C43021GuX.LIZIZ((C43021GuX) afS17S1200000_7.l1, (List) afS17S1200000_7.l2, "Result is null", false, 2);
    }

    public static final void accept$1(AfS17S1200000_7 afS17S1200000_7, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (o.LJ(((ImageView) afS17S1200000_7.l1).getTag(), afS17S1200000_7.s0) && bitmap != null) {
            ((ImageView) afS17S1200000_7.l1).setImageBitmap(bitmap);
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS17S1200000_7.l2;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(bitmap);
                return;
            }
            return;
        }
        InterfaceC88472Yns interfaceC88472Yns2 = (InterfaceC88472Yns) afS17S1200000_7.l2;
        if (interfaceC88472Yns2 == null) {
            return;
        }
        interfaceC88472Yns2.invoke(null);
    }

    public static final void accept$2(AfS17S1200000_7 afS17S1200000_7, Object obj) {
        KidsDiskClearActivity kidsDiskClearActivity = (KidsDiskClearActivity) afS17S1200000_7.l1;
        AI8 ai8 = (AI8) afS17S1200000_7.l2;
        ai8.setTitle(kidsDiskClearActivity.LLFII(afS17S1200000_7.s0));
        ai8.setLoading(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS17S1200000_7(Object obj, ImageView imageView, String str, InterfaceC88472Yns<? super Bitmap, C76800UCe> interfaceC88472Yns) {
        this.$t = interfaceC88472Yns;
        this.l1 = obj;
        this.s0 = imageView;
        this.l2 = str;
    }
}
