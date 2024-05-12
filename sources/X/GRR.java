package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;

/* loaded from: classes8.dex */
public final class GRR implements InterfaceC65644PpY<TextExtraStruct, AVTextExtraStruct> {
    @Override // X.InterfaceC65644PpY
    public final AVTextExtraStruct apply(TextExtraStruct textExtraStruct) {
        TextExtraStruct textExtraStruct2 = textExtraStruct;
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.cid = textExtraStruct2.getCid();
        aVTextExtraStruct.hashTagName = textExtraStruct2.getHashTagName();
        aVTextExtraStruct.userId = textExtraStruct2.getUserId();
        aVTextExtraStruct.atUserType = textExtraStruct2.getAtUserType();
        aVTextExtraStruct.type = textExtraStruct2.getType();
        aVTextExtraStruct.start = textExtraStruct2.getStart();
        aVTextExtraStruct.end = textExtraStruct2.getEnd();
        aVTextExtraStruct.awemeId = textExtraStruct2.getAwemeId();
        aVTextExtraStruct.subType = textExtraStruct2.getSubtype();
        aVTextExtraStruct.setSecUid(textExtraStruct2.getSecUid());
        return aVTextExtraStruct;
    }
}
