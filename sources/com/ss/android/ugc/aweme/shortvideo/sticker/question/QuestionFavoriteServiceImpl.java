package com.ss.android.ugc.aweme.shortvideo.sticker.question;

import X.ORZ;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.question.IQuestionFavoriteService;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class QuestionFavoriteServiceImpl implements IQuestionFavoriteService, WeakHandler.IHandler {
    public final int LJLIL = 64;
    public final Map<String, Integer> LJLILLLLZI = new LinkedHashMap();

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    @Override // com.ss.android.ugc.aweme.question.IQuestionFavoriteService
    public final void LIZ(int i, String str) {
        if (str.length() == 0) {
            return;
        }
        synchronized (this.LJLILLLLZI) {
            if (this.LJLILLLLZI.size() >= this.LJLIL) {
                ((LinkedHashMap) this.LJLILLLLZI).entrySet().remove((Map.Entry) ORZ.LJLLILLLL(((LinkedHashMap) this.LJLILLLLZI).entrySet()));
            }
            this.LJLILLLLZI.put(str, Integer.valueOf(i));
        }
    }
}
