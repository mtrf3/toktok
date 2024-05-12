package Y;

import X.C06460Ne;
import X.C0NB;
import X.C15380j0;
import X.C15650jR;
import X.C47061t0;
import X.C76799UCd;
import X.C76805UCj;
import X.C76808UCm;
import X.C76810UCo;
import X.C76811UCp;
import X.C76812UCq;
import X.C76819UCx;
import X.C78368UpI;
import X.C78391Upf;
import X.C78443UqV;
import X.C78866UxK;
import X.CMV;
import X.InterfaceC76622U5i;
import X.JBR;
import X.U5I;
import X.U7F;
import X.X1D;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multimatch.speedchallenge.ui.MatchSpeedChallengeAssem;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.reply_message.LinkerReplyContent;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import com.bytedance.android.livesdkapi.depend.model.live.match.PreviewPeriod;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS3S0401000_13 implements Runnable {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        if (((C76805UCj) this.l0).LJLIL && this.i4 + 1 < ((List) this.l1).size()) {
            C78866UxK.LJJLJ(-2, (ViewGroup) this.l2);
            C76805UCj c76805UCj = (C76805UCj) this.l0;
            C76812UCq c76812UCq = new C76812UCq(((PreviewPeriod) ListProtector.get((List) this.l1, this.i4 + 1)).promot, null, ((PreviewPeriod) ListProtector.get((List) this.l1, this.i4 + 1)).icon);
            C76805UCj c76805UCj2 = (C76805UCj) this.l0;
            C76805UCj.LJII(c76805UCj, c76812UCq, new C76810UCo(c76805UCj2.LJLJJL, (CMV) this.l3, c76805UCj2.LJLJJI, (ViewGroup) this.l2));
        }
    }

    public final void LIZ$1() {
        SpannableStringBuilder spannableStringBuilder;
        Number valueOf;
        int measuredWidth;
        boolean z;
        if (((MatchSpeedChallengeAssem) this.l0).LJLL && this.i4 + 1 < ((List) this.l1).size()) {
            C78866UxK.LJJLJ(-2, (ViewGroup) this.l2);
            MatchSpeedChallengeAssem matchSpeedChallengeAssem = (MatchSpeedChallengeAssem) this.l0;
            BattlePrompt battlePrompt = ((PreviewPeriod) ListProtector.get((List) this.l1, this.i4 + 1)).promot;
            ImageModel imageModel = ((PreviewPeriod) ListProtector.get((List) this.l1, this.i4 + 1)).icon;
            MatchSpeedChallengeAssem matchSpeedChallengeAssem2 = (MatchSpeedChallengeAssem) this.l0;
            C47061t0 c47061t0 = matchSpeedChallengeAssem2.LJLLL;
            U5I u5i = (U5I) this.l3;
            LinearLayout linearLayout = matchSpeedChallengeAssem2.LJLLJ;
            ViewGroup viewGroup = (ViewGroup) this.l2;
            C76811UCp c76811UCp = new C76811UCp(c47061t0, u5i, linearLayout, viewGroup);
            if (matchSpeedChallengeAssem.LJLL && ((battlePrompt != null || !TextUtils.isEmpty(null)) && linearLayout != null && viewGroup != null && u5i != null)) {
                if (battlePrompt != null) {
                    spannableStringBuilder = C76799UCd.LIZIZ(battlePrompt);
                } else {
                    spannableStringBuilder = new SpannableStringBuilder(null);
                }
                String text = u5i.getText();
                text.toString();
                if (!o.LJ(text, spannableStringBuilder.toString())) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("currentState = ");
                    C76819UCx c76819UCx = matchSpeedChallengeAssem.LLIIJI;
                    if (c76819UCx != null) {
                        LIZ.append(c76819UCx.LJLL);
                        LIZ.append(" and TextString = ");
                        LIZ.append((Object) spannableStringBuilder);
                        C0NB.LIZIZ("SpeedChallengeRe", X1D.LIZIZ(LIZ));
                        int LJIIL = C15380j0.LJIIL() - C15380j0.LIZ(88.0f);
                        int LIZ2 = C15380j0.LIZ(94.0f);
                        if (viewGroup.getMeasuredWidth() == 0) {
                            valueOf = Integer.valueOf(LIZ2);
                        } else {
                            valueOf = Float.valueOf(viewGroup.getMeasuredWidth() * 1.0f);
                        }
                        U5I.LIZIZ(u5i, spannableStringBuilder);
                        if (imageModel != null) {
                            if (c47061t0 != null) {
                                c47061t0.setVisibility(0);
                                C15650jR.LIZ().LJIIIZ(imageModel).LJIIJJI(c47061t0);
                            }
                        } else if (c47061t0 != null) {
                            c47061t0.setVisibility(8);
                        }
                        matchSpeedChallengeAssem.N3(viewGroup);
                        if (o.LJ(viewGroup, matchSpeedChallengeAssem.LJLLILLLL)) {
                            int LIZ3 = C15380j0.LIZ(94.0f);
                            int measuredWidth2 = viewGroup.getMeasuredWidth();
                            if (measuredWidth2 >= LIZ3) {
                                LIZ3 = measuredWidth2;
                            }
                            measuredWidth = C15380j0.LIZ(4.0f) + LIZ3;
                        } else {
                            measuredWidth = viewGroup.getMeasuredWidth();
                        }
                        StringBuilder LIZJ = C06460Ne.LIZJ("expectWidth = ", measuredWidth, " and MaxWidth = ", LJIIL, " viewParentwidth = ");
                        LIZJ.append(viewGroup.getMeasuredWidth());
                        LIZJ.append(" &&&& ");
                        C0NB.LIZIZ("SpeedChallengeRe", X1D.LIZIZ(LIZJ));
                        if (LJIIL <= measuredWidth) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (u5i.getText().length() == 0) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("view.textView isempty textis = ");
                            LIZ4.append((Object) spannableStringBuilder);
                            C0NB.LJ("SpeedChallengeRe", X1D.LIZIZ(LIZ4));
                            U5I.LIZIZ(u5i, spannableStringBuilder);
                        }
                        if (measuredWidth >= LIZ2) {
                            LIZ2 = measuredWidth;
                        }
                        int[] iArr = new int[2];
                        iArr[0] = valueOf.intValue();
                        if (!z) {
                            LJIIL = LIZ2;
                        }
                        iArr[1] = LJIIL;
                        ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
                        ofInt.setDuration(150L);
                        ofInt.addUpdateListener(new AUListenerS102S0200000_13(matchSpeedChallengeAssem, c76811UCp, 8));
                        ofInt.addListener(new C76808UCm(matchSpeedChallengeAssem, c76811UCp, spannableStringBuilder, z, LIZ2));
                        linearLayout.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.ALPHA, 0.0f, 1.0f);
                        AnimatorSet LIZLLL = JBR.LIZLLL(ofFloat, 150L);
                        LIZLLL.playSequentially(ofInt, ofFloat);
                        LIZLLL.start();
                    } else {
                        o.LJIJI("presenter");
                        throw null;
                    }
                }
            }
            LiveIconView liveIconView = ((MatchSpeedChallengeAssem) this.l0).LJLLLLLL;
            if (liveIconView == null) {
                return;
            }
            liveIconView.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$2() {
        U7F u7f = (U7F) this.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7f.LJIILJJIL;
        LinkUser linkUser = (LinkUser) this.l1;
        int i = this.i4;
        LinkerReplyContent linkerReplyContent = (LinkerReplyContent) this.l2;
        LinkMessage linkMessage = (LinkMessage) this.l3;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().LLD(u7f, new PermitApplyMessage(linkUser, i, null, 0 == true ? 1 : 0, new CustomLinkMessage(u7f.LJFF, null, new ExtraDataWrapper(null, linkerReplyContent, linkMessage.expireTimestamp, linkMessage)), 0 == true ? 1 : 0, 32, 0 == true ? 1 : 0));
        }
    }

    public static final void run$0(ARunnableS3S0401000_13 aRunnableS3S0401000_13) {
        boolean LIZ;
        try {
            aRunnableS3S0401000_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS3S0401000_13 aRunnableS3S0401000_13) {
        switch (aRunnableS3S0401000_13.i4) {
            case 0:
                Object obj = aRunnableS3S0401000_13.l0;
                JSONObject jSONObject = (JSONObject) aRunnableS3S0401000_13.l1;
                String str = (String) aRunnableS3S0401000_13.l2;
                String str2 = (String) aRunnableS3S0401000_13.l3;
                obj.getClass();
                if (jSONObject == null) {
                    try {
                        jSONObject = new JSONObject();
                    } catch (JSONException unused) {
                        return;
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("service", str);
                }
                C78443UqV.LJJI().monitorCommonLog(str2, jSONObject);
                return;
            default:
                ((C78391Upf) aRunnableS3S0401000_13.l0).LJFF((IapPaymentMethod) aRunnableS3S0401000_13.l1, (C78368UpI) aRunnableS3S0401000_13.l2, (List) aRunnableS3S0401000_13.l3);
                return;
        }
    }

    public static final void run$2(ARunnableS3S0401000_13 aRunnableS3S0401000_13) {
        boolean LIZ;
        try {
            aRunnableS3S0401000_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS3S0401000_13 aRunnableS3S0401000_13) {
        boolean LIZ;
        try {
            aRunnableS3S0401000_13.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS3S0401000_13(U7F u7f, LinkUser linkUser, LinkerReplyContent linkerReplyContent, LinkMessage linkMessage, int i) {
        this.$t = i;
        this.l0 = u7f;
        this.l1 = linkUser;
        this.i4 = 1;
        this.l2 = linkerReplyContent;
        this.l3 = linkMessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS3S0401000_13(Object obj, C76805UCj c76805UCj, int i, List<PreviewPeriod> list, ViewGroup viewGroup, CMV cmv) {
        this.$t = cmv;
        this.l0 = obj;
        this.i4 = c76805UCj;
        this.l1 = i;
        this.l2 = list;
        this.l3 = viewGroup;
    }
}
