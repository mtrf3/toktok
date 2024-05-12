package com.ss.android.ugc.aweme.music.presenter;

import X.C16880lQ;
import X.C188727au;
import X.C78685UuP;
import X.FMX;
import X.HG3;
import X.InterfaceC62486Ofi;
import X.RBX;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.share.ShareExtServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MusicSheetActionProtocol extends TTSheetActionProtocol {
    public MusicSheetActionProtocol(BaseSharePackage baseSharePackage) {
        super(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol, com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
    public final List<InterfaceC62486Ofi> r(BaseSharePackage baseSharePackage) {
        Object obj;
        ShareModel shareModel = baseSharePackage.shareModel;
        Music music = null;
        if (shareModel != null) {
            obj = shareModel.customModel;
        } else {
            obj = null;
        }
        if (obj instanceof Music) {
            music = (Music) obj;
        }
        Object LLJJIII = C16880lQ.LLJJIII(baseSharePackage.extras, "enter_from");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        ArrayList arrayList = new ArrayList();
        if (music != null) {
            String ownerId = music.getOwnerId();
            if (ownerId != null && C78685UuP.LJJJZ(ownerId) && !o.LJ(music.getOwnerId(), curUserId)) {
                arrayList.add(ShareExtServiceImpl.LJJLIIJ().LJJJLL(music));
            }
            if (SmartRouter.canOpen("//qrcodev2")) {
                arrayList.add(ShareExtServiceImpl.LJJLIIJ().LJJJLZIJ(music));
            }
            if (music.isOriginalSound() && !music.isPgc() && C78685UuP.LJJJZ(music.getOwnerId()) && o.LJ(music.getOwnerId(), curUserId)) {
                arrayList.add(ShareExtServiceImpl.LJJLIIJ().LJJJ(music));
                C188727au c188727au = new C188727au();
                c188727au.LJFF(LLJJIII, "enter_from");
                c188727au.LJIIIZ("song_id", music.getMid());
                FMX.LJIIL("show_remove_original_sound", c188727au.LIZ);
            }
        }
        return arrayList;
    }
}
