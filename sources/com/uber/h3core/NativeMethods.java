package com.uber.h3core;

import com.uber.h3core.util.GeoCoord;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes24.dex */
public final class NativeMethods {
    public native double cellAreaKm2(long j);

    public native double cellAreaM2(long j);

    public native double cellAreaRads2(long j);

    public native int compact(long[] jArr, long[] jArr2);

    public native double edgeLengthKm(int i);

    public native double edgeLengthM(int i);

    public native double exactEdgeLengthKm(long j);

    public native double exactEdgeLengthM(long j);

    public native double exactEdgeLengthRads(long j);

    public native int experimentalH3ToLocalIj(long j, long j2, int[] iArr);

    public native long experimentalLocalIjToH3(long j, int i, int i2);

    public native long geoToH3(double d, double d2, int i);

    public native long getDestinationH3IndexFromUnidirectionalEdge(long j);

    public native void getH3IndexesFromUnidirectionalEdge(long j, long[] jArr);

    public native long getH3UnidirectionalEdge(long j, long j2);

    public native int getH3UnidirectionalEdgeBoundary(long j, double[] dArr);

    public native void getH3UnidirectionalEdgesFromHexagon(long j, long[] jArr);

    public native long getOriginH3IndexFromUnidirectionalEdge(long j);

    public native void getPentagonIndexes(int i, long[] jArr);

    public native void getRes0Indexes(long[] jArr);

    public native int h3Distance(long j, long j2);

    public native int h3GetBaseCell(long j);

    public native void h3GetFaces(long j, int[] iArr);

    public native boolean h3IndexesAreNeighbors(long j, long j2);

    public native boolean h3IsPentagon(long j);

    public native boolean h3IsValid(long j);

    public native int h3Line(long j, long j2, long[] jArr);

    public native int h3LineSize(long j, long j2);

    public native void h3SetToLinkedGeo(long[] jArr, ArrayList<List<List<GeoCoord>>> arrayList);

    public native long h3ToCenterChild(long j, int i);

    public native void h3ToChildren(long j, int i, long[] jArr);

    public native void h3ToGeo(long j, double[] dArr);

    public native int h3ToGeoBoundary(long j, double[] dArr);

    public native boolean h3UnidirectionalEdgeIsValid(long j);

    public native double hexAreaKm2(int i);

    public native double hexAreaM2(int i);

    public native int hexRange(long j, int i, long[] jArr);

    public native int hexRing(long j, int i, long[] jArr);

    public native void kRing(long j, int i, long[] jArr);

    public native void kRingDistances(long j, int i, long[] jArr, int[] iArr);

    public native int maxFaceCount(long j);

    public native int maxH3ToChildrenSize(long j, int i);

    public native int maxKringSize(int i);

    public native int maxPolyfillSize(double[] dArr, int[] iArr, double[] dArr2, int i);

    public native int maxUncompactSize(long[] jArr, int i);

    public native long numHexagons(int i);

    public native double pointDistKm(double d, double d2, double d3, double d4);

    public native double pointDistM(double d, double d2, double d3, double d4);

    public native double pointDistRads(double d, double d2, double d3, double d4);

    public native void polyfill(double[] dArr, int[] iArr, double[] dArr2, int i, long[] jArr);

    public native int uncompact(long[] jArr, int i, long[] jArr2);
}
