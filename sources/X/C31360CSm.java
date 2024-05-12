package X;

import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationRequest;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationResponse;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.LiveIntroMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CSm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31360CSm extends AbstractC31361CSn<CRD> {
    public final C31362CSo LJIILIIL;
    public final CTY LJIILJJIL;

    @Override // X.AbstractC31361CSn
    public final MGetTranslationRequest.Text LIZJ(CRD crd) {
        CRD t = crd;
        o.LJIIIZ(t, "t");
        if (t instanceof CQJ) {
            this.LJIILIIL.getClass();
            return C31362CSo.LLLLZ((CQJ) t);
        }
        if (t instanceof C31273CPd) {
            CQO cqo = (CQO) t;
            this.LJIILJJIL.getClass();
            MGetTranslationRequest.Text text = new MGetTranslationRequest.Text();
            text.text = String.valueOf(((LiveIntroMessage) cqo.LJIJJLI).content);
            CommonMessageData commonMessageData = cqo.LJIJJLI.baseMessage;
            if (commonMessageData != null) {
                text.msgId = commonMessageData.messageId;
                text.roomMessageHeatLevel = commonMessageData.roomMessageHeatLevel;
            }
            text.textSource = 1;
            return text;
        }
        return null;
    }

    @Override // X.AbstractC31361CSn
    /* renamed from: LJI, reason: merged with bridge method [inline-methods] */
    public final boolean LIZ(CRD model) {
        o.LJIIIZ(model, "model");
        boolean LJII = LJII(model);
        if (super.LIZ(model) && LJII) {
            return true;
        }
        return false;
    }

    public final boolean LJII(CRD model) {
        o.LJIIIZ(model, "model");
        if ((model instanceof CQJ) && !model.LJIIIZ() && !(model instanceof CQM)) {
            if (this.LJIIIIZZ) {
                return true;
            }
            CQO cqo = (CQO) model;
            String str = ((ChatMessage) cqo.LJIJJLI).contentLanguage;
            o.LJIIIIZZ(str, "this.message.contentLanguage");
            if (str.length() > 0 && !o.LJ(((ChatMessage) cqo.LJIJJLI).contentLanguage, "un") && !o.LJ(((ChatMessage) cqo.LJIJJLI).contentLanguage, this.LJIIL)) {
                return true;
            }
        }
        if (!this.LJFF && (model instanceof C31273CPd)) {
            if (this.LJIIIIZZ) {
                return true;
            }
            CQO cqo2 = (CQO) model;
            if (((LiveIntroMessage) cqo2.LJIJJLI).contentLanguage.length() > 0 && !o.LJ(((LiveIntroMessage) cqo2.LJIJJLI).contentLanguage, "un") && !o.LJ(((LiveIntroMessage) cqo2.LJIJJLI).contentLanguage, this.LJIIL)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC31361CSn
    public final List LIZIZ(List list, java.util.Map map) {
        o.LJIIIZ(map, "map");
        o.LJIIIZ(list, "list");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CRD crd = (CRD) it.next();
            if (crd instanceof CQJ) {
                this.LJIILIIL.getClass();
                C31362CSo.LLLLZIL(map, (CQJ) crd);
            } else if (crd instanceof C31273CPd) {
                C31273CPd m = (C31273CPd) crd;
                this.LJIILJJIL.getClass();
                o.LJIIIZ(m, "m");
                MGetTranslationResponse.Data.Translation translation = (MGetTranslationResponse.Data.Translation) map.get(((LiveIntroMessage) m.LJIJJLI).content);
                if (translation != null && translation.translated) {
                    m.LJJIIZI = true;
                    m.LJJIJ = translation.translation;
                    m.LJJIJIL = translation.emotesIndexMap;
                }
            }
        }
        return list;
    }

    public C31360CSm(LifecycleOwner lifecycleOwner, long j, long j2, String str, boolean z, Looper looper) {
        super(lifecycleOwner, j, j2, str, true, z, looper);
        this.LJIILIIL = new C31362CSo();
        this.LJIILJJIL = new CTY();
    }
}
