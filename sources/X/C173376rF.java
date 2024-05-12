package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6rF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173376rF implements AnonymousClass573, InterfaceC74346TFu, InterfaceC176976x3 {
    public static final char[] LJLIL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @Override // X.InterfaceC74346TFu
    public void LIZ(String str) {
    }

    @Override // X.InterfaceC74346TFu
    public void LJLLLL() {
    }

    @Override // X.InterfaceC74346TFu
    public void start() {
    }

    public static String LJFF(File file) {
        int i;
        if (!file.isFile()) {
            return "";
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            bufferedInputStream.close();
            byte[] digest = messageDigest.digest();
            if (digest == null || digest.length <= 0) {
                return "";
            }
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            char[] cArr2 = new char[digest.length * 2];
            int i2 = 0;
            for (byte b : digest) {
                int i3 = i2 + 1;
                cArr2[i2] = cArr[(b >>> 4) & 15];
                i2 = i3 + 1;
                cArr2[i3] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return "";
        }
    }

    public static String LJI(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                char[] cArr = LJLIL;
                stringBuffer.append(cArr[(b & 240) >> 4]);
                stringBuffer.append(cArr[b & 15]);
            }
            str2 = stringBuffer.toString();
            return str2;
        } catch (NoSuchAlgorithmException e) {
            C16880lQ.LLLLIIL(e);
            return str2;
        }
    }

    public static final void LJII(VideoPublishEditModel videoPublishEditModel) {
        AVChallenge aVChallenge;
        List<AVChallenge> challenges;
        List<AVChallenge> challenges2;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        AudioEffectParam audioEffectParam = videoPublishEditModel.veAudioEffectParam;
        if (audioEffectParam != null) {
            aVChallenge = audioEffectParam.getChallenge();
        } else {
            aVChallenge = null;
        }
        videoPublishEditModel.removeAudioEffectChallengeFromTitleAndStruct(aVChallenge);
        AudioEffectParam audioEffectParam2 = videoPublishEditModel.veAudioEffectParam;
        if (audioEffectParam2 != null) {
            audioEffectParam2.setChallenge(null);
        }
        AudioEffectParam audioEffectParam3 = videoPublishEditModel.veAudioEffectParam;
        if (audioEffectParam3 != null && (challenges2 = audioEffectParam3.getChallenges()) != null) {
            Iterator<AVChallenge> it = challenges2.iterator();
            while (it.hasNext()) {
                videoPublishEditModel.removeAudioEffectChallengeFromTitleAndStruct(it.next());
            }
        }
        AudioEffectParam audioEffectParam4 = videoPublishEditModel.veAudioEffectParam;
        if (audioEffectParam4 != null && (challenges = audioEffectParam4.getChallenges()) != null) {
            challenges.clear();
        }
        C149905uU.LIZLLL(videoPublishEditModel);
    }

    @Override // X.InterfaceC176976x3
    public void LJ(int i) {
        C176956x1 c176956x1 = C56483MEt.LIZ;
        if (c176956x1 != null) {
            c176956x1.LIZJ(i, C56483MEt.LIZIZ, false);
        }
    }

    public static final void LJIIIIZZ(VideoPublishEditModel videoPublishEditModel, Effect effect) {
        List<AVChallenge> challenges;
        Iterator<AVChallenge> it;
        AVChallenge challenge;
        List<String> challenge2 = effect.getChallenge();
        if (challenge2 != null) {
            for (String str : challenge2) {
                AudioEffectParam audioEffectParam = videoPublishEditModel.veAudioEffectParam;
                if (audioEffectParam != null && (challenge = audioEffectParam.getChallenge()) != null && o.LJ(challenge.cid, str)) {
                    videoPublishEditModel.removeAudioEffectChallengeFromTitleAndStruct(challenge);
                    C149905uU.LJ(videoPublishEditModel, challenge);
                    AudioEffectParam audioEffectParam2 = videoPublishEditModel.veAudioEffectParam;
                    if (audioEffectParam2 != null) {
                        audioEffectParam2.setChallenge(null);
                    }
                }
                AudioEffectParam audioEffectParam3 = videoPublishEditModel.veAudioEffectParam;
                if (audioEffectParam3 == null || (challenges = audioEffectParam3.getChallenges()) == null || (it = challenges.iterator()) == null) {
                    return;
                }
                while (it.hasNext()) {
                    AVChallenge next = it.next();
                    if (o.LJ(next.cid, str)) {
                        videoPublishEditModel.removeAudioEffectChallengeFromTitleAndStruct(next);
                        C149905uU.LJ(videoPublishEditModel, next);
                        it.remove();
                    }
                }
            }
        }
    }

    public static final void LIZLLL(LifecycleOwner owner, final VideoPublishEditModel videoPublishEditModel, Effect effect) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(effect, "effect");
        ArrayList arrayList = new ArrayList();
        List<String> challenge = effect.getChallenge();
        if (challenge != null) {
            Iterator<String> it = challenge.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            new C41386GMc(owner, (String) it2.next()).LIZ(new BOC() { // from class: X.6j7
                @Override // X.BOC
                public final void LIZ(AVChallenge challenge2) {
                    AudioEffectParam audioEffectParam = VideoPublishEditModel.this.veAudioEffectParam;
                    if (audioEffectParam != null) {
                        audioEffectParam.setChallenge(challenge2);
                        if (!audioEffectParam.getChallenges().contains(challenge2)) {
                            List<AVChallenge> challenges = audioEffectParam.getChallenges();
                            o.LJIIIIZZ(challenge2, "challenge");
                            challenges.add(challenge2);
                        }
                    }
                }
            });
        }
    }

    @Override // X.AnonymousClass573
    public void LIZIZ(boolean z, long j, Exception exc, Integer num) {
        String str;
        if (exc == null || (str = exc.getMessage()) == null) {
            str = "";
        }
        C145995oB LIZIZ = GFJ.LIZIZ(!z ? 1 : 0, "status");
        LIZIZ.LJI("error_domain", str);
        LIZIZ.LIZIZ(j, "duration");
        if (!z && num != null) {
            LIZIZ.LIZ(num.intValue(), "error_code");
        }
        FMX.LJIIL("load_transition_effect_list", LIZIZ.LIZ);
    }

    @Override // X.AnonymousClass573
    public void LIZJ(boolean z, long j, Exception exc, Integer num, ResourceItem item) {
        String str;
        o.LJIIIZ(item, "item");
        if (exc == null || (str = exc.getMessage()) == null) {
            str = "";
        }
        String effectId = item.getEffectId();
        o.LJIIIIZZ(effectId, "item.effectId");
        String name = item.getName();
        o.LJIIIIZZ(name, "item.name");
        int i = !z ? 1 : 0;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(i, "status");
        c145995oB.LIZIZ(j, "duration");
        c145995oB.LJI("resource_id", effectId);
        c145995oB.LJI("resource_name", name);
        if (!z && num != null) {
            c145995oB.LIZ(num.intValue(), "error_code");
            c145995oB.LIZLLL("error_domain", str);
        }
        FMX.LJIIL("download_transition_effect_item", c145995oB.LIZ);
    }
}
