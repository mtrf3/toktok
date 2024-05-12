package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.sdk.chat.experiment.SuggestedReplyExperiment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data.ISuggestedReplyApi;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data.SuggestedReply;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data.SuggestedReplyApi;
import defpackage.i0;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4GA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4GA implements InterfaceC1039246a {
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C4GN.LJLIL);
    public final ISuggestedReplyApi LIZ;
    public final Keva LIZIZ;

    public C4GA() {
        this(0);
    }

    @Override // X.InterfaceC1039246a
    public final void LIZLLL() {
        this.LIZIZ.erase(C46U.LJIILIIL("valid_show_timestamp"));
        this.LIZIZ.erase(C46U.LJIILIIL("last_consecutive_watched"));
    }

    public final void LJII() {
        int i = this.LIZIZ.getInt(C46U.LJIILIIL("last_consecutive_watched"), 0);
        int min = Math.min(SuggestedReplyExperiment.LIZ().getPhaseTwoShowCount(), i + 1);
        if (i < SuggestedReplyExperiment.LIZ().getPhaseTwoShowCount()) {
            this.LIZIZ.storeInt(C46U.LJIILIIL("last_consecutive_watched"), min);
        }
        if (min == SuggestedReplyExperiment.LIZ().getPhaseOneShowCount()) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(5, SuggestedReplyExperiment.LIZ().getPhaseOneHideDays());
            this.LIZIZ.storeLong(C46U.LJIILIIL("valid_show_timestamp"), C46U.LJIIIZ(calendar));
            return;
        }
        if (min == SuggestedReplyExperiment.LIZ().getPhaseTwoShowCount()) {
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(5, SuggestedReplyExperiment.LIZ().getPhaseTwoHideDays());
            this.LIZIZ.storeLong(C46U.LJIILIIL("valid_show_timestamp"), C46U.LJIIIZ(calendar2));
        }
    }

    public C4GA(int i) {
        Keva keva;
        SuggestedReplyApi api = SuggestedReplyApi.LIZIZ;
        synchronized (C4GO.LIZ) {
            keva = C4GO.LIZIZ;
            if (keva == null) {
                keva = Keva.getRepo("suggested_reply_repo");
                C4GO.LIZIZ = keva;
                o.LJIIIIZZ(keva, "getRepo(KEVA_REPO).also { keva = it }");
            }
        }
        o.LJIIIZ(api, "api");
        this.LIZ = api;
        this.LIZIZ = keva;
    }

    @Override // X.InterfaceC1039246a
    public final void LIZ(C109544Rq c109544Rq) {
        if (c109544Rq != null) {
            c109544Rq.clearLocalExt("SUGGESTED_REPLIES");
            C106674Gp.LJIILJJIL(c109544Rq);
        }
    }

    @Override // X.InterfaceC1039246a
    public final void LIZIZ(C109544Rq c109544Rq) {
        if (c109544Rq != null) {
            String conversationId = c109544Rq.getConversationId();
            o.LJIIIIZZ(conversationId, "msg.conversationId");
            this.LIZIZ.storeString(i0.LJFF(conversationId, "_action_bar"), String.valueOf(c109544Rq.getMsgId()));
        }
    }

    @Override // X.InterfaceC1039246a
    public final C109544Rq LJ(String str) {
        String string = this.LIZIZ.getString(i0.LJFF(str, "_action_bar"), null);
        if (string == null) {
            return null;
        }
        return C106674Gp.LJIIIIZZ(string);
    }

    @Override // X.InterfaceC1039246a
    public final void LJFF(String str) {
        java.util.Set<String> stringSet = this.LIZIZ.getStringSet("IS_DISPLAYED_LEARN_MORE_NOTICE", new LinkedHashSet());
        stringSet.add(str);
        this.LIZIZ.storeStringSet("IS_DISPLAYED_LEARN_MORE_NOTICE", stringSet);
    }

    @Override // X.InterfaceC1039246a
    public final Object LIZJ(C109544Rq c109544Rq, InterfaceC67352kd<? super C4GE<List<SuggestedReply>>> interfaceC67352kd) {
        List<SuggestedReply> LIZIZ;
        if (System.currentTimeMillis() <= this.LIZIZ.getLong(C46U.LJIILIIL("valid_show_timestamp"), 0L)) {
            return new C4GD(0);
        }
        if (C46U.LJI(c109544Rq)) {
            return new C4GD(0);
        }
        if (o.LJ(c109544Rq.getLocalExtValue("IS_FETCHED"), "1")) {
            String localExtValue = c109544Rq.getLocalExtValue("SUGGESTED_REPLIES");
            if (localExtValue == null || (LIZIZ = C46U.LIZIZ(localExtValue)) == null || LIZIZ.isEmpty()) {
                return new C4GD(0);
            }
            return new C4GC(LIZIZ);
        }
        return LJI(c109544Rq, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.C109544Rq r13, X.InterfaceC67352kd<? super X.C4GE<java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data.SuggestedReply>>> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C4GB
            if (r0 == 0) goto L23
            r11 = r14
            X.4GB r11 = (X.C4GB) r11
            int r2 = r11.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r11.LJLJJL = r2
        L12:
            java.lang.Object r4 = r11.LJLJI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLJJL
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            X.4Rq r13 = r11.LJLILLLLZI
            X.4GA r6 = r11.LJLIL
            goto L8e
        L23:
            X.4GB r11 = new X.4GB
            r11.<init>(r12, r14)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C141335gf.LIZJ(r4)
            int r4 = r13.getMsgType()     // Catch: java.lang.Exception -> Lc1
            r0 = 1809(0x711, float:2.535E-42)
            if (r4 != r0) goto L4b
            com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r0 = X.C1DJ.LJIILL(r13)     // Catch: java.lang.Exception -> Lc1
            com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate r0 = (com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate) r0     // Catch: java.lang.Exception -> Lc1
            if (r0 == 0) goto Lbb
            com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent r0 = r0.baseVideoComponent     // Catch: java.lang.Exception -> Lc1
            if (r0 == 0) goto Lbb
            java.lang.String r0 = r0.id     // Catch: java.lang.Exception -> Lc1
            goto L60
        L4b:
            X.4Tx r0 = X.EnumC110124Tw.Companion     // Catch: java.lang.Exception -> Lc1
            r0.getClass()     // Catch: java.lang.Exception -> Lc1
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent r4 = X.C110134Tx.LIZJ(r13)     // Catch: java.lang.Exception -> Lc1
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent     // Catch: java.lang.Exception -> Lc1
            if (r0 == 0) goto Lbb
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent r4 = (com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent) r4     // Catch: java.lang.Exception -> Lc1
            if (r4 == 0) goto Lbb
            java.lang.String r0 = r4.getItemId()     // Catch: java.lang.Exception -> Lc1
        L60:
            if (r0 == 0) goto Lbb
            java.lang.Long r0 = X.C38350F3i.LJJIZ(r0)     // Catch: java.lang.Exception -> Lc1
            if (r0 == 0) goto Lbb
            long r9 = r0.longValue()     // Catch: java.lang.Exception -> Lc1
            com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data.ISuggestedReplyApi r4 = r12.LIZ     // Catch: java.lang.Exception -> Lc1
            java.lang.String r5 = r13.getConversationId()     // Catch: java.lang.Exception -> Lc1
            java.lang.String r0 = "msg.conversationId"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)     // Catch: java.lang.Exception -> Lc1
            long r6 = r13.getMsgId()     // Catch: java.lang.Exception -> Lc1
            int r8 = r13.getMsgType()     // Catch: java.lang.Exception -> Lc1
            r11.LJLIL = r12     // Catch: java.lang.Exception -> Lc1
            r11.LJLILLLLZI = r13     // Catch: java.lang.Exception -> Lc1
            r11.LJLJJL = r1     // Catch: java.lang.Exception -> Lc1
            java.lang.Object r4 = r4.fetchSuggestedReplies(r5, r6, r8, r9, r11)     // Catch: java.lang.Exception -> Lc1
            if (r4 != r3) goto L8c
            return r3
        L8c:
            r6 = r12
            goto L91
        L8e:
            X.C141335gf.LIZJ(r4)     // Catch: java.lang.Exception -> Lc1
        L91:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data.SuggestedReplyResponse r4 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data.SuggestedReplyResponse) r4     // Catch: java.lang.Exception -> Lc1
            java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data.SuggestedReply> r5 = r4.reply     // Catch: java.lang.Exception -> Lc1
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.bizExtra     // Catch: java.lang.Exception -> Lc1
            java.lang.String r0 = "VideoDiversityTag"
            java.lang.Object r4 = r1.get(r0)     // Catch: java.lang.Exception -> Lc1
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> Lc1
            java.lang.String r3 = X.C46U.LIZJ(r5)     // Catch: java.lang.Exception -> Lc1
            java.lang.String r1 = "IS_FETCHED"
            java.lang.String r0 = "1"
            r13.addLocalExt(r1, r0)     // Catch: java.lang.Exception -> Lc1
            java.lang.String r0 = "content_understanding_tag"
            r13.addLocalExt(r0, r4)     // Catch: java.lang.Exception -> Lc1
            X.C46U.LJIIL(r13, r3)     // Catch: java.lang.Exception -> Lc1
            r6.LJII()     // Catch: java.lang.Exception -> Lc1
            X.4GC r0 = new X.4GC     // Catch: java.lang.Exception -> Lc1
            r0.<init>(r5)     // Catch: java.lang.Exception -> Lc1
            goto Lc6
        Lbb:
            X.4GD r0 = new X.4GD     // Catch: java.lang.Exception -> Lc1
            r0.<init>(r2)     // Catch: java.lang.Exception -> Lc1
            return r0
        Lc1:
            X.4GD r0 = new X.4GD
            r0.<init>(r2)
        Lc6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4GA.LJI(X.4Rq, X.2kd):java.lang.Object");
    }
}
