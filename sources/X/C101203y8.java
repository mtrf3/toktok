package X;

import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import defpackage.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3y8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101203y8 implements InterfaceC101213y9 {
    public static final C101203y8 LIZIZ = new C101203y8(0);
    public final InterfaceC65784Pro<InterfaceC88923eK> LIZ;

    public C101203y8(int i) {
        C101223yA messageSenderTaskBuilder = C101223yA.LJLIL;
        o.LJIIIZ(messageSenderTaskBuilder, "messageSenderTaskBuilder");
        this.LIZ = messageSenderTaskBuilder;
    }

    @Override // X.InterfaceC101213y9
    public final void LIZ(final List<? extends IMContact> contacts, final SendMessageTemplateTask sendMessageTemplateTask, String str, final InterfaceC108394Nf interfaceC108394Nf) {
        boolean z;
        o.LJIIIZ(contacts, "contacts");
        InterfaceC92803ka interfaceC92803ka = new InterfaceC92803ka() { // from class: X.4NY
            public boolean LIZ;
            public boolean LIZIZ;

            @Override // X.InterfaceC92793kZ
            public final void LIZ(C63120Opw c63120Opw, List<? extends C109544Rq> list) {
            }

            @Override // X.InterfaceC92793kZ
            public final void LIZJ(C63120Opw c63120Opw, C109544Rq c109544Rq) {
            }

            @Override // X.InterfaceC92803ka
            public final void LIZLLL(C63120Opw c63120Opw, List<C109544Rq> list, java.util.Map<C109544Rq, C63623Oy3> map) {
            }

            @Override // X.InterfaceC92803ka
            public final void LIZIZ(C63120Opw c63120Opw, C109544Rq c109544Rq) {
                if (c109544Rq != null) {
                    C101203y8 c101203y8 = this;
                    SendMessageTemplateTask sendMessageTemplateTask2 = sendMessageTemplateTask;
                    c101203y8.getClass();
                    c109544Rq.addLocalExt("enter_from", sendMessageTemplateTask2.sendMessageEventParcel.enterFrom);
                    String str2 = sendMessageTemplateTask2.sendMessageEventParcel.panelSource;
                    if (str2 != null) {
                        c109544Rq.addLocalExt("panel_source", str2);
                    }
                    String str3 = sendMessageTemplateTask2.sendMessageEventParcel.enterMethod;
                    if (str3 != null) {
                        c109544Rq.addLocalExt("enter_method", str3);
                    }
                    String str4 = sendMessageTemplateTask2.sendMessageEventParcel.resourceId;
                    if (str4 != null) {
                        c109544Rq.addLocalExt("resource_id", str4);
                    }
                    String str5 = sendMessageTemplateTask2.sendMessageEventParcel.authorFollowStatus;
                    if (str5 != null) {
                        c109544Rq.addLocalExt("author_follow_status", str5);
                    }
                }
                if (this.LIZ) {
                    return;
                }
                this.LIZ = true;
                InterfaceC108394Nf interfaceC108394Nf2 = InterfaceC108394Nf.this;
                if (interfaceC108394Nf2 != null) {
                    final BaseTemplate baseTemplate = sendMessageTemplateTask.template;
                    final int size = contacts.size();
                    interfaceC108394Nf2.LIZ(new AbstractC108384Ne(baseTemplate, size) { // from class: X.4Nb
                        public final BaseTemplate LIZ;
                        public final int LIZIZ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C108354Nb)) {
                                return false;
                            }
                            C108354Nb c108354Nb = (C108354Nb) obj;
                            return o.LJ(this.LIZ, c108354Nb.LIZ) && this.LIZIZ == c108354Nb.LIZIZ;
                        }

                        public final int hashCode() {
                            return (this.LIZ.hashCode() * 31) + this.LIZIZ;
                        }

                        public final String toString() {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("SendStarted(template=");
                            LIZ.append(this.LIZ);
                            LIZ.append(", numberOfSharedContacts=");
                            return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
                        }

                        {
                            o.LJIIIZ(baseTemplate, "template");
                            this.LIZ = baseTemplate;
                            this.LIZIZ = size;
                        }
                    });
                }
            }

            @Override // X.InterfaceC92803ka
            public final void LJFF(C63120Opw c63120Opw, C109544Rq c109544Rq) {
                if (this.LIZIZ) {
                    return;
                }
                this.LIZIZ = true;
                InterfaceC108394Nf interfaceC108394Nf2 = InterfaceC108394Nf.this;
                if (interfaceC108394Nf2 != null) {
                    final BaseTemplate baseTemplate = sendMessageTemplateTask.template;
                    final int size = contacts.size();
                    interfaceC108394Nf2.LIZ(new AbstractC108384Ne(baseTemplate, size) { // from class: X.4Nc
                        public final BaseTemplate LIZ;
                        public final int LIZIZ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C108364Nc)) {
                                return false;
                            }
                            C108364Nc c108364Nc = (C108364Nc) obj;
                            return o.LJ(this.LIZ, c108364Nc.LIZ) && this.LIZIZ == c108364Nc.LIZIZ;
                        }

                        public final int hashCode() {
                            return (this.LIZ.hashCode() * 31) + this.LIZIZ;
                        }

                        public final String toString() {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("SendSucceeded(template=");
                            LIZ.append(this.LIZ);
                            LIZ.append(", numberOfSharedContacts=");
                            return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
                        }

                        {
                            o.LJIIIZ(baseTemplate, "template");
                            this.LIZ = baseTemplate;
                            this.LIZIZ = size;
                        }
                    });
                }
            }

            @Override // X.InterfaceC92803ka
            public final void LJ(C63120Opw c63120Opw, C109544Rq c109544Rq, C63623Oy3 c63623Oy3) {
                if (this.LIZIZ) {
                    return;
                }
                this.LIZIZ = true;
                InterfaceC108394Nf interfaceC108394Nf2 = InterfaceC108394Nf.this;
                if (interfaceC108394Nf2 != null) {
                    final BaseTemplate baseTemplate = sendMessageTemplateTask.template;
                    final int size = contacts.size();
                    interfaceC108394Nf2.LIZ(new AbstractC108384Ne(baseTemplate, size) { // from class: X.4Na
                        public final BaseTemplate LIZ;
                        public final int LIZIZ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C108344Na)) {
                                return false;
                            }
                            C108344Na c108344Na = (C108344Na) obj;
                            return o.LJ(this.LIZ, c108344Na.LIZ) && this.LIZIZ == c108344Na.LIZIZ;
                        }

                        public final int hashCode() {
                            return (this.LIZ.hashCode() * 31) + this.LIZIZ;
                        }

                        public final String toString() {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("SendFailed(template=");
                            LIZ.append(this.LIZ);
                            LIZ.append(", numberOfSharedContacts=");
                            return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
                        }

                        {
                            o.LJIIIZ(baseTemplate, "template");
                            this.LIZ = baseTemplate;
                            this.LIZIZ = size;
                        }
                    });
                }
            }
        };
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        TextContent textContent = null;
        if (!z && str != null) {
            textContent = TextContent.Companion.obtain$default(TextContent.Companion, str, null, null, 6, null);
        }
        Iterator it = ((ArrayList) C3K0.LIZLLL((IMContact[]) contacts.toArray(new IMContact[0]))).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C4MW LIZ = this.LIZ.invoke().LIZ(sendMessageTemplateTask.scene);
            LIZ.LIZLLL(textContent);
            LIZ.LJFF(sendMessageTemplateTask.template);
            List<C117824jq> list = sendMessageTemplateTask.attachments;
            C4MX c4mx = LIZ.LIZ;
            c4mx.LJ = list;
            c4mx.LIZIZ = str2;
            LIZ.LJII(interfaceC92803ka);
        }
    }
}
