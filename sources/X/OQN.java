package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPolicy;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.ugc.android.davinciresource.jni.AlgorithmResourceFinder;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import defpackage.e1;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ujb.o;

/* loaded from: classes11.dex */
public class OQN implements XC2, C66N, MR6 {
    @Override // X.C66N
    public boolean LIZ() {
        return true;
    }

    public static final OSZ LJI(User user) {
        String str;
        List<String> urlList;
        if (user == null) {
            return null;
        }
        UrlModel avatarMedium = user.getAvatarMedium();
        if (avatarMedium != null && (urlList = avatarMedium.getUrlList()) != null) {
            str = (String) ORZ.LJLLLLLL(0, urlList);
        } else {
            str = null;
        }
        String uid = user.getUid();
        if (uid == null || o.LJJJJJL(uid) || str == null || o.LJJJJJL(str)) {
            return null;
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("uid=", uid, ", nickname=");
        LIZIZ.append(user.getNickname());
        return new OSZ(str, X1D.LIZIZ(LIZIZ));
    }

    public static String LJII(String chartMusicInfo) {
        String str;
        kotlin.jvm.internal.o.LJIIIZ(chartMusicInfo, "chartMusicInfo");
        String LIZJ = C31461Li.LIZJ("music_chart_url", "", "getInstance().getStringV…rtUrlSetting::class.java)");
        if (TextUtils.isEmpty(LIZJ) || !o.LJJJLIIL(LIZJ, "aweme://lynxview/", false) || TextUtils.isEmpty(chartMusicInfo)) {
            return "";
        }
        try {
            str = URLEncoder.encode(chartMusicInfo, "utf-8");
            kotlin.jvm.internal.o.LJIIIIZZ(str, "encode(chartMusicInfo, \"utf-8\")");
        } catch (Exception unused) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setLazyUpdate(true);
            String accessKey = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAccessKey();
            C61520OCm LIZ = O3E.LIZ(accessKey);
            if (LIZ != null) {
                LIZ.LIZ(null, C51029K0z.LJJIIZI(new OSZ(accessKey, C47261Igj.LJJIJ(new CheckRequestBodyModel.TargetChannel("lynx_music_card")))), optionCheckUpdateParams);
            }
        } catch (Throwable unused2) {
        }
        if (e1.LIZ(31744, "enable_music_chart_fmp_opt", true, false)) {
            return C0ON.LIZJ(LIZJ, "&musicInfo=", str, "&enable_prefetch=1");
        }
        return a1.LJ(LIZJ, "&musicInfo=", str);
    }

    public static final boolean LJIIIZ(PublishModel publishModel) {
        kotlin.jvm.internal.o.LJIIIZ(publishModel, "<this>");
        if (publishModel.nowsShootData != null) {
            return true;
        }
        return false;
    }

    public static void LJIILIIL(Activity activity) {
        if (FCD.LIZJ()) {
            activity.getWindow().addFlags(67108864);
            return;
        }
        Window window = activity.getWindow();
        window.clearFlags(201326592);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
        window.setStatusBarColor(0);
    }

    public static final Bundle LJIILJJIL(EnterStoryParam enterStoryParam) {
        String str;
        kotlin.jvm.internal.o.LJIIIZ(enterStoryParam, "<this>");
        Bundle bundle = new Bundle();
        bundle.putBoolean("launch_as_activity", enterStoryParam.getLaunchAsActivity());
        bundle.putString("shoot_way", enterStoryParam.getShootWay());
        bundle.putString("enter_method", enterStoryParam.getEnterMethod());
        bundle.putString("creation_id", enterStoryParam.getCreationId());
        bundle.putString("enter_from", enterStoryParam.getEnterFrom());
        bundle.putString("shoot_enter_from", enterStoryParam.getShootEnterFrom());
        bundle.putString("shoot_enter_method", enterStoryParam.getShootEnterMethod());
        bundle.putBoolean("publish_with_anim", enterStoryParam.getNeedPublishWithAnim());
        bundle.putBoolean("is_story_mode", enterStoryParam.isStory());
        bundle.putParcelable("extra_shoot_data", enterStoryParam.getShootExtraData());
        bundle.putBoolean("is_story_enhanced_entrance", enterStoryParam.isStoryEnhancedEntrance());
        if (kotlin.jvm.internal.o.LJ(enterStoryParam.getEnterMethod(), "slide_right")) {
            if (enterStoryParam.isWestWindowExist()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            bundle.putString("is_west_window_exist", str);
        }
        return bundle;
    }

    @Override // X.MR6
    public void LIZIZ(Context context) {
        C40322Fs6.LIZLLL(context);
    }

    @Override // X.MR6
    public boolean LIZJ(Context context) {
        return C40322Fs6.LIZJ(context);
    }

    @Override // X.XC2
    public String LIZLLL(String nameStr) {
        kotlin.jvm.internal.o.LJIIIZ(nameStr, "nameStr");
        String resourceFinder = AlgorithmResourceFinder.resourceFinder(null, "", nameStr);
        kotlin.jvm.internal.o.LJIIIIZZ(resourceFinder, "resourceFinder(null, \"\", nameStr)");
        return resourceFinder;
    }

    public static final void LJFF(int i, int i2) {
        if (i <= i2) {
        } else {
            throw new IndexOutOfBoundsException(C48690J9a.LJIIJJI("toIndex (", i, ") is greater than size (", i2, ")."));
        }
    }

    public static boolean LJIIIIZZ(float f, float f2) {
        if (Math.abs(f - f2) <= 0.01f) {
            return true;
        }
        return false;
    }

    public static final void LJIIL(TuxIconView tuxIconView, List list) {
        C62562cu c62562cu;
        ArrayList LJ = AnonymousClass391.LJ(list, "policies");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Icon icon = ((ShopPolicy) it.next()).smallIcon;
            if (icon != null) {
                LJ.add(icon);
            }
        }
        if (!LJ.isEmpty()) {
            Image image = ((Icon) ListProtector.get(LJ, 0)).icon;
            if (image != null) {
                c62562cu = image.toImageUrlModel();
            } else {
                c62562cu = null;
            }
            W5F LIZLLL = C70759Rpr.LIZLLL(c62562cu);
            Context context = tuxIconView.getContext();
            kotlin.jvm.internal.o.LJIIIIZZ(context, "context");
            LIZLLL.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.cv, context);
            LIZLLL.LJJIIJZLJL = tuxIconView;
            C16880lQ.LLJJJ(LIZLLL);
        }
    }

    public static final void LJ(Object[] objArr, StringBuilder sb, List list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.contains(objArr)) {
            sb.append("[...]");
            return;
        }
        arrayList.add(objArr);
        sb.append('[');
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            Object obj = objArr[i];
            String str = "null";
            if (obj == null) {
                sb.append("null");
            } else if (obj instanceof Object[]) {
                LJ((Object[]) obj, sb, list);
            } else if (obj instanceof byte[]) {
                String arrays = Arrays.toString((byte[]) obj);
                kotlin.jvm.internal.o.LJIIIIZZ(arrays, "toString(this)");
                sb.append(arrays);
            } else if (obj instanceof short[]) {
                String arrays2 = Arrays.toString((short[]) obj);
                kotlin.jvm.internal.o.LJIIIIZZ(arrays2, "toString(this)");
                sb.append(arrays2);
            } else if (obj instanceof int[]) {
                String arrays3 = Arrays.toString((int[]) obj);
                kotlin.jvm.internal.o.LJIIIIZZ(arrays3, "toString(this)");
                sb.append(arrays3);
            } else if (obj instanceof long[]) {
                String arrays4 = Arrays.toString((long[]) obj);
                kotlin.jvm.internal.o.LJIIIIZZ(arrays4, "toString(this)");
                sb.append(arrays4);
            } else if (obj instanceof float[]) {
                String arrays5 = Arrays.toString((float[]) obj);
                kotlin.jvm.internal.o.LJIIIIZZ(arrays5, "toString(this)");
                sb.append(arrays5);
            } else if (obj instanceof double[]) {
                String arrays6 = Arrays.toString((double[]) obj);
                kotlin.jvm.internal.o.LJIIIIZZ(arrays6, "toString(this)");
                sb.append(arrays6);
            } else if (obj instanceof char[]) {
                String arrays7 = Arrays.toString((char[]) obj);
                kotlin.jvm.internal.o.LJIIIIZZ(arrays7, "toString(this)");
                sb.append(arrays7);
            } else if (obj instanceof boolean[]) {
                String arrays8 = Arrays.toString((boolean[]) obj);
                kotlin.jvm.internal.o.LJIIIIZZ(arrays8, "toString(this)");
                sb.append(arrays8);
            } else if (obj instanceof OQU) {
                byte[] bArr = ((OQU) obj).LJLIL;
                if (bArr != null) {
                    str = ORZ.LLD(new OQU(bArr), ", ", "[", "]", null, 56);
                }
                sb.append(str);
            } else if (obj instanceof OQO) {
                short[] sArr = ((OQO) obj).LJLIL;
                if (sArr != null) {
                    str = ORZ.LLD(new OQO(sArr), ", ", "[", "]", null, 56);
                }
                sb.append(str);
            } else if (obj instanceof C61872OQa) {
                int[] iArr = ((C61872OQa) obj).LJLIL;
                if (iArr != null) {
                    str = ORZ.LLD(new C61872OQa(iArr), ", ", "[", "]", null, 56);
                }
                sb.append(str);
            } else if (obj instanceof OQS) {
                long[] jArr = ((OQS) obj).LJLIL;
                if (jArr != null) {
                    str = ORZ.LLD(new OQS(jArr), ", ", "[", "]", null, 56);
                }
                sb.append(str);
            } else {
                sb.append(obj.toString());
            }
        }
        sb.append(']');
        ListProtector.remove(list, C47261Igj.LJJI(list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJIIJJI(com.bytedance.tux.input.TuxTextView r7, java.util.List r8, X.InterfaceC67352kd r9) {
        /*
            boolean r0 = r9 instanceof X.C27765Av3
            if (r0 == 0) goto L99
            r6 = r9
            X.Av3 r6 = (X.C27765Av3) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L99
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r1 = r6.LJLJI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L6a
            if (r0 != r3) goto La0
            java.lang.Object r2 = r6.LJLILLLLZI
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r7 = r6.LJLIL
            android.widget.TextView r7 = (android.widget.TextView) r7
            X.C141335gf.LIZJ(r1)
        L29:
            java.lang.Object r6 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r4)
            java.lang.String r6 = (java.lang.String) r6
            float r5 = X.OUP.LJJIJIIJI(r7, r6)
            int r4 = r2.size()
        L37:
            if (r3 >= r4) goto La8
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = " · "
            r1.append(r0)
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r3)
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            float r0 = X.OUP.LJJIJIIJI(r7, r1)
            float r5 = r5 + r0
            int r0 = r7.getWidth()
            float r0 = (float) r0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L63
            r7.setText(r6)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L63:
            java.lang.String r6 = defpackage.i0.LJFF(r6, r1)
            int r3 = r3 + 1
            goto L37
        L6a:
            java.util.ArrayList r2 = X.C1JX.LJFF(r1)
            java.util.Iterator r1 = r8.iterator()
        L72:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPolicy r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPolicy) r0
            java.lang.String r0 = r0.name
            if (r0 == 0) goto L72
            r2.add(r0)
            goto L72
        L86:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lab
            r6.LJLIL = r7
            r6.LJLILLLLZI = r2
            r6.LJLJJI = r3
            java.lang.Object r0 = X.OUP.LJJIJLIJ(r7, r6, r4)
            if (r0 != r5) goto L29
            return r5
        L99:
            X.Av3 r6 = new X.Av3
            r6.<init>(r9)
            goto L12
        La0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La8:
            r7.setText(r6)
        Lab:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OQN.LJIIJJI(com.bytedance.tux.input.TuxTextView, java.util.List, X.2kd):java.lang.Object");
    }

    public static /* synthetic */ void LJIIJ(TY7 ty7, long j, long j2, TTY tty, long j3, int i) {
        TTY tty2 = tty;
        long j4 = j3;
        if ((i & 8) != 0) {
            tty2 = null;
        }
        if ((i & 16) != 0) {
            j4 = 0;
        }
        ty7.LIZLLL(j, j2, 0, tty2, j4);
    }
}
