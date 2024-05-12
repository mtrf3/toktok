package X;

import Y.ACallableS105S0100000_2;
import Y.ACallableS110S0100000_7;
import Y.AgS120S0100000_2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.port.internal.IMediaCacheService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedInitParam;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hsz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45473Hsz implements InterfaceC45480Ht6 {
    public final ShortVideoContext LIZ;
    public int LIZIZ;
    public C45474Ht0 LIZJ;
    public AbstractC43973HNp LIZLLL;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public Drawable LJIILIIL;
    public Drawable LJIILJJIL;
    public String LJIILL;
    public InterfaceC43977HNt LJIILLIIL;
    public InterfaceC45535Htz LJIIZILJ;
    public InterfaceC45289Hq1 LJIJ;
    public InterfaceC88472Yns<? super ArrayList<MyMediaModel>, C76800UCe> LJIJI;
    public String LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public ArrayList<CutSameVideoImageExtraData> LJJIFFI;
    public boolean LJJII;
    public AbstractC45488HtE LJJIII;
    public AbstractC45488HtE LJJIIJ;
    public AbstractC45488HtE LJJIIJZLJL;
    public TM0 LJJIIZ;
    public int LJJIJIIJI;
    public int LJJIJIL;
    public boolean LJJIJL;
    public ChooseMediaViewModel LJJIJLIJ;
    public boolean LJJIL;
    public boolean LJJIZ;
    public boolean LJJJ;
    public boolean LJJJI;
    public InterfaceC82683Wch LJJJJ;
    public ArrayList<MyMediaModel> LJ = new ArrayList<>();
    public boolean LJIJJ = true;
    public int LJIJJLI = -1;
    public int LJJIIZI = 1;
    public int LJJIJ = 1;
    public List<String> LJJIJIIJIL = new ArrayList();
    public boolean LJJJIL = true;
    public final C45548HuC LJJJJI = new C45548HuC();

    public final void LIZ() {
        Iterator<MyMediaModel> it = this.LJ.iterator();
        while (it.hasNext()) {
            MyMediaModel next = it.next();
            if (C44694HgQ.LJIJI(next.fileLocalUriPath, false)) {
                next.duration = 3000L;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (r1 <= (r3 * 2.4d)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r3 <= (r5 * 2.4d)) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r12 = this;
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel> r0 = r12.LJ
            java.util.Iterator r11 = r0.iterator()
        L6:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r8 = r11.next()
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r8 = (com.ss.android.ugc.aweme.mediachoose.helper.MediaModel) r8
            java.lang.String r1 = r8.fileLocalUriPath
            r0 = 0
            boolean r0 = X.C44694HgQ.LJIJI(r1, r0)
            if (r0 == 0) goto L6
            r0 = 3000(0xbb8, double:1.482E-320)
            r8.duration = r0
            X.Ol8 r0 = X.C45666Hw6.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L6
            boolean r0 = X.C42117Gfx.LIZLLL()
            r9 = 4612586738352862003(0x4003333333333333, double:2.4)
            if (r0 == 0) goto L68
            int r7 = r8.width
            double r3 = (double) r7
            int r0 = r8.height
            double r1 = (double) r0
            double r5 = r1 * r9
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L49
            double r3 = r3 * r9
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L68
        L49:
            r8.width = r7
            boolean r0 = X.C42117Gfx.LIZLLL()
            if (r0 == 0) goto L65
            int r0 = r8.width
            double r5 = (double) r0
            int r7 = r8.height
            double r3 = (double) r7
            double r1 = r3 * r9
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L62
            double r5 = r5 * r9
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L65
        L62:
            r8.height = r7
            goto L6
        L65:
            r7 = 1280(0x500, float:1.794E-42)
            goto L62
        L68:
            r7 = 720(0x2d0, float:1.009E-42)
            goto L49
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45473Hsz.LIZIZ():void");
    }

    @Override // X.InterfaceC45480Ht6
    public final View LJII() {
        C45474Ht0 c45474Ht0 = this.LIZJ;
        if (c45474Ht0 != null) {
            return c45474Ht0.getSureTextView();
        }
        o.LJIJI("videoImageMixedView");
        throw null;
    }

    @Override // X.InterfaceC45480Ht6
    public final ArrayList<MyMediaModel> LJIIJ() {
        AbstractC43973HNp abstractC43973HNp = this.LIZLLL;
        if (abstractC43973HNp != null) {
            return LIZLLL(abstractC43973HNp.LJLIL);
        }
        o.LJIJI("videoImageMixedAdapter");
        throw null;
    }

    @Override // X.InterfaceC45480Ht6
    public final int LJIIL() {
        AbstractC43973HNp abstractC43973HNp = this.LIZLLL;
        if (abstractC43973HNp != null) {
            return abstractC43973HNp.LJZI();
        }
        o.LJIJI("videoImageMixedAdapter");
        throw null;
    }

    @Override // X.InterfaceC45480Ht6
    public final C71897SJp LJIILLIIL() {
        C45474Ht0 c45474Ht0 = this.LIZJ;
        if (c45474Ht0 != null) {
            return c45474Ht0.getMultiSelectCheckBox();
        }
        o.LJIJI("videoImageMixedView");
        throw null;
    }

    @Override // X.InterfaceC45480Ht6
    public final CutSameVideoImageExtraData LJJIFFI() {
        AbstractC43973HNp abstractC43973HNp = this.LIZLLL;
        if (abstractC43973HNp != null) {
            return abstractC43973HNp.LLD();
        }
        o.LJIJI("videoImageMixedAdapter");
        throw null;
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJJIII() {
        C45474Ht0 c45474Ht0 = this.LIZJ;
        if (c45474Ht0 != null) {
            SY4 sy4 = c45474Ht0.LJLJLJ;
            if (sy4 != null) {
                sy4.performClick();
                return;
            }
            return;
        }
        o.LJIJI("videoImageMixedView");
        throw null;
    }

    public final CreativeInfo LJJIIJ() {
        CreativeInfo creativeInfo;
        ShortVideoContext shortVideoContext = this.LIZ;
        if (shortVideoContext == null || (creativeInfo = shortVideoContext.creativeInfo) == null) {
            return new CreativeInfo(null, 0, null, 7, null);
        }
        return creativeInfo;
    }

    public final MyMediaModel LJJIIZ() {
        MyMediaModel myMediaModel;
        Iterator<MyMediaModel> it = this.LJ.iterator();
        while (true) {
            if (it.hasNext()) {
                myMediaModel = it.next();
                if (myMediaModel.LJ()) {
                    break;
                }
            } else {
                myMediaModel = null;
                break;
            }
        }
        return myMediaModel;
    }

    public final boolean LJJIIZI() {
        if (this.LJIJJLI == 29 && HRX.LIZ() == 0) {
            return true;
        }
        return false;
    }

    public final boolean LJJIJIIJI() {
        if (this.LJIJJLI == 10) {
            return true;
        }
        return false;
    }

    public final boolean LJJIJIIJIL() {
        if (this.LJIJJLI == 1) {
            return true;
        }
        return false;
    }

    public final boolean LJJIJIL() {
        if (this.LJIJJLI == 20) {
            return true;
        }
        return false;
    }

    public final boolean LJJIJL() {
        if (this.LJIJJLI == 24) {
            return true;
        }
        return false;
    }

    public final void LJJIJLIJ() {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.LIZIZ;
        ShortVideoContext shortVideoContext = this.LIZ;
        if (shortVideoContext != null && shortVideoContext.LJJIIZ()) {
            z = true;
        } else {
            z = false;
        }
        boolean LIZIZ = C44703HgZ.LIZIZ(i, z);
        if (!LIZIZ && !C43818HHq.LIZ(this.LIZIZ, Integer.valueOf(this.LJIJJLI))) {
            return;
        }
        int i2 = this.LIZIZ;
        int size = this.LJ.size();
        ShortVideoContext shortVideoContext2 = this.LIZ;
        if (shortVideoContext2 != null && shortVideoContext2.LJJIIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C44703HgZ.LIZIZ(i2, z2) && size >= 1 && LIZIZ) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            C45161Hnx.LIZIZ(null);
        }
        if (C43818HHq.LIZJ(this.LJ, null)) {
            C43819HHr.LIZ.getClass();
            if (!C43819HHr.LIZ()) {
                C43820HHs.LIZ.getClass();
                if (!C43820HHs.LIZ() || LIZIZ) {
                    if (C43820HHs.LIZ()) {
                        C45474Ht0 c45474Ht0 = this.LIZJ;
                        if (c45474Ht0 != null) {
                            c45474Ht0.LJFF(z3, false);
                            C45474Ht0 c45474Ht02 = this.LIZJ;
                            if (c45474Ht02 != null) {
                                c45474Ht02.LJI();
                                C45474Ht0 c45474Ht03 = this.LIZJ;
                                if (c45474Ht03 != null) {
                                    c45474Ht03.LJIIIIZZ(true);
                                    C45474Ht0 c45474Ht04 = this.LIZJ;
                                    if (c45474Ht04 != null) {
                                        c45474Ht04.LJIIIZ(false);
                                        return;
                                    } else {
                                        o.LJIJI("videoImageMixedView");
                                        throw null;
                                    }
                                }
                                o.LJIJI("videoImageMixedView");
                                throw null;
                            }
                            o.LJIJI("videoImageMixedView");
                            throw null;
                        }
                        o.LJIJI("videoImageMixedView");
                        throw null;
                    }
                }
            }
            C45474Ht0 c45474Ht05 = this.LIZJ;
            if (c45474Ht05 != null) {
                C45765Hxh autoCutBtn = c45474Ht05.getAutoCutBtn();
                if (autoCutBtn != null) {
                    autoCutBtn.LIZJ();
                }
                C45474Ht0 c45474Ht06 = this.LIZJ;
                if (c45474Ht06 != null) {
                    c45474Ht06.LJI();
                    return;
                } else {
                    o.LJIJI("videoImageMixedView");
                    throw null;
                }
            }
            o.LJIJI("videoImageMixedView");
            throw null;
        }
        C45474Ht0 c45474Ht07 = this.LIZJ;
        if (c45474Ht07 != null) {
            C58C editorProBtn = c45474Ht07.getEditorProBtn();
            if (editorProBtn != null && editorProBtn.getVisibility() == 0) {
                C45474Ht0 c45474Ht08 = this.LIZJ;
                if (c45474Ht08 != null) {
                    C58C editorProBtn2 = c45474Ht08.getEditorProBtn();
                    if (editorProBtn2 != null) {
                        editorProBtn2.setVisibility(8);
                    }
                    C45474Ht0 c45474Ht09 = this.LIZJ;
                    if (c45474Ht09 != null) {
                        c45474Ht09.LJIIIIZZ(false);
                        C45474Ht0 c45474Ht010 = this.LIZJ;
                        if (c45474Ht010 != null) {
                            c45474Ht010.LJIIIZ(true);
                            C45474Ht0 c45474Ht011 = this.LIZJ;
                            if (c45474Ht011 != null) {
                                c45474Ht011.LJFF(z3, false);
                            } else {
                                o.LJIJI("videoImageMixedView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("videoImageMixedView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("videoImageMixedView");
                        throw null;
                    }
                } else {
                    o.LJIJI("videoImageMixedView");
                    throw null;
                }
            } else {
                C45474Ht0 c45474Ht012 = this.LIZJ;
                if (c45474Ht012 != null) {
                    c45474Ht012.LJFF(z3, true);
                } else {
                    o.LJIJI("videoImageMixedView");
                    throw null;
                }
            }
            C45474Ht0 c45474Ht013 = this.LIZJ;
            if (c45474Ht013 != null) {
                C45765Hxh autoCutBtn2 = c45474Ht013.getAutoCutBtn();
                if (autoCutBtn2 != null) {
                    autoCutBtn2.post(new RunnableC45482Ht8(z3, this, autoCutBtn2));
                    return;
                }
                return;
            }
            o.LJIJI("videoImageMixedView");
            throw null;
        }
        o.LJIJI("videoImageMixedView");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x01d9, code lost:
    
        if (r7 >= r17.LJJIJ) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x01db, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0223, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x021e, code lost:
    
        if (r7 == r17.LJJIJ) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        if (r0 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009a, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0064, code lost:
    
        if (r0 != null) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL() {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45473Hsz.LJJIL():void");
    }

    public final void LJJIZ() {
        this.LJ.clear();
        AbstractC43973HNp abstractC43973HNp = this.LIZLLL;
        if (abstractC43973HNp != null) {
            abstractC43973HNp.LJLIL.clear();
            AbstractC43973HNp abstractC43973HNp2 = this.LIZLLL;
            if (abstractC43973HNp2 != null) {
                abstractC43973HNp2.notifyDataSetChanged();
                C45474Ht0 c45474Ht0 = this.LIZJ;
                if (c45474Ht0 != null) {
                    c45474Ht0.LJII(false);
                    C45474Ht0 c45474Ht02 = this.LIZJ;
                    if (c45474Ht02 != null) {
                        TextView sureTextView = c45474Ht02.getSureTextView();
                        if (sureTextView != null) {
                            C45474Ht0 c45474Ht03 = this.LIZJ;
                            if (c45474Ht03 != null) {
                                sureTextView.setText(c45474Ht03.getContext().getString(R.string.ipo));
                            } else {
                                o.LJIJI("videoImageMixedView");
                                throw null;
                            }
                        }
                        LIZJ(false);
                        LJJIJLIJ();
                        return;
                    }
                    o.LJIJI("videoImageMixedView");
                    throw null;
                }
                o.LJIJI("videoImageMixedView");
                throw null;
            }
            o.LJIJI("videoImageMixedAdapter");
            throw null;
        }
    }

    public final void LJJJ() {
        Iterator<MyMediaModel> it = this.LJ.iterator();
        int i = 1;
        while (it.hasNext()) {
            MyMediaModel next = it.next();
            next.selectIndex = i;
            if (this.LJJIZ) {
                next.mediaIndex = i - 1;
            }
            i++;
        }
    }

    public final void LJJJJ() {
        ArrayList<CutSameVideoImageExtraData> arrayList = this.LJJIFFI;
        if (arrayList != null) {
            Iterator<CutSameVideoImageExtraData> it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                CutSameVideoImageExtraData next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    CutSameVideoImageExtraData cutSameVideoImageExtraData = next;
                    AbstractC43973HNp abstractC43973HNp = this.LIZLLL;
                    if (abstractC43973HNp != null) {
                        Object obj = ListProtector.get(abstractC43973HNp.LJLIL, i);
                        o.LJIIIIZZ(obj, "videoImageMixedAdapter.getMediaList()[index]");
                        MediaModel mediaModel = (MediaModel) obj;
                        if (LJJIJIL()) {
                            mediaModel.startTime = 0;
                            mediaModel.endTime = (int) cutSameVideoImageExtraData.extraDuration;
                        } else if (LJJIJL()) {
                            int i3 = mediaModel.startTime;
                            if (i3 < 0) {
                                i3 = 0;
                            }
                            mediaModel.startTime = i3;
                            int i4 = mediaModel.endTime;
                            int i5 = (int) cutSameVideoImageExtraData.extraDuration;
                            if (i4 < i5) {
                                i4 = i5;
                            }
                            mediaModel.endTime = i4;
                        }
                        if (mediaModel.LJ()) {
                            mediaModel.duration = 3000L;
                            mediaModel.width = 720;
                            mediaModel.height = 1280;
                        } else {
                            long j = mediaModel.duration;
                            long j2 = (int) j;
                            long j3 = cutSameVideoImageExtraData.extraDuration;
                            if (j2 < j3 && ((int) j3) != 0) {
                                mediaModel.speed = ((((float) j) * 1.0f) / ((float) j3)) * 1.0f;
                            }
                        }
                        i = i2;
                    } else {
                        o.LJIJI("videoImageMixedAdapter");
                        throw null;
                    }
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    @Override // X.InterfaceC45480Ht6
    public final void onPause() {
        C45474Ht0 c45474Ht0 = this.LIZJ;
        if (c45474Ht0 != null) {
            C45765Hxh autoCutBtn = c45474Ht0.getAutoCutBtn();
            if (autoCutBtn != null) {
                autoCutBtn.LIZ();
            }
            InterfaceC82683Wch interfaceC82683Wch = this.LJJJJ;
            if (interfaceC82683Wch != null) {
                interfaceC82683Wch.dismiss();
                return;
            }
            return;
        }
        o.LJIJI("videoImageMixedView");
        throw null;
    }

    @Override // X.InterfaceC45480Ht6
    public final ArrayList<MyMediaModel> LJIIIZ() {
        return LJJIIJZLJL();
    }

    public final ArrayList<MyMediaModel> LJJIIJZLJL() {
        if (LJJIJIIJI() || LJJIJIL() || LJJIJL() || LJJIIZI()) {
            AbstractC43973HNp abstractC43973HNp = this.LIZLLL;
            if (abstractC43973HNp != null) {
                return abstractC43973HNp.LJLIL;
            }
            o.LJIJI("videoImageMixedAdapter");
            throw null;
        }
        return this.LJ;
    }

    @Override // X.InterfaceC45480Ht6
    public final List<MyMediaModel> LJI() {
        return this.LJ;
    }

    public static ArrayList LIZLLL(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MediaModel mediaModel = (MediaModel) it.next();
            if (mediaModel != null && (!TextUtils.isEmpty(mediaModel.fileLocalUriPath) || !TextUtils.isEmpty(mediaModel.thumbnail))) {
                arrayList2.add(mediaModel);
            }
        }
        return arrayList2;
    }

    public static boolean LJJIJ(List list) {
        if (C77413UZt.LJIILL(list)) {
            return false;
        }
        o.LJI(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaModel mediaModel = (MediaModel) it.next();
            if (mediaModel.LJI() && !C30581Hy.LIZJ(mediaModel)) {
                return true;
            }
        }
        return false;
    }

    public final void LIZJ(boolean z) {
        this.LJJIJL = z;
        C45474Ht0 c45474Ht0 = this.LIZJ;
        Drawable drawable = null;
        if (c45474Ht0 != null) {
            if (z) {
                SY4 sy4 = c45474Ht0.LJLJLJ;
                if (sy4 != null) {
                    sy4.setEnabled(true);
                }
                TextView textView = c45474Ht0.LJLJJLL;
                if (textView != null) {
                    textView.setTextColor(-1);
                }
                TextView textView2 = c45474Ht0.LJLJJLL;
                if (textView2 != null) {
                    VideoImageMixedInitParam videoImageMixedInitParam = c45474Ht0.LJLJI;
                    if (videoImageMixedInitParam != null) {
                        drawable = videoImageMixedInitParam.getClickableDrawable();
                    }
                    textView2.setBackground(drawable);
                }
                TextView textView3 = c45474Ht0.LJLJJLL;
                if (textView3 == null) {
                    return;
                }
                textView3.setAlpha(1.0f);
                return;
            }
            SY4 sy42 = c45474Ht0.LJLJLJ;
            if (sy42 != null) {
                sy42.setEnabled(false);
            }
            VideoImageMixedInitParam videoImageMixedInitParam2 = c45474Ht0.LJLJI;
            if (videoImageMixedInitParam2 != null && videoImageMixedInitParam2.isUgcTemplate()) {
                TextView textView4 = c45474Ht0.LJLJJLL;
                if (textView4 != null) {
                    VideoImageMixedInitParam videoImageMixedInitParam3 = c45474Ht0.LJLJI;
                    if (videoImageMixedInitParam3 != null) {
                        drawable = videoImageMixedInitParam3.getClickableDrawable();
                    }
                    textView4.setBackground(drawable);
                }
                TextView textView5 = c45474Ht0.LJLJJLL;
                if (textView5 != null) {
                    textView5.setTextColor(-1);
                }
                TextView textView6 = c45474Ht0.LJLJJLL;
                if (textView6 == null) {
                    return;
                }
                textView6.setAlpha(0.34f);
                return;
            }
            TextView textView7 = c45474Ht0.LJLJJLL;
            if (textView7 != null) {
                VideoImageMixedInitParam videoImageMixedInitParam4 = c45474Ht0.LJLJI;
                if (videoImageMixedInitParam4 != null) {
                    drawable = videoImageMixedInitParam4.getUnClickableDrawable();
                }
                textView7.setBackground(drawable);
            }
            Context context = c45474Ht0.getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.gp, context);
            if (LJI != null) {
                int intValue = LJI.intValue();
                TextView textView8 = c45474Ht0.LJLJJLL;
                if (textView8 != null) {
                    textView8.setTextColor(intValue);
                }
            }
            TextView textView9 = c45474Ht0.LJLJJLL;
            if (textView9 == null) {
                return;
            }
            textView9.setAlpha(1.0f);
            return;
        }
        o.LJIJI("videoImageMixedView");
        throw null;
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJ(View view) {
        String str;
        boolean z;
        AbstractC43973HNp c41259GHf;
        boolean z2;
        String str2;
        String str3;
        int i;
        int i2;
        boolean z3;
        boolean z4;
        C45474Ht0 c45474Ht0 = (C45474Ht0) view;
        this.LIZJ = c45474Ht0;
        Context context = c45474Ht0.getContext();
        o.LJIIIIZZ(context, "contentView.context");
        this.LJIILIIL = C44729Hgz.LJIILIIL(context, true, LJJIJL());
        Context context2 = c45474Ht0.getContext();
        o.LJIIIIZZ(context2, "contentView.context");
        this.LJIILJJIL = C44729Hgz.LJIILIIL(context2, false, LJJIJL());
        ShortVideoContext shortVideoContext = this.LIZ;
        if (shortVideoContext != null) {
            str = shortVideoContext.shootWay;
        } else {
            str = null;
        }
        if (o.LJ(str, "duet") && C43710HDm.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (i2 = this.LIZIZ) != 32 && i2 != 34) {
            C45474Ht0 c45474Ht02 = this.LIZJ;
            if (c45474Ht02 != null) {
                ShortVideoContext shortVideoContext2 = this.LIZ;
                if (shortVideoContext2 != null && shortVideoContext2.LJJIIZ()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean LIZIZ = C44703HgZ.LIZIZ(i2, z3);
                boolean LIZ = C43818HHq.LIZ(this.LIZIZ, Integer.valueOf(this.LJIJJLI));
                boolean LJJIJIL = LJJIJIL();
                boolean LJJIJL = LJJIJL();
                if (this.LJIJJLI == 25) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Drawable drawable = this.LJIILIIL;
                if (drawable != null) {
                    Drawable drawable2 = this.LJIILJJIL;
                    if (drawable2 != null) {
                        c45474Ht02.LIZJ(new VideoImageMixedInitParam(LIZIZ, LIZ, LJJIJIL, LJJIJL, z4, drawable, drawable2));
                    } else {
                        o.LJIJI("unClickDrawable");
                        throw null;
                    }
                } else {
                    o.LJIJI("clickDrawable");
                    throw null;
                }
            } else {
                o.LJIJI("videoImageMixedView");
                throw null;
            }
        }
        C45474Ht0 c45474Ht03 = this.LIZJ;
        if (c45474Ht03 != null) {
            c45474Ht03.setVisibility(0);
            if (LJJIJIIJI()) {
                c41259GHf = new C43968HNk(EnumC45530Htu.LIGHT);
            } else if (LJJIJIL()) {
                c41259GHf = new C43969HNl(EnumC45530Htu.LIGHT);
            } else if (LJJIJL()) {
                c41259GHf = new C43967HNj(EnumC45530Htu.LIGHT);
            } else if (LJJIIZI()) {
                c41259GHf = new C43969HNl(EnumC45530Htu.LIGHT);
            } else {
                c41259GHf = new C41259GHf(Integer.valueOf(R.color.bc));
            }
            this.LIZLLL = c41259GHf;
            c41259GHf.LJLJLJ = new AqS157S0100000_7(this, 1);
            C45474Ht0 c45474Ht04 = this.LIZJ;
            if (c45474Ht04 != null) {
                c45474Ht04.setVisibility(0);
                C45474Ht0 c45474Ht05 = this.LIZJ;
                if (c45474Ht05 != null) {
                    c45474Ht05.LIZLLL();
                    C45474Ht0 c45474Ht06 = this.LIZJ;
                    if (c45474Ht06 != null) {
                        int i3 = this.LIZIZ;
                        ShortVideoContext shortVideoContext3 = this.LIZ;
                        if (shortVideoContext3 != null && shortVideoContext3.LJJIIZ()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        boolean LIZIZ2 = C44703HgZ.LIZIZ(i3, z2);
                        boolean LIZ2 = C43818HHq.LIZ(this.LIZIZ, Integer.valueOf(this.LJIJJLI));
                        ViewStub viewStub = (ViewStub) c45474Ht06.findViewById(R.id.nc7);
                        if (viewStub != null) {
                            viewStub.inflate();
                        }
                        View findViewById = c45474Ht06.findViewById(R.id.ggm);
                        o.LJI(findViewById);
                        RecyclerView recyclerView = (RecyclerView) findViewById;
                        c45474Ht06.LJLJJL = recyclerView;
                        Context context3 = c45474Ht06.getContext();
                        o.LJIIIIZZ(context3, "context");
                        recyclerView.setLayoutManager(new TPZ(context3));
                        C40171ht c40171ht = new C40171ht();
                        c40171ht.LIZJ = 0L;
                        c40171ht.LJ = 250L;
                        c40171ht.LIZLLL = 0L;
                        c40171ht.LJFF = 250L;
                        RecyclerView recyclerView2 = c45474Ht06.LJLJJL;
                        if (recyclerView2 != null) {
                            recyclerView2.setItemAnimator(c40171ht);
                            if (LIZIZ2 || LIZ2) {
                                int LIZ3 = (int) C170576mj.LIZ(c45474Ht06.getContext(), 10.0f);
                                RecyclerView recyclerView3 = c45474Ht06.LJLJJL;
                                if (recyclerView3 != null) {
                                    int paddingTop = recyclerView3.getPaddingTop();
                                    RecyclerView recyclerView4 = c45474Ht06.LJLJJL;
                                    if (recyclerView4 != null) {
                                        recyclerView3.setPadding(LIZ3, paddingTop, LIZ3, recyclerView4.getPaddingBottom() / 3);
                                    } else {
                                        o.LJIJI("mediaSelectRecyclerView");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("mediaSelectRecyclerView");
                                    throw null;
                                }
                            }
                            C45474Ht0 c45474Ht07 = this.LIZJ;
                            if (c45474Ht07 != null) {
                                RecyclerView mediaSelectRecyclerView = c45474Ht07.getMediaSelectRecyclerView();
                                AbstractC43973HNp abstractC43973HNp = this.LIZLLL;
                                if (abstractC43973HNp != null) {
                                    mediaSelectRecyclerView.setAdapter(abstractC43973HNp);
                                    String string = view.getContext().getResources().getString(R.string.ips);
                                    o.LJIIIIZZ(string, "contentView.getContext()…ing.next_step_with_count)");
                                    this.LJFF = string;
                                    String string2 = view.getContext().getResources().getString(R.string.pvq);
                                    o.LJIIIIZZ(string2, "contentView.getContext()…record_choose_photo_sure)");
                                    this.LJI = string2;
                                    String string3 = view.getContext().getResources().getString(R.string.i_n);
                                    o.LJIIIIZZ(string3, "contentView.getContext()…ect_button_done_selected)");
                                    this.LJII = string3;
                                    String string4 = view.getContext().getResources().getString(R.string.g4a);
                                    o.LJIIIIZZ(string4, "contentView.getContext()…dpro_feature_replace_btn)");
                                    this.LJIIIIZZ = string4;
                                    Context context4 = c45474Ht0.getContext();
                                    o.LJIIIIZZ(context4, "contentView.context");
                                    boolean z5 = true;
                                    this.LJIILIIL = C44729Hgz.LJIILIIL(context4, true, LJJIJL());
                                    Context context5 = c45474Ht0.getContext();
                                    o.LJIIIIZZ(context5, "contentView.context");
                                    this.LJIILJJIL = C44729Hgz.LJIILIIL(context5, false, LJJIJL());
                                    String string5 = view.getContext().getResources().getString(R.string.ey);
                                    o.LJIIIIZZ(string5, "contentView.getContext()…Selected_plusDescription)");
                                    this.LJIIIZ = string5;
                                    String string6 = view.getContext().getResources().getString(R.string.ex);
                                    o.LJIIIIZZ(string6, "contentView.getContext()…Selected_liteDescription)");
                                    this.LJIIJ = string6;
                                    String string7 = view.getContext().getResources().getString(R.string.f0);
                                    o.LJIIIIZZ(string7, "contentView.getContext()…ectPhoto_plusDescription)");
                                    this.LJIIJJI = string7;
                                    String string8 = view.getContext().getResources().getString(R.string.ez);
                                    o.LJIIIIZZ(string8, "contentView.getContext()…ectPhoto_liteDescription)");
                                    this.LJIIL = string8;
                                    C45474Ht0 c45474Ht08 = this.LIZJ;
                                    if (c45474Ht08 != null) {
                                        c45474Ht08.LJ(this.LJIILL, LJJIJIIJIL());
                                        LJJIL();
                                        LJJIJLIJ();
                                        if (this.LJIJJLI != 18) {
                                            z5 = false;
                                        }
                                        if (!this.LJJII && !z5 && !C60903NvH.LJIIJJI().getPublishService().LJJIFFI()) {
                                            C43117Gw5 c43117Gw5 = C43117Gw5.LIZ;
                                            CreativeInfo LJJIIJ = LJJIIJ();
                                            c43117Gw5.getClass();
                                            if (C45771Hxn.LIZIZ) {
                                                C10K.LIZJ(new ACallableS110S0100000_7(LJJIIJ, 1));
                                            }
                                        }
                                        if (LJJIJIIJI()) {
                                            AbstractC43973HNp abstractC43973HNp2 = this.LIZLLL;
                                            if (abstractC43973HNp2 != null) {
                                                abstractC43973HNp2.LJLZ(this.LJJIIZI, 0);
                                                AbstractC43973HNp abstractC43973HNp3 = this.LIZLLL;
                                                if (abstractC43973HNp3 != null) {
                                                    abstractC43973HNp3.LLFZ(this.LJJIFFI);
                                                    C45474Ht0 c45474Ht09 = this.LIZJ;
                                                    if (c45474Ht09 != null) {
                                                        c45474Ht09.LJII(true);
                                                    } else {
                                                        o.LJIJI("videoImageMixedView");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("videoImageMixedAdapter");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("videoImageMixedAdapter");
                                                throw null;
                                            }
                                        } else if (LJJIJIL()) {
                                            AbstractC43973HNp abstractC43973HNp4 = this.LIZLLL;
                                            if (abstractC43973HNp4 != null) {
                                                abstractC43973HNp4.LJLZ(this.LJJIJIL, 0);
                                                AbstractC43973HNp abstractC43973HNp5 = this.LIZLLL;
                                                if (abstractC43973HNp5 != null) {
                                                    abstractC43973HNp5.LLFZ(this.LJJIFFI);
                                                    C45474Ht0 c45474Ht010 = this.LIZJ;
                                                    if (c45474Ht010 != null) {
                                                        c45474Ht010.LJII(true);
                                                    } else {
                                                        o.LJIJI("videoImageMixedView");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("videoImageMixedAdapter");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("videoImageMixedAdapter");
                                                throw null;
                                            }
                                        } else if (LJJIJL()) {
                                            AbstractC43973HNp abstractC43973HNp6 = this.LIZLLL;
                                            if (abstractC43973HNp6 != null) {
                                                abstractC43973HNp6.LJLZ(this.LJJIIZI, this.LJJIJIIJI);
                                                AbstractC43973HNp abstractC43973HNp7 = this.LIZLLL;
                                                if (abstractC43973HNp7 != null) {
                                                    abstractC43973HNp7.LLFZ(this.LJJIFFI);
                                                    C45474Ht0 c45474Ht011 = this.LIZJ;
                                                    if (c45474Ht011 != null) {
                                                        c45474Ht011.LJII(true);
                                                        int i4 = this.LJJIJIIJI;
                                                        if (i4 > 4) {
                                                            C45474Ht0 c45474Ht012 = this.LIZJ;
                                                            if (c45474Ht012 != null) {
                                                                c45474Ht012.LIZ(i4);
                                                            } else {
                                                                o.LJIJI("videoImageMixedView");
                                                                throw null;
                                                            }
                                                        }
                                                    } else {
                                                        o.LJIJI("videoImageMixedView");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("videoImageMixedAdapter");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("videoImageMixedAdapter");
                                                throw null;
                                            }
                                        } else if (LJJIIZI()) {
                                            AbstractC43973HNp abstractC43973HNp8 = this.LIZLLL;
                                            if (abstractC43973HNp8 != null) {
                                                abstractC43973HNp8.LJLZ(this.LJJIJIL, 0);
                                                AbstractC43973HNp abstractC43973HNp9 = this.LIZLLL;
                                                if (abstractC43973HNp9 != null) {
                                                    abstractC43973HNp9.LLFZ(this.LJJIFFI);
                                                    C45474Ht0 c45474Ht013 = this.LIZJ;
                                                    if (c45474Ht013 != null) {
                                                        c45474Ht013.LJII(true);
                                                    } else {
                                                        o.LJIJI("videoImageMixedView");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("videoImageMixedAdapter");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("videoImageMixedAdapter");
                                                throw null;
                                            }
                                        } else if (this.LJIJJLI == 25) {
                                            C45474Ht0 c45474Ht014 = this.LIZJ;
                                            if (c45474Ht014 != null) {
                                                c45474Ht014.LJII(true);
                                            } else {
                                                o.LJIJI("videoImageMixedView");
                                                throw null;
                                            }
                                        } else {
                                            AbstractC43973HNp abstractC43973HNp10 = this.LIZLLL;
                                            if (abstractC43973HNp10 != null) {
                                                C1C8 c1c8 = new C1C8(new C43980HNw(abstractC43973HNp10));
                                                C45474Ht0 c45474Ht015 = this.LIZJ;
                                                if (c45474Ht015 != null) {
                                                    c1c8.LJII(c45474Ht015.getMediaSelectRecyclerView());
                                                } else {
                                                    o.LJIJI("videoImageMixedView");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("videoImageMixedAdapter");
                                                throw null;
                                            }
                                        }
                                        ChooseMediaViewModel chooseMediaViewModel = this.LJJIJLIJ;
                                        if (chooseMediaViewModel != null) {
                                            if (LJJIJIL() || LJJIJL()) {
                                                i = this.LJJIJIL;
                                            } else {
                                                i = this.LJJIIZI;
                                            }
                                            chooseMediaViewModel.setState(new C45567HuV(i, this.LJJIFFI, LJJIJIIJI(), LJJIJIL(), LJJIJL(), LJJIIZI()));
                                        }
                                        AbstractC43973HNp abstractC43973HNp11 = this.LIZLLL;
                                        if (abstractC43973HNp11 != null) {
                                            abstractC43973HNp11.LJLJJL = this.LJJIL;
                                            abstractC43973HNp11.LJLJJLL = new C45476Ht2(this, z5);
                                            C45474Ht0 c45474Ht016 = this.LIZJ;
                                            if (c45474Ht016 != null) {
                                                TextView sureTextView = c45474Ht016.getSureTextView();
                                                if (sureTextView != null) {
                                                    C16880lQ.LJIJI(sureTextView, new C45490HtG(this));
                                                }
                                                C45474Ht0 c45474Ht017 = this.LIZJ;
                                                if (c45474Ht017 != null) {
                                                    TuxIconView newStyleSureTextView = c45474Ht017.getNewStyleSureTextView();
                                                    if (newStyleSureTextView != null) {
                                                        C16880lQ.LJJJ(newStyleSureTextView, new C45491HtH(this));
                                                    }
                                                    C45474Ht0 c45474Ht018 = this.LIZJ;
                                                    if (c45474Ht018 != null) {
                                                        c45474Ht018.setSureOnClickListener(new C45518Hti(this));
                                                        if (HRX.LJI()) {
                                                            C45474Ht0 c45474Ht019 = this.LIZJ;
                                                            if (c45474Ht019 != null) {
                                                                C45765Hxh autoCutBtn = c45474Ht019.getAutoCutBtn();
                                                                if (autoCutBtn != null) {
                                                                    C45474Ht0 c45474Ht020 = this.LIZJ;
                                                                    if (c45474Ht020 != null) {
                                                                        autoCutBtn.setBackground(C04270Et.LIZIZ(c45474Ht020.getContext(), R.drawable.pu));
                                                                    } else {
                                                                        o.LJIJI("videoImageMixedView");
                                                                        throw null;
                                                                    }
                                                                }
                                                            } else {
                                                                o.LJIJI("videoImageMixedView");
                                                                throw null;
                                                            }
                                                        }
                                                        C45474Ht0 c45474Ht021 = this.LIZJ;
                                                        if (c45474Ht021 != null) {
                                                            C45765Hxh autoCutBtn2 = c45474Ht021.getAutoCutBtn();
                                                            if (autoCutBtn2 != null) {
                                                                autoCutBtn2.setAnimListener(new C45489HtF(this, autoCutBtn2));
                                                                ShortVideoContext shortVideoContext4 = this.LIZ;
                                                                if (shortVideoContext4 != null) {
                                                                    str2 = shortVideoContext4.shootWay;
                                                                    str3 = shortVideoContext4.LJI();
                                                                } else {
                                                                    str2 = null;
                                                                    str3 = null;
                                                                }
                                                                C45049Hm9.LJIJJ("upload", "upload_page", str2, str3);
                                                            }
                                                            C45474Ht0 c45474Ht022 = this.LIZJ;
                                                            if (c45474Ht022 != null) {
                                                                C45765Hxh autoCutBtn3 = c45474Ht022.getAutoCutBtn();
                                                                if (autoCutBtn3 != null) {
                                                                    autoCutBtn3.setOnClickListener(new ViewOnClickListenerC13880ga(new C45477Ht3(this)));
                                                                }
                                                                C45474Ht0 c45474Ht023 = this.LIZJ;
                                                                if (c45474Ht023 != null) {
                                                                    C58C editorProBtn = c45474Ht023.getEditorProBtn();
                                                                    if (editorProBtn != null) {
                                                                        editorProBtn.setOnClickListener(new ViewOnClickListenerC13880ga(new C45544Hu8(this)));
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                o.LJIJI("videoImageMixedView");
                                                                throw null;
                                                            }
                                                            o.LJIJI("videoImageMixedView");
                                                            throw null;
                                                        }
                                                        o.LJIJI("videoImageMixedView");
                                                        throw null;
                                                    }
                                                    o.LJIJI("videoImageMixedView");
                                                    throw null;
                                                }
                                                o.LJIJI("videoImageMixedView");
                                                throw null;
                                            }
                                            o.LJIJI("videoImageMixedView");
                                            throw null;
                                        }
                                        o.LJIJI("videoImageMixedAdapter");
                                        throw null;
                                    }
                                    o.LJIJI("videoImageMixedView");
                                    throw null;
                                }
                                o.LJIJI("videoImageMixedAdapter");
                                throw null;
                            }
                            o.LJIJI("videoImageMixedView");
                            throw null;
                        }
                        o.LJIJI("mediaSelectRecyclerView");
                        throw null;
                    }
                    o.LJIJI("videoImageMixedView");
                    throw null;
                }
                o.LJIJI("videoImageMixedView");
                throw null;
            }
            o.LJIJI("videoImageMixedView");
            throw null;
        }
        o.LJIJI("videoImageMixedView");
        throw null;
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJIIIIZZ(C45472Hsy c45472Hsy) {
        int i;
        this.LJIILLIIL = c45472Hsy.LIZ;
        this.LJIIZILJ = c45472Hsy.LIZIZ;
        this.LJIJ = c45472Hsy.LIZJ;
        this.LJIJI = c45472Hsy.LIZLLL;
        this.LJIJJ = c45472Hsy.LJ;
        int i2 = c45472Hsy.LJFF;
        this.LJIJJLI = i2;
        this.LJIL = c45472Hsy.LJI;
        this.LJJ = c45472Hsy.LJII;
        this.LJJI = c45472Hsy.LJIIIIZZ;
        this.LJJII = c45472Hsy.LJIIJ;
        this.LJJIII = c45472Hsy.LJIIJJI;
        this.LJJIIJ = c45472Hsy.LJIIL;
        this.LJJIIJZLJL = c45472Hsy.LJIILIIL;
        this.LJJIIZ = c45472Hsy.LJIILJJIL;
        this.LJJIJ = c45472Hsy.LJIILLIIL;
        this.LJJIIZI = c45472Hsy.LJIIZILJ;
        this.LJJIJIIJI = c45472Hsy.LJIIIZ;
        this.LJIILL = c45472Hsy.LJIILL;
        this.LJJIJIIJIL = c45472Hsy.LJIJI;
        this.LJJIFFI = c45472Hsy.LJIJJ;
        if (i2 == 10 || i2 == 20 || i2 == 24 || i2 == 29 || i2 == 18 || i2 == 27 || i2 == 25 || i2 == 26) {
            i = c45472Hsy.LJIJ;
        } else {
            C43117Gw5.LIZ.getClass();
            i = C43117Gw5.LJII();
        }
        this.LJJIJIL = i;
        this.LJJIJLIJ = c45472Hsy.LJIJJLI;
        this.LJJIL = c45472Hsy.LJIL;
        this.LJJJ = c45472Hsy.LJJ;
        this.LIZIZ = c45472Hsy.LJJI;
        this.LJJJI = c45472Hsy.LJJIFFI;
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJIILIIL(boolean z) {
        if (z) {
            C45474Ht0 c45474Ht0 = this.LIZJ;
            if (c45474Ht0 != null) {
                c45474Ht0.setVisibility(0);
                return;
            } else {
                o.LJIJI("videoImageMixedView");
                throw null;
            }
        }
        C45474Ht0 c45474Ht02 = this.LIZJ;
        if (c45474Ht02 != null) {
            c45474Ht02.setVisibility(8);
        } else {
            o.LJIJI("videoImageMixedView");
            throw null;
        }
    }

    @Override // X.InterfaceC45480Ht6
    public final View LJIILJJIL(int i) {
        View LJJIJIL;
        C45474Ht0 c45474Ht0 = this.LIZJ;
        if (c45474Ht0 != null) {
            C0A2 layoutManager = c45474Ht0.getMediaSelectRecyclerView().getLayoutManager();
            if (layoutManager == null || (LJJIJIL = layoutManager.LJJIJIL(i)) == null) {
                return null;
            }
            return LJJIJIL.findViewById(R.id.n4v);
        }
        o.LJIJI("videoImageMixedView");
        throw null;
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJIILL(boolean z) {
        if (z) {
            C45474Ht0 c45474Ht0 = this.LIZJ;
            if (c45474Ht0 != null) {
                c45474Ht0.setVisibility(0);
                return;
            } else {
                o.LJIJI("videoImageMixedView");
                throw null;
            }
        }
        LJJIZ();
        C45474Ht0 c45474Ht02 = this.LIZJ;
        if (c45474Ht02 != null) {
            c45474Ht02.setVisibility(8);
        } else {
            o.LJIJI("videoImageMixedView");
            throw null;
        }
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJIIZILJ(boolean z) {
        C45474Ht0 c45474Ht0 = this.LIZJ;
        if (c45474Ht0 != null) {
            c45474Ht0.LJIIIZ(z);
            if (z) {
                if (this.LIZLLL != null) {
                    LJJIL();
                }
            } else {
                C45474Ht0 c45474Ht02 = this.LIZJ;
                if (c45474Ht02 != null) {
                    c45474Ht02.LJIIIIZZ(false);
                } else {
                    o.LJIJI("videoImageMixedView");
                    throw null;
                }
            }
            LJJIZ();
            return;
        }
        o.LJIJI("videoImageMixedView");
        throw null;
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJIJI(boolean z) {
        this.LJJIZ = z;
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJIJJLI(int i) {
        C45474Ht0 c45474Ht0 = this.LIZJ;
        if (c45474Ht0 != null) {
            C0A2 layoutManager = c45474Ht0.getMediaSelectRecyclerView().getLayoutManager();
            if (layoutManager != null && layoutManager.LJJIJIL(i) == null && (layoutManager instanceof LinearLayoutManager)) {
                ((LinearLayoutManager) layoutManager).LJFF(i, 0);
                return;
            }
            return;
        }
        o.LJIJI("videoImageMixedView");
        throw null;
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJJ(TM0 tm0) {
        this.LJJIIZ = tm0;
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJJI(MyMediaModel mediaModel) {
        o.LJIIIZ(mediaModel, "mediaModel");
        AbstractC43973HNp abstractC43973HNp = this.LIZLLL;
        if (abstractC43973HNp != null) {
            abstractC43973HNp.LLIIIL(mediaModel);
        } else {
            o.LJIJI("videoImageMixedAdapter");
            throw null;
        }
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJJII(List<MyMediaModel> selectedMedia) {
        o.LJIIIZ(selectedMedia, "selectedMedia");
        if (HOA.LIZ() && this.LIZIZ == 0) {
            AbstractC43973HNp abstractC43973HNp = this.LIZLLL;
            if (abstractC43973HNp != null) {
                for (MyMediaModel myMediaModel : selectedMedia) {
                    if (myMediaModel.LJI()) {
                        Iterator<MyMediaModel> it = abstractC43973HNp.LJLIL.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            int i2 = i + 1;
                            MyMediaModel next = it.next();
                            if (next.LJI() && o.LJ(myMediaModel.id, next.id)) {
                                abstractC43973HNp.notifyItemChanged(i);
                            }
                            i = i2;
                        }
                    }
                }
                return;
            }
            o.LJIJI("videoImageMixedAdapter");
            throw null;
        }
    }

    public final int LJJJIL(MyMediaModel myMediaModel) {
        String str;
        MyMediaModel LJJIIZ;
        if (myMediaModel == null) {
            return -1;
        }
        if (this.LJ.contains(myMediaModel)) {
            if (myMediaModel.copiedFromModel != null) {
                r1.copiedCount--;
            } else {
                myMediaModel.copiedCount--;
            }
        }
        AbstractC43973HNp abstractC43973HNp = this.LIZLLL;
        if (abstractC43973HNp != null) {
            abstractC43973HNp.LJZ(myMediaModel);
            this.LJ.remove(myMediaModel);
            C151535x7 c151535x7 = C151535x7.LIZ;
            CreativeInfo LJJIIJ = LJJIIJ();
            c151535x7.getClass();
            C151535x7.LIZIZ(LJJIIJ, myMediaModel);
            if (HOA.LIZ() && this.LIZIZ == 0 && (myMediaModel.startTime != 0 || myMediaModel.endTime != 0)) {
                myMediaModel.startTime = 0;
                myMediaModel.endTime = 0;
                ChooseMediaViewModel chooseMediaViewModel = this.LJJIJLIJ;
                if (chooseMediaViewModel != null) {
                    chooseMediaViewModel.Ov0(myMediaModel);
                }
                IMediaCacheService LJIIZILJ = C60903NvH.LJIIJJI().LJIIZILJ();
                String str2 = myMediaModel.fileLocalUriPath;
                o.LJIIIIZZ(str2, "it.fileLocalUriPath");
                LJIIZILJ.removeTargetMediaBlurThumbnailCache(str2);
            }
            if (LJJIJL() && (myMediaModel.startTime != 0 || myMediaModel.endTime != 0)) {
                myMediaModel.startTime = 0;
                myMediaModel.endTime = 0;
                ChooseMediaViewModel chooseMediaViewModel2 = this.LJJIJLIJ;
                if (chooseMediaViewModel2 != null) {
                    chooseMediaViewModel2.Ov0(myMediaModel);
                }
            }
            ChooseMediaViewModel chooseMediaViewModel3 = this.LJJIJLIJ;
            if (chooseMediaViewModel3 != null) {
                chooseMediaViewModel3.setState(new AqS173S0100000_7(myMediaModel, 267));
            }
            OSJ<String, String, ? extends WeakReference<Bitmap>> osj = C151425ww.LIZIZ;
            if (osj != null) {
                str = osj.getFirst();
            } else {
                str = null;
            }
            if (o.LJ(str, myMediaModel.fileLocalUriPath) && (LJJIIZ = LJJIIZ()) != null) {
                String str3 = LJJIIZ.fileLocalUriPath;
                o.LJIIIIZZ(str3, "it.fileLocalUriPath");
                C151425ww.LIZIZ(LJJIIJ(), str3);
            }
            LJJJ();
            LJJIL();
            LJJIJLIJ();
            if (LJJIJIIJI()) {
                C45474Ht0 c45474Ht0 = this.LIZJ;
                if (c45474Ht0 != null) {
                    AbstractC43973HNp abstractC43973HNp2 = this.LIZLLL;
                    if (abstractC43973HNp2 != null) {
                        c45474Ht0.LIZ(abstractC43973HNp2.LJZL());
                    } else {
                        o.LJIJI("videoImageMixedAdapter");
                        throw null;
                    }
                } else {
                    o.LJIJI("videoImageMixedView");
                    throw null;
                }
            }
            if (LJJIJIL() || LJJIJL() || LJJIIZI()) {
                C45474Ht0 c45474Ht02 = this.LIZJ;
                if (c45474Ht02 != null) {
                    AbstractC43973HNp abstractC43973HNp3 = this.LIZLLL;
                    if (abstractC43973HNp3 != null) {
                        c45474Ht02.LIZ(abstractC43973HNp3.LJZI());
                    } else {
                        o.LJIJI("videoImageMixedAdapter");
                        throw null;
                    }
                } else {
                    o.LJIJI("videoImageMixedView");
                    throw null;
                }
            }
            int size = (this.LJJIJIL - this.LJ.size()) - this.LJJIJIIJIL.size();
            if (size < 0) {
                return 0;
            }
            return size;
        }
        o.LJIJI("videoImageMixedAdapter");
        throw null;
    }

    public C45473Hsz(int i, ShortVideoContext shortVideoContext) {
        this.LIZ = shortVideoContext;
        this.LIZIZ = i;
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJFF(int i, int i2) {
        LJJJI(i, i2, true);
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJIIJJI(View view, String str) {
        String str2;
        String str3;
        boolean z;
        String str4;
        String str5;
        String str6;
        int i;
        ShortVideoContext shortVideoContext;
        CreativeModel creativeModel;
        CreativeInitialModel creativeInitialModel;
        DMCameraModel dMCameraModel;
        int i2;
        boolean z2;
        boolean z3;
        C45474Ht0 c45474Ht0 = (C45474Ht0) view;
        this.LIZJ = c45474Ht0;
        Context context = c45474Ht0.getContext();
        o.LJIIIIZZ(context, "contentView.context");
        this.LJIILIIL = C44729Hgz.LJIILIIL(context, true, LJJIJL());
        Context context2 = c45474Ht0.getContext();
        o.LJIIIIZZ(context2, "contentView.context");
        this.LJIILJJIL = C44729Hgz.LJIILIIL(context2, false, LJJIJL());
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.LJIIJJI = str2;
        ShortVideoContext shortVideoContext2 = this.LIZ;
        if (shortVideoContext2 != null) {
            str3 = shortVideoContext2.shootWay;
        } else {
            str3 = null;
        }
        if (o.LJ(str3, "duet") && C43710HDm.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (i2 = this.LIZIZ) != 32 && i2 != 34) {
            C45474Ht0 c45474Ht02 = this.LIZJ;
            if (c45474Ht02 != null) {
                ShortVideoContext shortVideoContext3 = this.LIZ;
                if (shortVideoContext3 != null && shortVideoContext3.LJJIIZ()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean LIZIZ = C44703HgZ.LIZIZ(i2, z2);
                boolean LIZ = C43818HHq.LIZ(this.LIZIZ, Integer.valueOf(this.LJIJJLI));
                boolean LJJIJIL = LJJIJIL();
                boolean LJJIJL = LJJIJL();
                if (this.LJIJJLI == 25) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Drawable drawable = this.LJIILIIL;
                if (drawable != null) {
                    Drawable drawable2 = this.LJIILJJIL;
                    if (drawable2 != null) {
                        c45474Ht02.LIZJ(new VideoImageMixedInitParam(LIZIZ, LIZ, LJJIJIL, LJJIJL, z3, drawable, drawable2));
                    } else {
                        o.LJIJI("unClickDrawable");
                        throw null;
                    }
                } else {
                    o.LJIJI("clickDrawable");
                    throw null;
                }
            } else {
                o.LJIJI("videoImageMixedView");
                throw null;
            }
        }
        ShortVideoContext shortVideoContext4 = this.LIZ;
        if (shortVideoContext4 != null) {
            str4 = shortVideoContext4.shootWay;
        } else {
            str4 = null;
        }
        if (o.LJ(str4, "duet") && C43710HDm.LIZ()) {
            C45474Ht0 c45474Ht03 = this.LIZJ;
            if (c45474Ht03 != null) {
                c45474Ht03.LJLLLLLL = true;
            } else {
                o.LJIJI("videoImageMixedView");
                throw null;
            }
        }
        ShortVideoContext shortVideoContext5 = this.LIZ;
        if (shortVideoContext5 != null) {
            str5 = shortVideoContext5.shootWay;
        } else {
            str5 = null;
        }
        if (o.LJ(str5, "now")) {
            C45474Ht0 c45474Ht04 = this.LIZJ;
            if (c45474Ht04 != null) {
                c45474Ht04.LJLZ = true;
            } else {
                o.LJIJI("videoImageMixedView");
                throw null;
            }
        }
        C45474Ht0 c45474Ht05 = this.LIZJ;
        if (c45474Ht05 != null) {
            c45474Ht05.LIZLLL();
            C45474Ht0 c45474Ht06 = this.LIZJ;
            if (c45474Ht06 != null) {
                c45474Ht06.LJ(str, false);
                C45474Ht0 c45474Ht07 = this.LIZJ;
                if (c45474Ht07 != null) {
                    TextView sureTextView = c45474Ht07.getSureTextView();
                    if (sureTextView != null) {
                        Context context3 = sureTextView.getContext();
                        if (context3 != null) {
                            str6 = context3.getString(R.string.ipo);
                        } else {
                            str6 = null;
                        }
                        sureTextView.setText(str6);
                        sureTextView.setTextColor(1461065763);
                    }
                    Context context4 = c45474Ht0.getContext();
                    o.LJIIIIZZ(context4, "contentView.context");
                    Drawable LJIILIIL = C44729Hgz.LJIILIIL(context4, false, LJJIJL());
                    this.LJIILJJIL = LJIILIIL;
                    if (sureTextView != null) {
                        sureTextView.setBackground(LJIILIIL);
                    }
                    C45474Ht0 c45474Ht08 = this.LIZJ;
                    if (c45474Ht08 != null) {
                        c45474Ht08.setVisibility(0);
                        if (IMService.createIIMServicebyMonsterPlugin(false).getCameraService().LIZ() && (shortVideoContext = this.LIZ) != null && (creativeModel = shortVideoContext.creativeModel) != null && (creativeInitialModel = creativeModel.initialModel) != null && (dMCameraModel = creativeInitialModel.dmCameraModel) != null && dMCameraModel.enterFromDM) {
                            LJIILIIL(false);
                        }
                        if (LJJIJL()) {
                            C45474Ht0 c45474Ht09 = this.LIZJ;
                            if (c45474Ht09 != null) {
                                Context context5 = c45474Ht09.getContext();
                                o.LJIIIIZZ(context5, "videoImageMixedView.context");
                                Integer LJI = C79045V0n.LJI(R.attr.dg, context5);
                                if (LJI != null) {
                                    i = LJI.intValue();
                                } else {
                                    i = -16777216;
                                }
                                c45474Ht09.setBackgroundColor(i);
                                return;
                            }
                            o.LJIJI("videoImageMixedView");
                            throw null;
                        }
                        return;
                    }
                    o.LJIJI("videoImageMixedView");
                    throw null;
                }
                o.LJIJI("videoImageMixedView");
                throw null;
            }
            o.LJIJI("videoImageMixedView");
            throw null;
        }
        o.LJIJI("videoImageMixedView");
        throw null;
    }

    @Override // X.InterfaceC45480Ht6
    public final int LJIJJ(int i, int i2) {
        CreativeFlowData creativeFlowData;
        EditorProModel editorProModel;
        int size = this.LJ.size();
        ShortVideoContext shortVideoContext = this.LIZ;
        if (shortVideoContext != null && (creativeFlowData = shortVideoContext.creativeFlowData) != null && (editorProModel = creativeFlowData.getEditorProModel()) != null && editorProModel.getFromEditorProEntranceInAlbum()) {
            LIZ();
        }
        if (i2 == 6) {
            return 10;
        }
        if (this.LJJII) {
            LIZIZ();
            return 12;
        }
        if (i == 1) {
            return i;
        }
        if (i2 == 14) {
            LIZ();
            return 18;
        }
        if (i2 == 22) {
            LIZ();
            return 23;
        }
        int i3 = 11;
        int i4 = 13;
        if (size == 1) {
            if (!((MediaModel) ListProtector.get(this.LJ, 0)).LJI()) {
                i4 = 11;
            }
            Object obj = ListProtector.get(this.LJ, 0);
            o.LJIIIIZZ(obj, "selectMediaModelList[0]");
            if (!C30581Hy.LIZJ((MediaModel) obj)) {
                i3 = i4;
            }
            if (!LJJIJL()) {
                return i3;
            }
        } else if (LJJIJ(this.LJ) || LJJIJIL() || LJJIJL() || LJJIIZI()) {
            if (!LJJIJIL() && !LJJIJL() && !LJJIIZI()) {
                LIZIZ();
            }
        } else {
            if (!this.LJJJI || !e1.LIZ(31744, "editing_effect_photo_to_video_flow", true, false) || this.LJ.size() <= 1) {
                return 11;
            }
            LIZ();
            return 13;
        }
        return 2;
    }

    @Override // X.InterfaceC45480Ht6
    public final void LJIL(View v, boolean z) {
        ArrayList<MyMediaModel> LJIIJ;
        MusicBuzModel musicBuzModel;
        CreativeModel creativeModel;
        CreativeModel creativeModel2;
        InterfaceC88472Yns<? super ArrayList<MyMediaModel>, C76800UCe> interfaceC88472Yns;
        CreativeFlowData creativeFlowData;
        ShortVideoContext shortVideoContext;
        CreativeModel creativeModel3;
        o.LJIIIZ(v, "v");
        if (this.LJIJJLI == 23 && o.LJ(this.LJIL, EnumC1289754j.CAPTION.getType())) {
            ArrayList<MyMediaModel> arrayList = this.LJ;
            ArrayList arrayList2 = new ArrayList();
            Iterator<MyMediaModel> it = arrayList.iterator();
            while (it.hasNext()) {
                MyMediaModel next = it.next();
                if (!next.LJ()) {
                    arrayList2.add(next);
                }
            }
            if (arrayList2.isEmpty()) {
                C5S1 c5s1 = new C5S1(v.getContext());
                c5s1.LIZJ(R.string.fgx);
                c5s1.LJ();
                return;
            }
        }
        MusicBuzModel musicBuzModel2 = null;
        if (z && (shortVideoContext = this.LIZ) != null && (creativeModel3 = shortVideoContext.creativeModel) != null) {
            creativeModel3.autoCutModel = new AutoCutModel(null, null, null, 0, 0, null, null, 0, false, null, null, null, null, null, null, null, null, 131071, null);
        }
        ShortVideoContext shortVideoContext2 = this.LIZ;
        if (shortVideoContext2 != null && (creativeFlowData = shortVideoContext2.creativeFlowData) != null) {
            if (creativeFlowData.getEditorProModel() == null) {
                creativeFlowData.setEditorProModel(new EditorProModel(false, null, false, null, null, null, false, false, 0, false, false, null, false, null, null, null, null, null, false, null, z, false, false, false, null, 32501759, null));
            } else {
                EditorProModel editorProModel = creativeFlowData.getEditorProModel();
                if (editorProModel != null) {
                    editorProModel.setFromEditorProEntranceInAlbum(z);
                }
            }
        }
        if (LJJIJIL() || LJJIIZI()) {
            LJIIJ = LJIIJ();
        } else {
            LJIIJ = LJJIIJZLJL();
        }
        if (!this.LJIJJ && (interfaceC88472Yns = this.LJIJI) != null) {
            interfaceC88472Yns.invoke(LJIIJ);
            return;
        }
        AnonymousClass632.LIZIZ(v.getContext());
        G8G.LIZ.start("av_video_edit", "click onNext btn");
        if (!this.LJJIJL) {
            InterfaceC45535Htz interfaceC45535Htz = this.LJIIZILJ;
            if (interfaceC45535Htz != null) {
                interfaceC45535Htz.LIZJ(false, LJIIJ);
                return;
            }
            return;
        }
        if (LJJIJIIJI() || LJJIJIIJIL()) {
            InterfaceC45535Htz interfaceC45535Htz2 = this.LJIIZILJ;
            if (interfaceC45535Htz2 != null) {
                interfaceC45535Htz2.LIZJ(true, LJIIJ);
                return;
            }
            return;
        }
        if (LJJIJIL()) {
            this.LJ = LIZLLL(this.LJ);
            LJJJJ();
        }
        if (LJJIJL()) {
            LJJJJ();
        }
        if (LJJIIZI()) {
            this.LJ = LIZLLL(this.LJ);
        }
        if (!LJJIJ(this.LJ)) {
            InterfaceC45535Htz interfaceC45535Htz3 = this.LJIIZILJ;
            if (interfaceC45535Htz3 != null) {
                interfaceC45535Htz3.LIZJ(true, LJIIJ);
                return;
            }
            return;
        }
        ShortVideoContext shortVideoContext3 = this.LIZ;
        if (shortVideoContext3 != null && (creativeModel2 = shortVideoContext3.creativeModel) != null) {
            musicBuzModel = creativeModel2.musicBuzModel;
        } else {
            musicBuzModel = null;
        }
        if (I9T.LIZJ(musicBuzModel)) {
            ShortVideoContext shortVideoContext4 = this.LIZ;
            if (shortVideoContext4 != null && (creativeModel = shortVideoContext4.creativeModel) != null) {
                musicBuzModel2 = creativeModel.musicBuzModel;
            }
            I9T.LJ(musicBuzModel2);
            InterfaceC45535Htz interfaceC45535Htz4 = this.LJIIZILJ;
            if (interfaceC45535Htz4 != null) {
                interfaceC45535Htz4.LIZ();
            }
        }
        if (C52243Ket.LIZ() && !this.LJJII) {
            InterfaceC45535Htz interfaceC45535Htz5 = this.LJIIZILJ;
            if (interfaceC45535Htz5 != null) {
                interfaceC45535Htz5.LIZJ(true, LJIIJ);
                return;
            }
            return;
        }
        C43117Gw5 c43117Gw5 = C43117Gw5.LIZ;
        ArrayList<MyMediaModel> arrayList3 = this.LJ;
        C45487HtD c45487HtD = new C45487HtD(this, v, LJIIJ);
        c43117Gw5.getClass();
        C43117Gw5.LIZ(arrayList3, c45487HtD);
    }

    @Override // X.InterfaceC45480Ht6
    public final int LJIJ(MyMediaModel myMediaModel, boolean z, boolean z2) {
        int LJJJIL;
        C45800HyG c45800HyG;
        C45800HyG c45800HyG2;
        if (z) {
            if (myMediaModel == null) {
                LJJJIL = -1;
            } else {
                if (!this.LJ.contains(myMediaModel)) {
                    MyMediaModel myMediaModel2 = myMediaModel.copiedFromModel;
                    if (myMediaModel2 != null) {
                        myMediaModel2.copiedCount++;
                    } else {
                        myMediaModel.copiedCount++;
                    }
                }
                if (myMediaModel.LJ()) {
                    ArrayList<MyMediaModel> arrayList = this.LJ;
                    if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                        Iterator<MyMediaModel> it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (it.next().LJ()) {
                                break;
                            }
                        }
                    }
                    String str = myMediaModel.fileLocalUriPath;
                    o.LJIIIIZZ(str, "mediaModel.fileLocalUriPath");
                    C151425ww.LIZIZ(LJJIIJ(), str);
                }
                this.LJ.add(myMediaModel);
                AbstractC43973HNp abstractC43973HNp = this.LIZLLL;
                if (abstractC43973HNp != null) {
                    abstractC43973HNp.LJLLLLLL(myMediaModel);
                    ChooseMediaViewModel chooseMediaViewModel = this.LJJIJLIJ;
                    if (chooseMediaViewModel != null) {
                        chooseMediaViewModel.setState(new AqS173S0100000_7(myMediaModel, 265));
                    }
                    C151535x7 c151535x7 = C151535x7.LIZ;
                    CreativeInfo LJJIIJ = LJJIIJ();
                    c151535x7.getClass();
                    C151535x7.LJIIIZ(LJJIIJ, myMediaModel);
                    LJJJ();
                    LJJIL();
                    LJJIJLIJ();
                    if (LJJIJIL() || LJJIJL() || LJJIIZI()) {
                        C45474Ht0 c45474Ht0 = this.LIZJ;
                        if (c45474Ht0 != null) {
                            AbstractC43973HNp abstractC43973HNp2 = this.LIZLLL;
                            if (abstractC43973HNp2 != null) {
                                c45474Ht0.LIZ(abstractC43973HNp2.LJZI());
                            } else {
                                o.LJIJI("videoImageMixedAdapter");
                                throw null;
                            }
                        } else {
                            o.LJIJI("videoImageMixedView");
                            throw null;
                        }
                    } else {
                        C45474Ht0 c45474Ht02 = this.LIZJ;
                        if (c45474Ht02 != null) {
                            AbstractC43973HNp abstractC43973HNp3 = this.LIZLLL;
                            if (abstractC43973HNp3 != null) {
                                c45474Ht02.LIZ(abstractC43973HNp3.LJZL());
                            } else {
                                o.LJIJI("videoImageMixedAdapter");
                                throw null;
                            }
                        } else {
                            o.LJIJI("videoImageMixedView");
                            throw null;
                        }
                    }
                    if (C5W9.LIZ() && myMediaModel.LJI()) {
                        C10K.LIZJ(new ACallableS105S0100000_2(myMediaModel, 0)).LJ(new AgS120S0100000_2(myMediaModel, 1), C10K.LJIIIIZZ, null);
                    }
                    LJJJIL = (this.LJJIJIL - this.LJ.size()) - this.LJJIJIIJIL.size();
                    if (LJJJIL < 0) {
                        LJJJIL = 0;
                    }
                } else {
                    o.LJIJI("videoImageMixedAdapter");
                    throw null;
                }
            }
        } else {
            LJJJIL = LJJJIL(myMediaModel);
        }
        if (!LJJIJIIJI() && !LJJIJIL() && !LJJIJL() && !LJJIIZI() && this.LIZIZ != 26) {
            if (z2) {
                AbstractC45488HtE abstractC45488HtE = this.LJJIIJZLJL;
                if (abstractC45488HtE != null) {
                    abstractC45488HtE.LLJJL(LJJJIL);
                }
            } else {
                AbstractC45488HtE abstractC45488HtE2 = this.LJJIIJ;
                if (abstractC45488HtE2 != null) {
                    abstractC45488HtE2.LLJJL(LJJJIL);
                }
            }
            AbstractC45488HtE abstractC45488HtE3 = this.LJJIII;
            if (abstractC45488HtE3 != null) {
                abstractC45488HtE3.LLJJL(LJJJIL);
            }
            TM0 tm0 = this.LJJIIZ;
            if (tm0 != null && (c45800HyG2 = tm0.LLFII) != null) {
                c45800HyG2.LJLJI = LJJJIL;
                if (c45800HyG2.LJLILLLLZI != -1) {
                    c45800HyG2.LJLILLLLZI = LJJJIL;
                }
            }
        }
        if (!z || LJJJIL == 0) {
            AbstractC45488HtE abstractC45488HtE4 = this.LJJIIJ;
            if (abstractC45488HtE4 != null) {
                abstractC45488HtE4.LLJJIJI();
            }
            AbstractC45488HtE abstractC45488HtE5 = this.LJJIIJZLJL;
            if (abstractC45488HtE5 != null) {
                abstractC45488HtE5.LLJJIJI();
            }
            AbstractC45488HtE abstractC45488HtE6 = this.LJJIII;
            if (abstractC45488HtE6 != null) {
                abstractC45488HtE6.LLJJIJI();
            }
            TM0 tm02 = this.LJJIIZ;
            if (tm02 != null && (c45800HyG = tm02.LLFII) != null) {
                c45800HyG.LJZL();
            }
        }
        return this.LJ.size();
    }

    public final void LJJJI(int i, int i2, boolean z) {
        boolean z2;
        String str;
        C45800HyG c45800HyG;
        boolean z3 = false;
        if (i >= 0 && i < this.LJ.size()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i2 >= 0 && i2 < this.LJ.size()) {
            z3 = true;
        }
        if (z2 && z3) {
            OSJ<String, String, ? extends WeakReference<Bitmap>> osj = C151425ww.LIZIZ;
            if (osj != null) {
                str = osj.getFirst();
            } else {
                str = null;
            }
            Object remove = ListProtector.remove(this.LJ, i);
            o.LJIIIIZZ(remove, "selectMediaModelList.removeAt(from)");
            MediaModel mediaModel = (MediaModel) remove;
            ListProtector.add(this.LJ, i2, mediaModel);
            MyMediaModel LJJIIZ = LJJIIZ();
            if (LJJIIZ != null && !o.LJ(str, LJJIIZ.fileLocalUriPath)) {
                String str2 = LJJIIZ.fileLocalUriPath;
                o.LJIIIIZZ(str2, "it.fileLocalUriPath");
                C151425ww.LIZIZ(LJJIIJ(), str2);
            }
            LJJJ();
            AbstractC45488HtE abstractC45488HtE = this.LJJIII;
            if (abstractC45488HtE != null) {
                abstractC45488HtE.LLJJJ();
            }
            AbstractC45488HtE abstractC45488HtE2 = this.LJJIIJZLJL;
            if (abstractC45488HtE2 != null) {
                abstractC45488HtE2.LLJJJ();
            }
            AbstractC45488HtE abstractC45488HtE3 = this.LJJIIJ;
            if (abstractC45488HtE3 != null) {
                abstractC45488HtE3.LLJJJ();
            }
            TM0 tm0 = this.LJJIIZ;
            if (tm0 != null && (c45800HyG = tm0.LLFII) != null) {
                c45800HyG.LJZI();
            }
            InterfaceC43977HNt interfaceC43977HNt = this.LJIILLIIL;
            if (interfaceC43977HNt != null) {
                interfaceC43977HNt.LJFF(i, i2);
            }
            C145995oB LIZ = C45493HtJ.LIZ(mediaModel.LJI());
            LIZ.LJI("edit_way", "press");
            FMX.LJIIL("edit_clips_order", LIZ.LIZ);
        }
        if (z) {
            AbstractC43973HNp abstractC43973HNp = this.LIZLLL;
            if (abstractC43973HNp != null) {
                abstractC43973HNp.LLIIIILZ(i, i2);
            } else {
                o.LJIJI("videoImageMixedAdapter");
                throw null;
            }
        }
    }
}
