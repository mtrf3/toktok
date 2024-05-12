package Y;

import X.AbstractC73635Sv9;
import X.C0NB;
import X.C29162BcU;
import X.C30725C4b;
import X.C38352F3k;
import X.C59349NQz;
import X.C59881Nen;
import X.C59882Neo;
import X.C59885Ner;
import X.C62234Obe;
import X.C76800UCe;
import X.C770030m;
import X.CN1;
import X.InterfaceC48038ItG;
import X.NR0;
import X.NR1;
import X.OPL;
import X.OYE;
import X.OYF;
import X.X1D;
import X.XC5;
import android.util.Base64;
import android.view.View;
import com.bytedance.android.live.network.response.StartLiveResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.ss.android.ugc.aweme.aigc.AIGCQuota;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcIntroFragmentV2;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.DownloadedVideoSharePackage;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class IDhS103S0100000_10 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            default:
                return null;
        }
    }

    public IDhS103S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(IDhS103S0100000_10 iDhS103S0100000_10, Object obj) {
        Object obj2;
        Object obj3;
        int i;
        int i2;
        Integer quotaRemain;
        Integer quotaRemain2;
        List it = (List) obj;
        o.LJIIIZ(it, "it");
        Iterator it2 = it.iterator();
        while (true) {
            obj2 = null;
            if (it2.hasNext()) {
                obj3 = it2.next();
                AIGCQuota aIGCQuota = (AIGCQuota) obj3;
                if (o.LJ(aIGCQuota.getQuotaType(), "fast") || o.LJ(aIGCQuota.getQuotaType(), "quick")) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        AIGCQuota aIGCQuota2 = (AIGCQuota) obj3;
        if (aIGCQuota2 != null && (quotaRemain2 = aIGCQuota2.getQuotaRemain()) != null) {
            i = quotaRemain2.intValue();
        } else {
            i = 0;
        }
        Iterator it3 = it.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (o.LJ(((AIGCQuota) next).getQuotaType(), "slow")) {
                obj2 = next;
                break;
            }
        }
        AIGCQuota aIGCQuota3 = (AIGCQuota) obj2;
        if (aIGCQuota3 != null && (quotaRemain = aIGCQuota3.getQuotaRemain()) != null) {
            i2 = quotaRemain.intValue();
        } else {
            i2 = 0;
        }
        if (i <= 0) {
            ProfileAigcIntroFragmentV2 profileAigcIntroFragmentV2 = (ProfileAigcIntroFragmentV2) iDhS103S0100000_10.l0;
            View view = profileAigcIntroFragmentV2.LJLLL;
            if (view != null) {
                profileAigcIntroFragmentV2._$_findCachedViewById(R.id.fui).setVisibility(4);
                view.setBackgroundResource(R.drawable.bwa);
            }
            ((ProfileAigcIntroFragmentV2) iDhS103S0100000_10.l0).LJLLLLLL = false;
        }
        if (i2 <= 0) {
            ProfileAigcIntroFragmentV2 profileAigcIntroFragmentV22 = (ProfileAigcIntroFragmentV2) iDhS103S0100000_10.l0;
            View view2 = profileAigcIntroFragmentV22.LJLLJ;
            if (view2 != null) {
                profileAigcIntroFragmentV22._$_findCachedViewById(R.id.ht7).setVisibility(4);
                view2.setBackgroundResource(R.drawable.bwa);
            }
            ((ProfileAigcIntroFragmentV2) iDhS103S0100000_10.l0).LJLLLL = false;
        }
        ProfileAigcIntroFragmentV2 profileAigcIntroFragmentV23 = (ProfileAigcIntroFragmentV2) iDhS103S0100000_10.l0;
        profileAigcIntroFragmentV23.LJZI = true;
        profileAigcIntroFragmentV23.LL = true;
        float f = 0.3f;
        if (!profileAigcIntroFragmentV23.LJLLLLLL) {
            if (!profileAigcIntroFragmentV23.LJLLLL) {
                View view3 = profileAigcIntroFragmentV23.LJLLL;
                if (view3 != null) {
                    view3.setAlpha(1.0f);
                }
                View view4 = ((ProfileAigcIntroFragmentV2) iDhS103S0100000_10.l0).LJLLJ;
                if (view4 != null) {
                    view4.setAlpha(1.0f);
                }
                ((ProfileAigcIntroFragmentV2) iDhS103S0100000_10.l0).LJZI = false;
            } else {
                View view5 = profileAigcIntroFragmentV23.LJLLL;
                if (view5 != null) {
                    view5.setAlpha(0.3f);
                }
                View view6 = ((ProfileAigcIntroFragmentV2) iDhS103S0100000_10.l0).LJLLJ;
                if (view6 != null) {
                    view6.setAlpha(1.0f);
                }
                ((ProfileAigcIntroFragmentV2) iDhS103S0100000_10.l0).vl(OPL.SLOW);
            }
        } else if (!profileAigcIntroFragmentV23.LJLLLL) {
            profileAigcIntroFragmentV23.vl(OPL.FAST);
            View view7 = ((ProfileAigcIntroFragmentV2) iDhS103S0100000_10.l0).LJLLJ;
            if (view7 != null) {
                view7.setAlpha(0.3f);
            }
            View view8 = ((ProfileAigcIntroFragmentV2) iDhS103S0100000_10.l0).LJLLL;
            if (view8 != null) {
                view8.setAlpha(1.0f);
            }
            ProfileAigcIntroFragmentV2 profileAigcIntroFragmentV24 = (ProfileAigcIntroFragmentV2) iDhS103S0100000_10.l0;
            profileAigcIntroFragmentV24.LJZI = ((Boolean) profileAigcIntroFragmentV24.LJZL.getValue()).booleanValue();
        }
        View _$_findCachedViewById = ((ProfileAigcIntroFragmentV2) iDhS103S0100000_10.l0)._$_findCachedViewById(R.id.byo);
        if (((ProfileAigcIntroFragmentV2) iDhS103S0100000_10.l0).LJZI) {
            f = 1.0f;
        }
        _$_findCachedViewById.setAlpha(f);
        return C76800UCe.LIZ;
    }

    public static final Object apply$1(IDhS103S0100000_10 iDhS103S0100000_10, Object obj) {
        String shortLink = (String) obj;
        o.LJIIIZ(shortLink, "shortLink");
        ((DownloadedVideoSharePackage) iDhS103S0100000_10.l0).extras.putString("share_url", shortLink);
        return AbstractC73635Sv9.LJ(new C62234Obe(shortLink));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$2(IDhS103S0100000_10 iDhS103S0100000_10, Object obj) {
        ((C29162BcU) iDhS103S0100000_10.l0).getClass();
        Room room = (Room) ((StartLiveResponse) obj).data;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uid", String.valueOf(room.getOwnerUserId()));
            jSONObject.put("roomId", String.valueOf(room.getId()));
            jSONObject.put("aid", String.valueOf(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).appId()));
            jSONObject.put("timestamp", String.valueOf(C30725C4b.LIZ() / 1000));
            String jSONObject2 = jSONObject.toString();
            String LIZJ = C38352F3k.LIZJ(String.valueOf(room.getId()));
            byte[] bArr = {8, 9, 7, 5, 7, 5, 6, 7, 8, 9, 10, 11, 12, XC5.LJFF, 14, 15};
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(C770030m.LIZ(LIZJ), "AES"), new IvParameterSpec(bArr));
            byte[] doFinal = cipher.doFinal(jSONObject2.getBytes(Charset.forName("UTF-8")));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bytedmediasdkandroid:");
            LIZ.append(Base64.encodeToString(doFinal, 2));
            room.authenticationValue = X1D.LIZIZ(LIZ);
        } catch (Exception e) {
            C0NB.LJI("AuthenticationCalculate", e);
        }
        return room;
    }

    public static final Object apply$3(IDhS103S0100000_10 iDhS103S0100000_10, Object obj) {
        String res = (String) obj;
        o.LJIIIZ(res, "res");
        String LIZ = OYF.LIZ(((BaseSharePackage) iDhS103S0100000_10.l0).extras.getBundle("short_link_params"), res);
        if (LIZ == null) {
            LIZ = "";
        }
        return AbstractC73635Sv9.LJ(new OYE(LIZ));
    }

    public static final Object apply$4(IDhS103S0100000_10 iDhS103S0100000_10, Object obj) {
        C59881Nen c59881Nen = (C59881Nen) iDhS103S0100000_10.l0;
        C59882Neo c59882Neo = c59881Nen.LIZ;
        String str = null;
        c59882Neo.LJ = null;
        c59882Neo.LJFF = false;
        c59882Neo.LIZ.clear();
        c59882Neo.LIZIZ.clear();
        c59882Neo.LIZJ.clear();
        c59882Neo.LIZLLL.clear();
        C59882Neo c59882Neo2 = c59881Nen.LIZ;
        c59882Neo2.getClass();
        NR0 nr0 = NR0.LIZLLL;
        if (nr0 != null) {
            Iterator<C59349NQz> it = nr0.LIZIZ.iterator();
            while (it.hasNext()) {
                C59349NQz next = it.next();
                View view = next.LIZIZ.get();
                if (view == null) {
                    break;
                }
                String str2 = next.LJI;
                if (next.LIZLLL && !next.LJ && view.hasWindowFocus() && view.hasWindowFocus()) {
                    HashSet hashSet = new HashSet();
                    View view2 = view;
                    while (NR1.LIZ(view2)) {
                        hashSet.add(view2);
                        Object parent = view2.getParent();
                        if (!(parent instanceof View) || (view2 = (View) parent) == null) {
                            c59882Neo2.LIZJ.addAll(hashSet);
                            c59882Neo2.LIZ.put(view, str2);
                            c59882Neo2.LIZLLL.add(str2);
                            Iterator<WeakReference<View>> it2 = next.LIZJ.iterator();
                            while (it2.hasNext()) {
                                WeakReference<View> next2 = it2.next();
                                if (next2.get() != null) {
                                    c59882Neo2.LIZIZ.put(next2.get(), str2);
                                }
                            }
                            c59882Neo2.LJ = next;
                        }
                    }
                }
            }
        }
        C59349NQz c59349NQz = c59881Nen.LIZ.LJ;
        c59881Nen.LIZJ = c59349NQz;
        if (c59349NQz != null && c59349NQz.LIZLLL && !c59349NQz.LJ && c59349NQz.LIZIZ.get() != null) {
            C59885Ner c59885Ner = new C59885Ner(System.nanoTime(), c59881Nen.LIZJ.LJI);
            View rootView = c59881Nen.LIZJ.LIZIZ.get().getRootView();
            c59885Ner.LIZJ = true;
            c59881Nen.LIZJ(rootView, c59885Ner);
            return c59885Ner;
        }
        long nanoTime = System.nanoTime();
        C59349NQz c59349NQz2 = c59881Nen.LIZJ;
        if (c59349NQz2 != null) {
            str = c59349NQz2.LJI;
        }
        return new C59885Ner(nanoTime, str);
    }
}
