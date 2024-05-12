package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.ugc.android.editor.core.EditorProContext;
import defpackage.g0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5kC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143525kC extends AnonymousClass503 {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C5HK.LJLIL);
    public final MutableLiveData<C143405k0> LJLILLLLZI;
    public final C143395jz LJLJI;

    public final EditorProContext LJIILJJIL() {
        return (EditorProContext) this.LJLIL.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.5jz] */
    public C143525kC() {
        MutableLiveData<C143405k0> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new C143405k0(0));
        this.LJLILLLLZI = mutableLiveData;
        this.LJLJI = new C5JL() { // from class: X.5jz
            @Override // X.C5JL
            public final void LIZ(int i, int i2, float f, String str) {
                float f2 = f;
                if (i == 4122) {
                    C143525kC c143525kC = C143525kC.this;
                    C143405k0 value = c143525kC.LJLILLLLZI.getValue();
                    if (value == null) {
                        return;
                    }
                    float f3 = value.LJLIL;
                    if (f3 >= 0.0f) {
                        f2 = (f3 + f2) / 2;
                    }
                    c143525kC.LJLILLLLZI.postValue(C143405k0.L(value, f2, 0, 0, 0.0f, 14));
                    return;
                }
                C143405k0 c143405k0 = null;
                if (i == 4162) {
                    MutableLiveData<C143405k0> mutableLiveData2 = C143525kC.this.LJLILLLLZI;
                    C143405k0 value2 = mutableLiveData2.getValue();
                    if (value2 != null) {
                        c143405k0 = C143405k0.L(value2, 0.0f, 0, 0, f2, 7);
                    }
                    mutableLiveData2.postValue(c143405k0);
                    return;
                }
                if (i == 4163) {
                    int i3 = (int) f2;
                    MutableLiveData<C143405k0> mutableLiveData3 = C143525kC.this.LJLILLLLZI;
                    C143405k0 value3 = mutableLiveData3.getValue();
                    if (value3 != null) {
                        c143405k0 = C143405k0.L(value3, 0.0f, i3, 0, 0.0f, 13);
                    }
                    mutableLiveData3.postValue(c143405k0);
                    return;
                }
                if (i != 4164) {
                    return;
                }
                int i4 = (int) f2;
                MutableLiveData<C143405k0> mutableLiveData4 = C143525kC.this.LJLILLLLZI;
                C143405k0 value4 = mutableLiveData4.getValue();
                if (value4 != null) {
                    c143405k0 = C143405k0.L(value4, 0.0f, 0, i4, 0.0f, 11);
                }
                mutableLiveData4.postValue(c143405k0);
            }
        };
    }

    @Override // X.AnonymousClass503, X.InterfaceC132255Gz
    public final void onDestroy() {
        if (LJIILJJIL().getHasInitialized()) {
            LJIILJJIL().getNleSession().V8().LJJJJJL(this.LJLJI);
        }
    }

    public final void LJIILL(VideoPublishEditModel videoPublishEditModel) {
        int i;
        float f;
        List<EditVideoSegment> videoList;
        String str;
        int i2;
        int i3;
        int i4;
        Object obj;
        int i5;
        Object obj2;
        List<EditVideoSegment> videoList2;
        long j;
        long j2;
        C143405k0 value = this.LJLILLLLZI.getValue();
        int[] LIZIZ = C43495H5f.LIZIZ(videoPublishEditModel.videoPath());
        C145995oB LJJJLIIL = H8F.LJJJLIIL(videoPublishEditModel);
        if (LIZIZ != null) {
            i = LIZIZ[7];
        } else {
            i = 0;
        }
        LJJJLIIL.LIZ(i, "file_fps");
        LJJJLIIL.LJI("creation_id", videoPublishEditModel.getCreationId());
        LJJJLIIL.LJI("shoot_way", videoPublishEditModel.mShootWay);
        if (LJIILJJIL().getHasInitialized()) {
            f = LJIILJJIL().getNleSession().P8().LJIILIIL();
        } else {
            f = 0.0f;
        }
        LJJJLIIL.LIZJ(Float.valueOf(f), "play_fps");
        LJJJLIIL.LJI("next_action", "go_edit");
        LJJJLIIL.LIZ(C44228HXk.LIZJ(), "beautify_used");
        LJJJLIIL.LJI("beautify_info", C44228HXk.LJII(C44228HXk.LIZJ));
        LJJJLIIL.LIZ(C44228HXk.LJIIIIZZ(C44228HXk.LIZJ), "is_composer");
        long j3 = 0;
        if (videoPublishEditModel.isFastImport) {
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            if (previewInfo != null && (videoList2 = previewInfo.getVideoList()) != null) {
                long j4 = 0;
                for (EditVideoSegment editVideoSegment : videoList2) {
                    VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                    if (videoCutInfo != null) {
                        j = videoCutInfo.getEnd();
                    } else {
                        j = 0;
                    }
                    VideoCutInfo videoCutInfo2 = editVideoSegment.getVideoCutInfo();
                    if (videoCutInfo2 != null) {
                        j2 = videoCutInfo2.getStart();
                    } else {
                        j2 = 0;
                    }
                    j4 += Math.max(0L, j - j2);
                }
                j3 = j4;
            }
        } else {
            EditPreviewInfo previewInfo2 = videoPublishEditModel.getPreviewInfo();
            if (previewInfo2 != null && (videoList = previewInfo2.getVideoList()) != null) {
                Iterator<EditVideoSegment> it = videoList.iterator();
                while (it.hasNext()) {
                    j3 += it.next().getVideoFileInfo().getDuration();
                }
            }
        }
        LJJJLIIL.LJI("duration", String.valueOf(j3));
        LJJJLIIL.LJI("filter_id_list", VideoPublishEditModel.translateNullFilter(videoPublishEditModel.mCurFilterIds));
        if (C44739Hh9.LIZ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LJJJLIIL.LJI("is_hardcode", str);
        LJJJLIIL.LIZ(C44739Hh9.LJII(), "video_quality");
        LJJJLIIL.LIZJ(Float.valueOf(C44739Hh9.LJI(H7R.LJJJJI(videoPublishEditModel))), "bitrate");
        if (LIZIZ != null) {
            i2 = LIZIZ[6];
        } else {
            i2 = 0;
        }
        LJJJLIIL.LIZ(i2, "file_bitrate");
        LJJJLIIL.LJI("resolution", videoPublishEditModel.getVideoResolution());
        LJJJLIIL.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
        LJJJLIIL.LJI("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
        LJJJLIIL.LJI("prop_list", videoPublishEditModel.mStickerID);
        LJJJLIIL.LJI("prop_selected_from", videoPublishEditModel.getPropSource());
        LJJJLIIL.LIZ(videoPublishEditModel.getPreviewInfo().getPreviewVideoLength(), "source_duration");
        StringBuilder LIZ = X1D.LIZ();
        if (LIZIZ != null) {
            i3 = LIZIZ[0];
        } else {
            i3 = 0;
        }
        LIZ.append(i3);
        LIZ.append('*');
        int i6 = 1;
        if (LIZIZ != null) {
            i4 = LIZIZ[1];
        } else {
            i4 = 0;
        }
        LIZ.append(i4);
        LJJJLIIL.LJI("original_resolution", X1D.LIZIZ(LIZ));
        int i7 = -1;
        if (value != null) {
            obj = Float.valueOf(value.LJLIL);
        } else {
            obj = -1;
        }
        LJJJLIIL.LIZJ(obj, "preview_fps");
        if (value != null) {
            i5 = value.LJLILLLLZI;
        } else {
            i5 = -1;
        }
        LJJJLIIL.LIZ(i5, "preview_lag_count");
        if (value != null) {
            obj2 = Float.valueOf(value.LJLJJI);
        } else {
            obj2 = -1;
        }
        LJJJLIIL.LIZJ(obj2, "preview_lag_total_duration");
        if (value != null) {
            i7 = value.LJLJI;
        }
        LJJJLIIL.LIZ(i7, "preview_serious_lag_count");
        OSZ LJJIIJ = g0.LJJIIJ(videoPublishEditModel);
        if (((Number) LJJIIJ.getSecond()).intValue() + ((Number) LJJIIJ.getFirst()).intValue() <= 1) {
            i6 = 0;
        }
        LJJJLIIL.LIZ(i6, "is_multi_content");
        java.util.Map LIZ2 = C124584uk.LIZ(LJIILJJIL());
        if (LIZ2 != null) {
            LJJJLIIL.LJFF(LIZ2);
        }
        java.util.Map<String, String> map = LJJJLIIL.LIZ;
        o.LJIIIIZZ(map, "eventMapBuilder.builder()");
        C42318GjC.LIZIZ("tool_performance_edit_preview_pro", map);
        this.LJLILLLLZI.postValue(new C143405k0(0));
    }
}
