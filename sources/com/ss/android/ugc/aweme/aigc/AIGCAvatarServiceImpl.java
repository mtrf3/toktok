package com.ss.android.ugc.aweme.aigc;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C32151Nz;
import X.C32I;
import X.C43045Guv;
import X.C44172HVg;
import X.C44694HgQ;
import X.C51549KKz;
import X.C58096Mr6;
import X.C61878OQg;
import X.C62822Ol8;
import X.C72116SSa;
import X.C72150STi;
import X.C72151STj;
import X.C72152STk;
import X.C72153STl;
import X.C72160STs;
import X.C72161STt;
import X.C72164STw;
import X.C72167STz;
import X.C78605Ut7;
import X.EnumC244439iZ;
import X.EnumC72154STm;
import X.EnumC72156STo;
import X.H78;
import X.HVM;
import X.HVN;
import X.HVR;
import X.Q7K;
import X.ST2;
import X.ST4;
import X.ST5;
import X.STG;
import X.STO;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* loaded from: classes13.dex */
public final class AIGCAvatarServiceImpl implements IAIGCAvatarService {
    public boolean LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C72167STz.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C72161STt.LJLIL);

    public static IAIGCAvatarService LJIILL() {
        Object LIZ = C58096Mr6.LIZ(IAIGCAvatarService.class, false);
        if (LIZ != null) {
            return (IAIGCAvatarService) LIZ;
        }
        if (C58096Mr6.LLFZ == null) {
            synchronized (IAIGCAvatarService.class) {
                if (C58096Mr6.LLFZ == null) {
                    C58096Mr6.LLFZ = new AIGCAvatarServiceImpl();
                }
            }
        }
        return C58096Mr6.LLFZ;
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final int LIZIZ() {
        return Q7K.LIZIZ("aigc_creative_slow_min_count", 3);
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final int LJ() {
        return Q7K.LIZIZ("aigc_creative_slow_max_count", 10);
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final List<AIGCQuota> LJII() {
        ResponseAIGCQuotas responseAIGCQuotas;
        boolean z;
        List<Quota> list;
        String str;
        LJFF(EnumC244439iZ.SOCIAL);
        this.LIZJ.getValue().getClass();
        String str2 = null;
        C72164STw.LIZ(EnumC72154STm.AIGC_NET_GET_QUOTA, EnumC72156STo.START, null, null, null, null, 60);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Integer num = null;
        try {
            responseAIGCQuotas = C72160STs.LIZ().getAIGCQuotas().execute().LIZIZ;
        } catch (Exception e) {
            str2 = e.getMessage();
            responseAIGCQuotas = null;
        }
        if (responseAIGCQuotas != null && responseAIGCQuotas.status_code == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            EnumC72154STm enumC72154STm = EnumC72154STm.AIGC_NET_GET_QUOTA;
            EnumC72156STo enumC72156STo = EnumC72156STo.FAIL;
            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime);
            if (responseAIGCQuotas != null) {
                num = Integer.valueOf(responseAIGCQuotas.status_code);
            }
            String valueOf2 = String.valueOf(num);
            if (responseAIGCQuotas != null && (str = responseAIGCQuotas.status_msg) != null) {
                str2 = str;
            }
            C72164STw.LIZ(enumC72154STm, enumC72156STo, valueOf, null, valueOf2, str2, 8);
        } else {
            C72164STw.LIZ(EnumC72154STm.AIGC_NET_GET_QUOTA, EnumC72156STo.SUCCESS, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), null, null, null, 56);
        }
        if (responseAIGCQuotas != null && (list = responseAIGCQuotas.quotas) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (Quota quota : list) {
                quota.getClass();
                arrayList.add(new AIGCQuota(quota.quotaType, quota.quotaRemain));
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final List<AIGCStyle> getAIGCStyles() {
        ResponseAIGCStyles responseAIGCStyles;
        boolean z;
        List<ResponseAIGCStyle> list;
        Integer num;
        C72164STw.LIZ(EnumC72154STm.AIGC_NET_GET_STYLE, EnumC72156STo.START, null, null, null, null, 60);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.LIZJ.getValue().getClass();
        String str = null;
        try {
            responseAIGCStyles = C72160STs.LIZ().getAIGCStyles().execute().LIZIZ;
        } catch (Exception unused) {
            responseAIGCStyles = null;
        }
        if (responseAIGCStyles != null && responseAIGCStyles.status_code == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            EnumC72154STm enumC72154STm = EnumC72154STm.AIGC_NET_GET_STYLE;
            EnumC72156STo enumC72156STo = EnumC72156STo.FAIL;
            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime);
            if (responseAIGCStyles != null) {
                num = Integer.valueOf(responseAIGCStyles.status_code);
            } else {
                num = null;
            }
            String valueOf2 = String.valueOf(num);
            if (responseAIGCStyles != null) {
                str = responseAIGCStyles.status_msg;
            }
            C72164STw.LIZ(enumC72154STm, enumC72156STo, valueOf, null, valueOf2, str, 8);
        } else {
            C72164STw.LIZ(EnumC72154STm.AIGC_NET_GET_STYLE, EnumC72156STo.SUCCESS, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), null, null, null, 56);
        }
        if (responseAIGCStyles != null && (list = responseAIGCStyles.aigcStyles) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (ResponseAIGCStyle responseAIGCStyle : list) {
                responseAIGCStyle.getClass();
                arrayList.add(new AIGCStyle(responseAIGCStyle.name, responseAIGCStyle.styleImage, responseAIGCStyle.displayName));
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final C72152STk LIZ(String taskId) {
        o.LJIIIZ(taskId, "taskId");
        return new C72152STk(new AIGCApi(), taskId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00db, code lost:
    
        if (r2.intValue() != r1) goto L42;
     */
    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.ST8 LJFF(X.EnumC244439iZ r10) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.AIGCAvatarServiceImpl.LJFF(X.9iZ):X.ST8");
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final C72153STl LJIILIIL(JSONArray jSONArray) {
        return new C72153STl(new AIGCApi(), jSONArray);
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final void LIZJ(EnumC244439iZ business, STO processListener) {
        o.LJIIIZ(business, "business");
        o.LJIIIZ(processListener, "processListener");
        ExecutorService executor = (ExecutorService) this.LIZIZ.getValue();
        o.LJIIIIZZ(executor, "executor");
        C43045Guv.LIZ(executor, new AqS159S0200000_12(business, processListener, 9));
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final void LIZLLL(EnumC244439iZ business, STO processListener) {
        C72151STj c72151STj;
        o.LJIIIZ(business, "business");
        o.LJIIIZ(processListener, "processListener");
        List list = (List) ((LinkedHashMap) C72150STi.LIZ).get(business);
        if (list != null) {
            list.remove(processListener);
        }
        Object obj = ((LinkedHashMap) C72150STi.LIZIZ).get(business);
        if (obj == null || (c72151STj = (C72151STj) ((LinkedHashMap) C72150STi.LIZJ).get(obj)) == null) {
            return;
        }
        c72151STj.unregisterListener(processListener);
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final void LJIIIIZZ(ActivityC45651qj activityC45651qj, AqS143S0200000_12 aqS143S0200000_12) {
        C51549KKz.LIZ(activityC45651qj, aqS143S0200000_12);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e9 A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIL(X.EnumC244439iZ r6, java.lang.String r7) {
        /*
            r5 = this;
            boolean r0 = X.C72150STi.LIZ()
            if (r0 != 0) goto L8
        L6:
            r0 = 0
        L7:
            return r0
        L8:
            r4 = 0
            if (r7 == 0) goto L5d
            com.ss.android.ugc.aweme.aigc.AIGCApi r0 = X.C72150STi.LIZJ()
            r0.getClass()
            com.ss.android.ugc.aweme.aigc.ResponseDiscard r0 = com.ss.android.ugc.aweme.aigc.AIGCApi.LIZ(r7)
            int r0 = r0.discardResult
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            if (r6 == 0) goto L5a
            java.util.Map<X.9iZ, java.lang.String> r0 = X.C72150STi.LIZIZ
            r0.remove(r6)
            java.util.Map<java.lang.String, X.STj> r1 = X.C72150STi.LIZJ
            r0 = r1
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r7)
            X.STj r0 = (X.C72151STj) r0
            if (r0 == 0) goto L33
            r0.stop()
        L33:
            r1.remove(r7)
            java.util.Map<X.9iZ, java.util.List<X.STO>> r0 = X.C72150STi.LIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r6)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L5a
            java.util.Iterator r2 = r0.iterator()
        L46:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r1 = r2.next()
            X.STO r1 = (X.STO) r1
            X.ST8 r0 = X.C72150STi.LJ(r4, r4)
            r1.onUpdate(r0)
            goto L46
        L5a:
            if (r3 != 0) goto Le3
            goto L6
        L5d:
            if (r6 == 0) goto L6
            java.util.Map<X.9iZ, java.lang.String> r1 = X.C72150STi.LIZIZ
            r0 = r1
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r2 = r0.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L8d
            com.ss.android.ugc.aweme.aigc.AIGCApi r0 = X.C72150STi.LIZJ()
            r0.getClass()
            com.ss.android.ugc.aweme.aigc.ResponseAIGCTaskStatus r0 = com.ss.android.ugc.aweme.aigc.AIGCApi.LIZJ(r4)
            java.util.List<com.ss.android.ugc.aweme.aigc.AIGCTaskStatus> r0 = r0.tasks
            if (r0 == 0) goto L6
            java.lang.Object r0 = X.ORZ.LJLLLL(r0)
            com.ss.android.ugc.aweme.aigc.AIGCTaskStatus r0 = (com.ss.android.ugc.aweme.aigc.AIGCTaskStatus) r0
            if (r0 == 0) goto L6
            java.lang.String r2 = r0.taskId
            if (r2 != 0) goto L8a
            goto L6
        L8a:
            r1.put(r6, r2)
        L8d:
            com.ss.android.ugc.aweme.aigc.AIGCApi r0 = X.C72150STi.LIZJ()
            r0.getClass()
            com.ss.android.ugc.aweme.aigc.ResponseDiscard r0 = com.ss.android.ugc.aweme.aigc.AIGCApi.LIZ(r2)
            int r0 = r0.discardResult
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r1.remove(r6)
            java.util.Map<java.lang.String, X.STj> r1 = X.C72150STi.LIZJ
            r0 = r1
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r2)
            X.STj r0 = (X.C72151STj) r0
            if (r0 == 0) goto Lb1
            r0.stop()
        Lb1:
            r1.remove(r2)
            java.util.Map<X.9iZ, java.util.List<X.STO>> r0 = X.C72150STi.LIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r6)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto Ld8
            java.util.Iterator r2 = r0.iterator()
        Lc4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Ld8
            java.lang.Object r1 = r2.next()
            X.STO r1 = (X.STO) r1
            X.ST8 r0 = X.C72150STi.LJ(r4, r4)
            r1.onUpdate(r0)
            goto Lc4
        Ld8:
            if (r3 != 0) goto Ldc
            goto L6
        Ldc:
            int r0 = r3.intValue()
            if (r0 != 0) goto L6
            goto Le9
        Le3:
            int r0 = r3.intValue()
            if (r0 != 0) goto L6
        Le9:
            r0 = 1
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aigc.AIGCAvatarServiceImpl.LJIIL(X.9iZ, java.lang.String):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.6cs] */
    public static final void LJIILLIIL(final ActivityC45651qj activityC45651qj, ST2 st2, List list) {
        try {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                i++;
                final String str = (String) it.next();
                final String userName = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser().getNickname();
                o.LJIIIIZZ(userName, "userName");
                String LIZ = new Object(activityC45651qj, str, userName) { // from class: X.6cs
                    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C164476ct.LJLIL);
                    public final String LIZ;
                    public final String LIZIZ;
                    public final Context LIZJ;
                    public final int LIZLLL;
                    public final java.util.Map<Integer, View> LJ;

                    public final String LIZ() {
                        int i2;
                        View view;
                        Bitmap decodeFile = BitmapFactory.decodeFile(this.LIZ);
                        if (decodeFile == null) {
                            return null;
                        }
                        int width = decodeFile.getWidth();
                        int height = decodeFile.getHeight();
                        if (width > height) {
                            i2 = height;
                        } else {
                            i2 = width;
                        }
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(Bitmap.createBitmap(decodeFile, (width - i2) / 2, (height - i2) / 2, i2, i2), 750, 750, true);
                        o.LJIIIIZZ(createScaledBitmap, "createScaledBitmap(cropBitmap, 750, 750, true)");
                        int width2 = createScaledBitmap.getWidth();
                        if (((LinkedHashMap) this.LJ).get(Integer.valueOf(width2)) != null) {
                            Object obj = ((LinkedHashMap) this.LJ).get(Integer.valueOf(width2));
                            if (obj != null) {
                                view = (View) obj;
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        } else {
                            RelativeLayout relativeLayout = new RelativeLayout(this.LIZJ);
                            Context context = relativeLayout.getContext();
                            o.LJIIIIZZ(context, "context");
                            Integer LJI = C79045V0n.LJI(R.attr.cr, context);
                            if (LJI != null) {
                                relativeLayout.setBackgroundColor(LJI.intValue());
                            }
                            relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(width2, relativeLayout.getHeight()));
                            TuxIconView tuxIconView = new TuxIconView(this.LIZJ, null, 0, 6, null);
                            C2068389v c2068389v = new C2068389v();
                            c2068389v.LIZ = R.raw.icon_color_ai;
                            tuxIconView.setTuxIcon(c2068389v);
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(28, 28);
                            layoutParams.setMargins(16, 16, 0, 16);
                            layoutParams.addRule(20);
                            tuxIconView.setLayoutParams(layoutParams);
                            tuxIconView.setId(R.id.zx);
                            relativeLayout.addView(tuxIconView);
                            ImageView imageView = new ImageView(this.LIZJ);
                            imageView.setAdjustViewBounds(true);
                            imageView.setImageResource(R.drawable.pq);
                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, 18);
                            layoutParams2.setMargins(8, 21, 0, 21);
                            layoutParams2.addRule(17, R.id.zx);
                            imageView.setLayoutParams(layoutParams2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            relativeLayout.addView(imageView);
                            TuxTextView tuxTextView = new TuxTextView(this.LIZJ, null, 6, 0);
                            tuxTextView.setTextColorRes(R.attr.go);
                            tuxTextView.setTuxFont(62);
                            Context context2 = tuxTextView.getContext();
                            o.LJIIIIZZ(context2, "context");
                            tuxTextView.LJJJ(C74275TDb.LJII(context2, 22.0f));
                            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                            layoutParams3.setMargins(0, 0, 17, 0);
                            layoutParams3.addRule(21);
                            layoutParams3.addRule(15);
                            tuxTextView.setLayoutParams(layoutParams3);
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append('@');
                            LIZ2.append(this.LIZIZ);
                            tuxTextView.setText(X1D.LIZIZ(LIZ2));
                            relativeLayout.addView(tuxTextView);
                            relativeLayout.measure(View.MeasureSpec.makeMeasureSpec(width2, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LIZLLL, 1073741824));
                            relativeLayout.layout(0, 0, width2, this.LIZLLL);
                            this.LJ.put(Integer.valueOf(width2), relativeLayout);
                            view = relativeLayout;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(width2, createScaledBitmap.getHeight() + 60, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        canvas.drawBitmap(createScaledBitmap, 0.0f, 0.0f, (Paint) null);
                        Paint paint = new Paint();
                        paint.setAntiAlias(true);
                        paint.setFilterBitmap(true);
                        paint.setDither(true);
                        Bitmap bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmap);
                        C37203Eit.LIZJ.getClass();
                        C39214FaE.LIZ(view, canvas2);
                        canvas2.drawBitmap(bitmap, new Matrix(), paint);
                        o.LJIIIIZZ(bitmap, "bitmap");
                        canvas.drawBitmap(bitmap, 0.0f, createScaledBitmap.getHeight(), (Paint) null);
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(((H8C) LJFF.getValue()).LJ);
                        String str2 = File.separator;
                        C1DI.LIZIZ(LIZ3, str2, "AIGC", str2);
                        LIZ3.append(this.LIZ.hashCode());
                        LIZ3.append(".png");
                        String LIZIZ = X1D.LIZIZ(LIZ3);
                        if (!TextUtils.isEmpty(LIZIZ)) {
                            File file = new File(LIZIZ);
                            if (!file.exists()) {
                                try {
                                    File parentFile = file.getParentFile();
                                    if (!parentFile.exists()) {
                                        parentFile.mkdirs();
                                    }
                                    file.createNewFile();
                                } catch (IOException e) {
                                    C16880lQ.LLLLIIL(e);
                                }
                            }
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(LIZIZ);
                        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return LIZIZ;
                    }

                    {
                        o.LJIIIZ(str, "localUri");
                        o.LJIIIZ(activityC45651qj, "context");
                        this.LIZ = str;
                        this.LIZIZ = userName;
                        this.LIZJ = activityC45651qj;
                        this.LIZLLL = 60;
                        this.LJ = new LinkedHashMap();
                    }
                }.LIZ();
                if (LIZ != null) {
                    C44694HgQ.LJJI(activityC45651qj, LIZ, new File(LIZ).getName(), false, null, 48);
                    if (st2 != null) {
                        st2.LIZ(ST4.IN_PROGRESS, Integer.valueOf(i));
                    }
                } else {
                    throw new RuntimeException("");
                }
            }
        } catch (Exception unused) {
            if (st2 != null) {
                st2.LIZ(ST4.FAIL, -1);
            } else {
                return;
            }
        }
        if (st2 != null) {
            st2.LIZ(ST4.SUCCESS, Integer.valueOf(list.size()));
        }
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final C72151STj LJIIJ(EnumC244439iZ business, String str, STG stg) {
        o.LJIIIZ(business, "business");
        try {
            return C72150STi.LIZLLL(business, str, stg);
        } catch (Exception e) {
            H78.LIZJ("AIGC retrySlowGenerateTask fail");
            H78.LJ(e);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final void LJIIJJI(ActivityC45651qj activity, C72116SSa c72116SSa, List list) {
        o.LJIIIZ(activity, "activity");
        c72116SSa.LIZ(ST4.IN_PROGRESS, 0);
        if (Build.VERSION.SDK_INT < 29 && !C78605Ut7.LJFF("android.permission.WRITE_EXTERNAL_STORAGE")) {
            HVR.LJII(activity, new ST5(activity, c72116SSa, list), null, new TokenCert("bpea-tools_request_aigc_download_avatar"), 28);
        } else {
            LJIILLIIL(activity, c72116SSa, list);
        }
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final C72151STj LJIIIZ(EnumC244439iZ business, JSONArray jSONArray, JSONArray jSONArray2, STG stg) {
        o.LJIIIZ(business, "business");
        try {
            return C72150STi.LIZIZ(business, jSONArray, jSONArray2, stg);
        } catch (Exception e) {
            H78.LIZJ("AIGC createSlowGenerateTask fail");
            H78.LJ(e);
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final void LJIILJJIL(ActivityC45651qj activityC45651qj, EnumC244439iZ business, String str, String str2, boolean z) {
        o.LJIIIZ(business, "business");
        if (!this.LIZ) {
            C44172HVg.LIZLLL(C32151Nz.LJIILJJIL());
            this.LIZ = true;
        }
        C51549KKz.LIZ(activityC45651qj, new HVM(activityC45651qj, business, str2, str, z));
    }

    @Override // com.ss.android.ugc.aweme.aigc.IAIGCAvatarService
    public final void LJI(EnumC244439iZ business, ActivityC45651qj activity, Integer num, Integer num2, boolean z, String str, String str2) {
        int LIZIZ;
        int LIZIZ2;
        o.LJIIIZ(business, "business");
        o.LJIIIZ(activity, "activity");
        if (!this.LIZ) {
            C44172HVg.LIZLLL(C32151Nz.LJIILJJIL());
            this.LIZ = true;
        }
        if (num != null) {
            LIZIZ = num.intValue();
        } else {
            LIZIZ = Q7K.LIZIZ("aigc_creative_slow_min_count", 3);
        }
        if (num2 != null) {
            LIZIZ2 = num2.intValue();
        } else {
            LIZIZ2 = Q7K.LIZIZ("aigc_creative_slow_max_count", 10);
        }
        C51549KKz.LIZ(activity, new HVN(LIZIZ, LIZIZ2, activity, business, str2, str, z));
    }
}
