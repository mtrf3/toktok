package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.bytedance.android.livesdkapi.depend.model.live.debug.Answer;
import com.bytedance.android.livesdkapi.depend.model.live.debug.Question;
import java.util.HashSet;

/* renamed from: X.BOg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28702BOg implements TextWatcher {
    public final /* synthetic */ C28704BOi LJLIL;
    public final /* synthetic */ Question LJLILLLLZI;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        long j;
        if (editable != null) {
            C28704BOi c28704BOi = this.LJLIL;
            Question question = this.LJLILLLLZI;
            String obj = editable.toString();
            if (TextUtils.isEmpty(obj)) {
                obj = "";
            }
            if (question != null) {
                j = question.getQuestionId();
            } else {
                j = 0;
            }
            Answer answer = c28704BOi.LJLJI.LJLJJI.get(Long.valueOf(j));
            if (answer != null) {
                HashSet<String> answers = answer.getAnswers();
                if (answers != null) {
                    answers.clear();
                }
            } else {
                answer = new Answer(j, new HashSet());
            }
            answer.getAnswers().add(obj);
            c28704BOi.LJLJI.LJLJJI.put(Long.valueOf(j), answer);
            InterfaceC28707BOl interfaceC28707BOl = c28704BOi.LJLJI.LJLJJL;
            if (interfaceC28707BOl != null) {
                interfaceC28707BOl.eg();
            }
        }
    }

    public C28702BOg(C28704BOi c28704BOi, Question question) {
        this.LJLIL = c28704BOi;
        this.LJLILLLLZI = question;
    }
}
