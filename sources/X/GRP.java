package X;

import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;

/* loaded from: classes8.dex */
public final class GRP implements InterfaceC65644PpY<AVTextExtraStruct, TextExtraStruct> {
    @Override // X.InterfaceC65644PpY
    public final TextExtraStruct apply(AVTextExtraStruct aVTextExtraStruct) {
        AVTextExtraStruct aVTextExtraStruct2 = aVTextExtraStruct;
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        textExtraStruct.setCid(aVTextExtraStruct2.cid);
        textExtraStruct.setHashTagName(aVTextExtraStruct2.hashTagName);
        textExtraStruct.setUserId(aVTextExtraStruct2.userId);
        textExtraStruct.setAtUserType(aVTextExtraStruct2.atUserType);
        textExtraStruct.setType(aVTextExtraStruct2.type);
        textExtraStruct.setStart(aVTextExtraStruct2.start);
        textExtraStruct.setEnd(aVTextExtraStruct2.end);
        textExtraStruct.setAwemeId(aVTextExtraStruct2.awemeId);
        textExtraStruct.setSubType(aVTextExtraStruct2.subType);
        textExtraStruct.setSecUid(aVTextExtraStruct2.getSecUid());
        if (aVTextExtraStruct2.start < 0 || aVTextExtraStruct2.end < 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TextExtraStruct#getStart && TextExtraStruct#getEnd must be >= 0, actual: ");
            LIZ.append(aVTextExtraStruct2);
            H78.LIZ(X1D.LIZIZ(LIZ));
        }
        return textExtraStruct;
    }
}
