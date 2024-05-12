package com.bytedance.android.livesdk.qa;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.Question;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class QuestionEx extends F9E {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public long LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;

    @InterfaceC65349Pkn("like_cnt")
    public long likeCount;

    @InterfaceC65349Pkn("question")
    public Question question;

    @InterfaceC65349Pkn("self_like_status")
    public int selfLikeStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public QuestionEx() {
        /*
            r14 = this;
            r1 = 0
            r2 = 0
            r4 = 0
            r12 = 511(0x1ff, float:7.16E-43)
            r0 = r14
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r2
            r10 = r4
            r11 = r4
            r13 = r1
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.qa.QuestionEx.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.question, Long.valueOf(this.likeCount), Integer.valueOf(this.selfLikeStatus), Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), Long.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL)};
    }

    public QuestionEx(Question question, long j, int i, boolean z, boolean z2, boolean z3, long j2, int i2, int i3) {
        o.LJIIIZ(question, "question");
        this.question = question;
        this.likeCount = j;
        this.selfLikeStatus = i;
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = z3;
        this.LJLJJI = j2;
        this.LJLJJL = i2;
        this.LJLJJLL = i3;
    }

    public /* synthetic */ QuestionEx(Question question, long j, int i, boolean z, boolean z2, boolean z3, long j2, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new Question() : question, (i4 & 2) != 0 ? 0L : j, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? false : z3, (i4 & 64) == 0 ? j2 : 0L, (i4 & 128) != 0 ? 0 : i2, (i4 & 256) == 0 ? i3 : 0);
    }
}
