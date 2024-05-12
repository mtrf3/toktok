package com.bytedance.lobby.google;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C24070x1;
import X.C39021FTd;
import X.C58252Mtc;
import X.C65474Pmo;
import X.C66504Q8e;
import X.C66533Q9h;
import X.C66534Q9i;
import X.C66543Q9r;
import X.C66545Q9t;
import X.C66548Q9w;
import X.InterfaceC66557QAf;
import X.InterfaceC66565QAn;
import X.InterfaceC66566QAo;
import X.Q6S;
import X.Q6T;
import X.Q8M;
import X.QA2;
import X.QA3;
import X.QAD;
import X.QAI;
import X.QAL;
import X.QB3;
import X.QCI;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class GoogleWebAuth extends GoogleWebAuthProvider implements QB3, InterfaceC66566QAo {
    public InterfaceC66557QAf LJLJJI;
    public LobbyViewModel LJLJJL;

    @Override // X.QB3
    public final /* synthetic */ void Ml0(int i) {
    }

    @Override // X.QB3
    public final void us(Bundle bundle, ActivityC45651qj activityC45651qj) {
    }

    @Override // X.QB3
    public final void onDestroy() {
        InterfaceC66557QAf interfaceC66557QAf = this.LJLJJI;
        if (interfaceC66557QAf != null) {
            QA3 qa3 = (QA3) interfaceC66557QAf;
            if (qa3.LIZ != null) {
                qa3.LIZ = null;
            }
            if (qa3.LIZIZ != null) {
                qa3.LIZIZ = null;
            }
            C66533Q9h c66533Q9h = qa3.LIZJ;
            if (c66533Q9h == null || c66533Q9h.LJ) {
                return;
            }
            Q6S q6s = c66533Q9h.LIZJ;
            synchronized (q6s) {
                if (q6s.LIZLLL != null) {
                    Context context = q6s.LIZ.get();
                    if (context != null) {
                        context.unbindService(q6s.LIZLLL);
                    }
                    q6s.LIZIZ.set(null);
                    Q6T.LIZ("CustomTabsService is disconnected", new Object[0]);
                }
            }
            c66533Q9h.LJ = true;
        }
    }

    @Override // com.bytedance.lobby.internal.BaseProvider, X.QB9
    public final boolean LJJZZIII() {
        if (C39021FTd.LIZ(LobbyCore.getApplication(), C66534Q9i.LIZJ.LIZ) != null) {
            return true;
        }
        return false;
    }

    public GoogleWebAuth(QCI qci) {
        super(LobbyCore.getApplication(), qci);
    }

    public final void gv0(QAL qal) {
        String str;
        if (qal.LIZIZ != null) {
            boolean z = true;
            Q8M q8m = new Q8M("google_web", 1);
            q8m.LIZ = false;
            if (TextUtils.isEmpty(qal.LIZIZ)) {
                str = "-1";
            } else {
                str = qal.LIZIZ;
            }
            C66504Q8e c66504Q8e = new C66504Q8e(CastIntegerProtector.parseInt(str), qal.LIZJ);
            if (!qal.LIZ && CastIntegerProtector.parseInt(qal.LIZIZ) != QAI.LIZIZ.code) {
                z = false;
            }
            c66504Q8e.setCancelled(z);
            q8m.LIZIZ = c66504Q8e;
            this.LJLJJL.hv0(new AuthResult(q8m));
        }
    }

    @Override // X.QB3
    public final void za(Bundle bundle, ActivityC45651qj activityC45651qj) {
        this.LJLJJL = (LobbyViewModel) ViewModelProviders.of(activityC45651qj).get(LobbyViewModel.class);
        QAD qad = (QAD) ((InterfaceC66565QAn) ((ConcurrentHashMap) C58252Mtc.LIZ).get(QAD.class));
        C24070x1 c24070x1 = new C24070x1();
        c24070x1.LIZJ = "code";
        HashSet hashSet = new HashSet();
        hashSet.add("profile");
        c24070x1.LIZLLL = hashSet;
        c24070x1.LIZIZ = "app_auth";
        c24070x1.LJ = UriProtector.parse(this.LJLJI.LIZLLL.getString("google_auth_redirect_uri", null));
        this.LJLJJI = qad.LIZ(activityC45651qj, c24070x1, this);
    }

    @Override // X.QB3
    public final void q50(ActivityC45651qj activityC45651qj, int i, int i2, Intent intent) {
        InterfaceC66557QAf interfaceC66557QAf = this.LJLJJI;
        if (interfaceC66557QAf != null) {
            QA3 qa3 = (QA3) interfaceC66557QAf;
            if (i == 100) {
                try {
                    if (intent == null) {
                        InterfaceC66566QAo interfaceC66566QAo = qa3.LIZ;
                        if (interfaceC66566QAo != null) {
                            ((GoogleWebAuth) interfaceC66566QAo).gv0(new QAL("activity result null"));
                            return;
                        }
                        return;
                    }
                    C66545Q9t LIZIZ = C66545Q9t.LIZIZ(intent);
                    C66543Q9r fromIntent = C66543Q9r.fromIntent(intent);
                    QA2 qa2 = new QA2(LIZIZ, fromIntent);
                    if (LIZIZ != null) {
                        if (qa3.LIZIZ == null) {
                            InterfaceC66566QAo interfaceC66566QAo2 = qa3.LIZ;
                            if (interfaceC66566QAo2 != null) {
                                ((GoogleWebAuth) interfaceC66566QAo2).gv0(new QAL("context null"));
                                return;
                            }
                            return;
                        }
                        C66533Q9h c66533Q9h = qa3.LIZJ;
                        C65474Pmo LIZ = LIZIZ.LIZ();
                        C66548Q9w c66548Q9w = new C66548Q9w(qa3, qa2);
                        c66533Q9h.getClass();
                        c66533Q9h.LIZIZ(LIZ, c66548Q9w);
                        return;
                    }
                    if (fromIntent != null) {
                        QAL qal = new QAL(fromIntent.code, fromIntent.error);
                        if (fromIntent.code == QAI.LIZJ.code) {
                            qal.LIZ = true;
                        }
                        InterfaceC66566QAo interfaceC66566QAo3 = qa3.LIZ;
                        if (interfaceC66566QAo3 != null) {
                            ((GoogleWebAuth) interfaceC66566QAo3).gv0(qal);
                            return;
                        }
                        return;
                    }
                    InterfaceC66566QAo interfaceC66566QAo4 = qa3.LIZ;
                    if (interfaceC66566QAo4 != null) {
                        ((GoogleWebAuth) interfaceC66566QAo4).gv0(new QAL("response null"));
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    InterfaceC66566QAo interfaceC66566QAo5 = qa3.LIZ;
                    if (interfaceC66566QAo5 != null) {
                        ((GoogleWebAuth) interfaceC66566QAo5).gv0(new QAL(e.getMessage()));
                    }
                }
            }
        }
    }
}
