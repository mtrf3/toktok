package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.o;

/* renamed from: X.5rT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148035rT extends AbstractC163776bl<EditToolbarViewModel> implements InterfaceC135635Tz {
    public final C82622Wbi LJLJLJ;
    public final WMH LJLJLLL;
    public final int LJLL;
    public final VideoPublishEditModel LJLLI;
    public final C148045rU LJLLILLLL;

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.AbstractC165596eh, X.AbstractC29891Fh
    public final void onCreate() {
        super.onCreate();
        if (C151965xo.LIZJ(this.LJLLI)) {
            WMH wmh = this.LJLJLLL;
            int i = this.LJLL;
            final C82622Wbi c82622Wbi = this.LJLJLJ;
            wmh.add(i, new C60U(c82622Wbi) { // from class: X.60W
                public final boolean LJZL;

                @Override // X.C60U
                public final List LLJLL() {
                    Serializable serializable;
                    boolean z;
                    int i2;
                    Integer num;
                    boolean z2;
                    int i3;
                    MvCreateVideoData mvCreateVideoData;
                    ArrayList<String> arrayList;
                    Bundle bundle;
                    int i4;
                    int i5;
                    ArrayList arrayList2 = new ArrayList();
                    boolean LLJILLL = C44384HbQ.LLJILLL(LLJLIL());
                    Integer valueOf = Integer.valueOf(R.string.pde);
                    Integer valueOf2 = Integer.valueOf(R.raw.icon_text_latin);
                    Integer valueOf3 = Integer.valueOf(R.string.txp);
                    Integer valueOf4 = Integer.valueOf(R.raw.icon_camera_sticker_round_fill);
                    Integer valueOf5 = Integer.valueOf(R.string.rnc);
                    Integer num2 = null;
                    if (LLJILLL) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(new C1536461g(17, 0, Integer.valueOf(C1535460w.LIZIZ()), null, Integer.valueOf(C1535460w.LIZ()), null, false, 106));
                        if (!this.LJZL) {
                            valueOf2 = null;
                        }
                        arrayList3.add(new C1536461g(3, -1, valueOf3, null, valueOf2, null, false, 104));
                        if (!this.LJZL) {
                            valueOf4 = null;
                        }
                        arrayList3.add(new C1536461g(4, -1, valueOf5, null, valueOf4, null, false, 104));
                        LLJJJ(arrayList3);
                        if (H7R.LJJJJL(LLJLIL())) {
                            arrayList3.add(new C1536461g(16, R.drawable.b88, valueOf, null, null, null, false, LiveTryModeCountDownThresholdSetting.DEFAULT));
                        }
                        this.LJLLL = C78866UxK.LJJJLZIJ(LLJLIL());
                        arrayList3.add(new C1536461g(1101, 0, Integer.valueOf(R.string.iip), null, Integer.valueOf(R.raw.icon_music_note_s_alt), null, this.LJLLL, 42));
                        arrayList2.addAll(arrayList3);
                    } else if (H7R.LJJJJL(LLJLIL())) {
                        ArrayList arrayList4 = new ArrayList();
                        LLJJJJ(arrayList4);
                        if (C44702HgY.LIZ(LLJLIL())) {
                            if (C00F.LIZ(31744, 0, "autocut_edit_entrance_name", true) == 1) {
                                i5 = R.string.e23;
                            } else {
                                i5 = R.string.e1v;
                            }
                            arrayList4.add(new C1536461g(21, -1, Integer.valueOf(i5), null, Integer.valueOf(R.raw.icon_templates_cards), null, false, 104));
                        }
                        arrayList4.add(new C1536461g(3, -1, valueOf3, null, valueOf2, null, false, 104));
                        arrayList4.add(new C1536461g(4, -1, valueOf5, null, valueOf4, null, false, 40));
                        Integer valueOf6 = Integer.valueOf(R.string.gfw);
                        if (this.LJZL) {
                            num2 = Integer.valueOf(R.raw.icon_camera_filter_fill);
                        }
                        arrayList4.add(new C1536461g(5, -1, valueOf6, null, num2, null, false, 104));
                        if (!C44384HbQ.LJJIFFI()) {
                            Integer valueOf7 = Integer.valueOf(R.string.rfx);
                            if (C149055t7.LIZ()) {
                                i4 = R.raw.icon_control_fill;
                            } else {
                                i4 = R.raw.icon_speaker_2_fill_ltr;
                            }
                            arrayList4.add(new C1536461g(7, -1, valueOf7, null, Integer.valueOf(i4), null, false, 104));
                        }
                        if (LLJLIL().isAutoEnhanceEnable()) {
                            arrayList4.add(new C1536461g(9, -1, Integer.valueOf(R.string.fiz), null, Integer.valueOf(R.raw.icon_camera_enhancephoto_fill), null, false, 104));
                        }
                        arrayList4.add(new C1536461g(16, R.drawable.b88, valueOf, null, null, null, false, LiveTryModeCountDownThresholdSetting.DEFAULT));
                        if (C44384HbQ.LJJIJIL(LLJLIL())) {
                            arrayList4.add(new C1536461g(17, 0, Integer.valueOf(C1535460w.LIZIZ()), null, Integer.valueOf(C1535460w.LIZ()), null, false, 106));
                        }
                        arrayList2.addAll(arrayList4);
                    } else if (H7R.LJJLIIIJJIZ(LLJLIL())) {
                        ArrayList arrayList5 = new ArrayList();
                        if (C6N3.LIZ()) {
                            arrayList5.add(new C1536461g(23, -1, Integer.valueOf(R.string.s6x), null, Integer.valueOf(R.raw.icon_camera_draft), null, false, 104));
                            arrayList5.add(new C1536461g(24, 0, 0, null, null, null, false, LiveTryModeCountDownThresholdSetting.DEFAULT));
                        }
                        arrayList5.add(new C1536461g(4, -1, valueOf5, null, valueOf4, null, false, 104));
                        if (OI2.LJIIIZ()) {
                            arrayList5.add(new C1536461g(22, R.drawable.qe, Integer.valueOf(R.string.s6w), null, null, null, false, LiveTryModeCountDownThresholdSetting.DEFAULT));
                        }
                        arrayList5.add(new C1536461g(17, 0, Integer.valueOf(C1535460w.LIZIZ()), null, Integer.valueOf(C1535460w.LIZ()), null, false, 106));
                        arrayList2.addAll(arrayList5);
                    } else {
                        LLJJJJ(arrayList2);
                        LLJJIJI(arrayList2);
                        ArrayList arrayList6 = new ArrayList();
                        int i6 = 0;
                        arrayList6.add(new C1536461g(3, -1, valueOf3, null, valueOf2, null, false, 104));
                        arrayList6.add(new C1536461g(4, -1, valueOf5, null, valueOf4, null, false, 104));
                        AbstractC42651GoZ LJIJ = C86793Y4n.LJIJ(this);
                        if (LJIJ != null && (bundle = LJIJ.mArguments) != null) {
                            serializable = bundle.getSerializable("key_mv_theme_data");
                        } else {
                            serializable = null;
                        }
                        if ((serializable instanceof MvCreateVideoData) && (mvCreateVideoData = (MvCreateVideoData) serializable) != null && (arrayList = mvCreateVideoData.selectMediaList) != null && arrayList.size() > 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if ((!"slideshow".equals(H7R.LJIIIZ(LLJLIL())) || !z || !C60T.LIZ()) && !LLJLLIL()) {
                            if (o.LJ(LLJLIL().mShootWay, "editing_effect_page") || o.LJ(LLJLIL().mShootWay, "editing_effect_template")) {
                                i2 = R.drawable.aq3;
                            } else if (C149015t3.LIZ()) {
                                i2 = R.drawable.azu;
                            } else {
                                i2 = R.drawable.b6u;
                            }
                            Integer valueOf8 = Integer.valueOf(R.string.fr1);
                            if (this.LJZL) {
                                if (C149055t7.LIZ()) {
                                    i3 = R.raw.icon_effect_rectangle_fill;
                                } else {
                                    i3 = R.raw.icon_effect_rectangle_alt_fill;
                                }
                                num = Integer.valueOf(i3);
                            } else {
                                num = null;
                            }
                            if (o.LJ(LLJLIL().mShootWay, "editing_effect_page") || o.LJ(LLJLIL().mShootWay, "editing_effect_template")) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            arrayList6.add(new C1536461g(2, i2, valueOf8, null, num, null, z2, 40));
                        }
                        arrayList2.addAll(arrayList6);
                        arrayList2.addAll(super.LLJLL());
                        VideoPublishEditModel model = LLJLIL();
                        o.LJIIIZ(model, "model");
                        if (C1533760f.LIZ(model)) {
                            Iterator it = arrayList2.iterator();
                            int i7 = 0;
                            Integer num3 = null;
                            while (it.hasNext()) {
                                Object next = it.next();
                                int i8 = i7 + 1;
                                if (i7 >= 0) {
                                    if (((C1536461g) next).LIZ == 15) {
                                        num3 = Integer.valueOf(i7);
                                    }
                                    i7 = i8;
                                } else {
                                    C47261Igj.LJJJJJ();
                                    throw null;
                                }
                            }
                            if (num3 != null) {
                                ListProtector.add(arrayList2, 0, ListProtector.remove(arrayList2, num3.intValue()));
                            }
                        }
                        C60Z.LIZ(arrayList2);
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((C1536461g) it2.next()).LIZ == 4) {
                                    break;
                                }
                                i6++;
                            } else {
                                i6 = -1;
                                break;
                            }
                        }
                        Iterator it3 = arrayList2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            Object next2 = it3.next();
                            if (((C1536461g) next2).LIZ == 26) {
                                if (next2 != null) {
                                    arrayList2.removeIf(new Predicate() { // from class: X.60i
                                        @Override // java.util.function.Predicate
                                        public final boolean test(Object obj) {
                                            C1536461g it4 = (C1536461g) obj;
                                            o.LJIIIZ(it4, "it");
                                            if (it4.LIZ == 26) {
                                                return true;
                                            }
                                            return false;
                                        }
                                    });
                                    ListProtector.add(arrayList2, i6 + 1, next2);
                                }
                            }
                        }
                    }
                    return arrayList2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(c82622Wbi);
                    o.LJIIIZ(c82622Wbi, "diContainer");
                    this.LJZL = true;
                }
            }, "EditSideToolbarComponent");
            return;
        }
        this.LJLJLLL.add(this.LJLL, new C60U(this.LJLJLJ), "EditSideToolbarComponent");
    }

    @Override // X.AbstractC165596eh
    public final WMH LJJLI() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC165596eh
    public final InterfaceC65784Pro<EditToolbarViewModel> LJJLIIIJILLIZJL() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJLJ;
    }

    public C148035rT(C82622Wbi diContainer, WMH parentScene, VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJLJ = diContainer;
        this.LJLJLLL = parentScene;
        this.LJLL = R.id.cq1;
        this.LJLLI = videoPublishEditModel;
        this.LJLLILLLL = C148045rU.LJLIL;
    }
}
