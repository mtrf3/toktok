package com.ss.android.ugc.aweme.challenge.presenter;

import X.C62377Odx;
import X.HG3;
import X.InterfaceC62383Oe3;
import X.InterfaceC62486Ofi;
import X.RBX;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.ss.android.ugc.aweme.services.function.IFunctionKey;
import com.ss.android.ugc.aweme.share.ShareExtServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class ChallengeSheetActionProtocol extends TTSheetActionProtocol {
    @Override // com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol, com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
    public final InterfaceC62383Oe3 s1() {
        return new C62377Odx();
    }

    public ChallengeSheetActionProtocol(BaseSharePackage baseSharePackage) {
        super(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol, com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
    public final List<InterfaceC62486Ofi> r(BaseSharePackage baseSharePackage) {
        Serializable serializable;
        Challenge challenge;
        ShareModel shareModel = baseSharePackage.shareModel;
        String str = null;
        if (shareModel != null) {
            serializable = shareModel.customModel;
        } else {
            serializable = null;
        }
        if (!(serializable instanceof Challenge) || (challenge = (Challenge) serializable) == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        ChallengeSharePackageV2.Companion.getClass();
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        User author = challenge.getAuthor();
        if (author != null) {
            str = author.getUid();
        }
        if (TextUtils.isEmpty(curUserId) || TextUtils.isEmpty(str) || !TextUtils.equals(curUserId, str)) {
            arrayList.add(ShareExtServiceImpl.LJJLIIJ().LJJIIJ(challenge));
        }
        if (!FunctionSupportService.INSTANCE.notSupport(IFunctionKey.QR_CODE)) {
            arrayList.add(ShareExtServiceImpl.LJJLIIJ().LJJIZ(challenge, baseSharePackage.extras.getBoolean("isHashtag"), baseSharePackage.extras.getString("challengeId"), baseSharePackage.extras.getString("requestId"), baseSharePackage.extras.getString("processId")));
        }
        return arrayList;
    }
}
